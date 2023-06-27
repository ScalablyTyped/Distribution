package typings.vanillaColorful

import typings.vanillaColorful.libEntrypointsHsvStringMod.HsvStringBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hsvStringColorPickerMod {
  
  @JSImport("vanilla-colorful/hsv-string-color-picker", "HsvStringColorPicker")
  @js.native
  open class HsvStringColorPicker () extends HsvStringBase
  
  object global {
    
    trait HTMLElementTagNameMap extends StObject {
      
      var `hsv-string-color-picker`: HsvStringColorPicker
    }
    object HTMLElementTagNameMap {
      
      inline def apply(`hsv-string-color-picker`: HsvStringColorPicker): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("hsv-string-color-picker")(`hsv-string-color-picker`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        inline def `setHsv-string-color-picker`(value: HsvStringColorPicker): Self = StObject.set(x, "hsv-string-color-picker", value.asInstanceOf[js.Any])
      }
    }
  }
}
