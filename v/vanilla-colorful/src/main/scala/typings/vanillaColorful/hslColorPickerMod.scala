package typings.vanillaColorful

import typings.vanillaColorful.libEntrypointsHslMod.HslBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hslColorPickerMod {
  
  @JSImport("vanilla-colorful/hsl-color-picker", "HslColorPicker")
  @js.native
  open class HslColorPicker () extends HslBase
  
  object global {
    
    trait HTMLElementTagNameMap extends StObject {
      
      var `hsl-color-picker`: HslColorPicker
    }
    object HTMLElementTagNameMap {
      
      inline def apply(`hsl-color-picker`: HslColorPicker): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("hsl-color-picker")(`hsl-color-picker`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        inline def `setHsl-color-picker`(value: HslColorPicker): Self = StObject.set(x, "hsl-color-picker", value.asInstanceOf[js.Any])
      }
    }
  }
}
