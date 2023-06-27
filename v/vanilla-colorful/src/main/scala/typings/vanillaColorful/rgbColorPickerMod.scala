package typings.vanillaColorful

import typings.vanillaColorful.libEntrypointsRgbMod.RgbBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rgbColorPickerMod {
  
  @JSImport("vanilla-colorful/rgb-color-picker", "RgbColorPicker")
  @js.native
  open class RgbColorPicker () extends RgbBase
  
  object global {
    
    trait HTMLElementTagNameMap extends StObject {
      
      var `rgb-color-picker`: RgbColorPicker
    }
    object HTMLElementTagNameMap {
      
      inline def apply(`rgb-color-picker`: RgbColorPicker): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("rgb-color-picker")(`rgb-color-picker`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        inline def `setRgb-color-picker`(value: RgbColorPicker): Self = StObject.set(x, "rgb-color-picker", value.asInstanceOf[js.Any])
      }
    }
  }
}
