package typings.vanillaColorful

import typings.vanillaColorful.libEntrypointsHsvaMod.HsvaBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hsvaColorPickerMod {
  
  @JSImport("vanilla-colorful/hsva-color-picker", "HsvaColorPicker")
  @js.native
  open class HsvaColorPicker () extends HsvaBase
  
  object global {
    
    trait HTMLElementTagNameMap extends StObject {
      
      var `hsva-color-picker`: HsvaColorPicker
    }
    object HTMLElementTagNameMap {
      
      inline def apply(`hsva-color-picker`: HsvaColorPicker): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("hsva-color-picker")(`hsva-color-picker`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        inline def `setHsva-color-picker`(value: HsvaColorPicker): Self = StObject.set(x, "hsva-color-picker", value.asInstanceOf[js.Any])
      }
    }
  }
}
