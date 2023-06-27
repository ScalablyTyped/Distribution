package typings.vanillaColorful

import typings.vanillaColorful.libEntrypointsRgbaStringMod.RgbaStringBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rgbaStringColorPickerMod {
  
  @JSImport("vanilla-colorful/rgba-string-color-picker", "RgbaStringColorPicker")
  @js.native
  open class RgbaStringColorPicker () extends RgbaStringBase
  
  object global {
    
    trait HTMLElementTagNameMap extends StObject {
      
      var `rgba-string-color-picker`: RgbaStringColorPicker
    }
    object HTMLElementTagNameMap {
      
      inline def apply(`rgba-string-color-picker`: RgbaStringColorPicker): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("rgba-string-color-picker")(`rgba-string-color-picker`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        inline def `setRgba-string-color-picker`(value: RgbaStringColorPicker): Self = StObject.set(x, "rgba-string-color-picker", value.asInstanceOf[js.Any])
      }
    }
  }
}
