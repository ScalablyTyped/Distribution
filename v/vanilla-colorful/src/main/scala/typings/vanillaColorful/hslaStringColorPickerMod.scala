package typings.vanillaColorful

import typings.vanillaColorful.libEntrypointsHslaStringMod.HslaStringBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hslaStringColorPickerMod {
  
  @JSImport("vanilla-colorful/hsla-string-color-picker", "HslaStringColorPicker")
  @js.native
  open class HslaStringColorPicker () extends HslaStringBase
  
  object global {
    
    trait HTMLElementTagNameMap extends StObject {
      
      var `hsla-string-color-picker`: HslaStringColorPicker
    }
    object HTMLElementTagNameMap {
      
      inline def apply(`hsla-string-color-picker`: HslaStringColorPicker): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("hsla-string-color-picker")(`hsla-string-color-picker`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        inline def `setHsla-string-color-picker`(value: HslaStringColorPicker): Self = StObject.set(x, "hsla-string-color-picker", value.asInstanceOf[js.Any])
      }
    }
  }
}
