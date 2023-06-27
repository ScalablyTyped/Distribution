package typings.vanillaColorful

import typings.vanillaColorful.libEntrypointsHslStringMod.HslStringBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hslStringColorPickerMod {
  
  @JSImport("vanilla-colorful/hsl-string-color-picker", "HslStringColorPicker")
  @js.native
  open class HslStringColorPicker () extends HslStringBase
  
  object global {
    
    trait HTMLElementTagNameMap extends StObject {
      
      var `hsl-string-color-picker`: HslStringColorPicker
    }
    object HTMLElementTagNameMap {
      
      inline def apply(`hsl-string-color-picker`: HslStringColorPicker): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("hsl-string-color-picker")(`hsl-string-color-picker`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        inline def `setHsl-string-color-picker`(value: HslStringColorPicker): Self = StObject.set(x, "hsl-string-color-picker", value.asInstanceOf[js.Any])
      }
    }
  }
}
