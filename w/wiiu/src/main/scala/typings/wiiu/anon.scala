package typings.wiiu

import typings.wiiu.wiiu.ImageView
import typings.wiiu.wiiu.VideoPlayer
import typings.wiiu.wiiu.WiiuGamePad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Typeofwiiu extends StObject {
    
    var gamepad: WiiuGamePad
    
    var imageview: ImageView
    
    var videoplayer: VideoPlayer
  }
  object Typeofwiiu {
    
    inline def apply(gamepad: WiiuGamePad, imageview: ImageView, videoplayer: VideoPlayer): Typeofwiiu = {
      val __obj = js.Dynamic.literal(gamepad = gamepad.asInstanceOf[js.Any], imageview = imageview.asInstanceOf[js.Any], videoplayer = videoplayer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofwiiu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Typeofwiiu] (val x: Self) extends AnyVal {
      
      inline def setGamepad(value: WiiuGamePad): Self = StObject.set(x, "gamepad", value.asInstanceOf[js.Any])
      
      inline def setImageview(value: ImageView): Self = StObject.set(x, "imageview", value.asInstanceOf[js.Any])
      
      inline def setVideoplayer(value: VideoPlayer): Self = StObject.set(x, "videoplayer", value.asInstanceOf[js.Any])
    }
  }
}
