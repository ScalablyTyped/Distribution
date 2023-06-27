package typings.vanillaColorful

import typings.vanillaColorful.libEntrypointsRgbaMod.RgbaBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rgbaColorPickerMod {
  
  @JSImport("vanilla-colorful/rgba-color-picker", "RgbaColorPicker")
  @js.native
  open class RgbaColorPicker () extends RgbaBase
  
  object global {
    
    trait HTMLElementTagNameMap extends StObject {
      
      var `rgba-color-picker`: RgbaColorPicker
    }
    object HTMLElementTagNameMap {
      
      inline def apply(`rgba-color-picker`: RgbaColorPicker): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("rgba-color-picker")(`rgba-color-picker`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        inline def `setRgba-color-picker`(value: RgbaColorPicker): Self = StObject.set(x, "rgba-color-picker", value.asInstanceOf[js.Any])
      }
    }
  }
}
