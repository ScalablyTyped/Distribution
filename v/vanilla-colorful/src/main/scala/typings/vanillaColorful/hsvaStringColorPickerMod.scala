package typings.vanillaColorful

import typings.vanillaColorful.libEntrypointsHsvaStringMod.HsvaStringBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hsvaStringColorPickerMod {
  
  @JSImport("vanilla-colorful/hsva-string-color-picker", "HsvaStringColorPicker")
  @js.native
  open class HsvaStringColorPicker () extends HsvaStringBase
  
  object global {
    
    trait HTMLElementTagNameMap extends StObject {
      
      var `hsva-string-color-picker`: HsvaStringColorPicker
    }
    object HTMLElementTagNameMap {
      
      inline def apply(`hsva-string-color-picker`: HsvaStringColorPicker): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("hsva-string-color-picker")(`hsva-string-color-picker`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        inline def `setHsva-string-color-picker`(value: HsvaStringColorPicker): Self = StObject.set(x, "hsva-string-color-picker", value.asInstanceOf[js.Any])
      }
    }
  }
}
