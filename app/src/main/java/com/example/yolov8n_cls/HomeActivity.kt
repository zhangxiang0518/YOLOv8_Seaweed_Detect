package com.example.yolov8n_cls

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val magnifierButton: ImageButton = findViewById(R.id.magnifierButton)
        magnifierButton.setOnClickListener {
            // Start MainActivity on click
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

