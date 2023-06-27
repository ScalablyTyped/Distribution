package typings.vanillaColorful

import typings.vanillaColorful.libEntrypointsRgbStringMod.RgbStringBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rgbStringColorPickerMod {
  
  @JSImport("vanilla-colorful/rgb-string-color-picker", "RgbStringColorPicker")
  @js.native
  open class RgbStringColorPicker () extends RgbStringBase
  
  object global {
    
    trait HTMLElementTagNameMap extends StObject {
      
      var `rgb-string-color-picker`: RgbStringColorPicker
    }
    object HTMLElementTagNameMap {
      
      inline def apply(`rgb-string-color-picker`: RgbStringColorPicker): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("rgb-string-color-picker")(`rgb-string-color-picker`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        inline def `setRgb-string-color-picker`(value: RgbStringColorPicker): Self = StObject.set(x, "rgb-string-color-picker", value.asInstanceOf[js.Any])
      }
    }
  }
}
