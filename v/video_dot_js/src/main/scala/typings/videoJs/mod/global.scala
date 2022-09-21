package typings.videoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  trait Window extends StObject {
    
    var HELP_IMPROVE_VIDEOJS: Boolean
    
    /**
      * @link https://docs.videojs.com/tutorial-skins.html
      */
    var VIDEOJS_NO_DYNAMIC_STYLE: js.UndefOr[Boolean] = js.undefined
  }
  object Window {
    
    inline def apply(HELP_IMPROVE_VIDEOJS: Boolean): Window = {
      val __obj = js.Dynamic.literal(HELP_IMPROVE_VIDEOJS = HELP_IMPROVE_VIDEOJS.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    extension [Self <: Window](x: Self) {
      
      inline def setHELP_IMPROVE_VIDEOJS(value: Boolean): Self = StObject.set(x, "HELP_IMPROVE_VIDEOJS", value.asInstanceOf[js.Any])
      
      inline def setVIDEOJS_NO_DYNAMIC_STYLE(value: Boolean): Self = StObject.set(x, "VIDEOJS_NO_DYNAMIC_STYLE", value.asInstanceOf[js.Any])
      
      inline def setVIDEOJS_NO_DYNAMIC_STYLEUndefined: Self = StObject.set(x, "VIDEOJS_NO_DYNAMIC_STYLE", js.undefined)
    }
  }
}
