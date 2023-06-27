package typings.vanillaColorful

import typings.vanillaColorful.libEntrypointsHslaMod.HslaBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hslaColorPickerMod {
  
  @JSImport("vanilla-colorful/hsla-color-picker", "HslaColorPicker")
  @js.native
  open class HslaColorPicker () extends HslaBase
  
  object global {
    
    trait HTMLElementTagNameMap extends StObject {
      
      var `hsla-color-picker`: HslaColorPicker
    }
    object HTMLElementTagNameMap {
      
      inline def apply(`hsla-color-picker`: HslaColorPicker): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("hsla-color-picker")(`hsla-color-picker`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        inline def `setHsla-color-picker`(value: HslaColorPicker): Self = StObject.set(x, "hsla-color-picker", value.asInstanceOf[js.Any])
      }
    }
  }
}
