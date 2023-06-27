package typings.vanillaColorful

import typings.vanillaColorful.libEntrypointsHsvMod.HsvBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hsvColorPickerMod {
  
  @JSImport("vanilla-colorful/hsv-color-picker", "HsvColorPicker")
  @js.native
  open class HsvColorPicker () extends HsvBase
  
  object global {
    
    trait HTMLElementTagNameMap extends StObject {
      
      var `hsv-color-picker`: HsvColorPicker
    }
    object HTMLElementTagNameMap {
      
      inline def apply(`hsv-color-picker`: HsvColorPicker): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("hsv-color-picker")(`hsv-color-picker`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        inline def `setHsv-color-picker`(value: HsvColorPicker): Self = StObject.set(x, "hsv-color-picker", value.asInstanceOf[js.Any])
      }
    }
  }
}
