package typings.vanillaColorful

import typings.vanillaColorful.libEntrypointsHexAlphaMod.HexAlphaBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hexAlphaColorPickerMod {
  
  @JSImport("vanilla-colorful/hex-alpha-color-picker", "HexAlphaColorPicker")
  @js.native
  open class HexAlphaColorPicker () extends HexAlphaBase
  
  object global {
    
    trait HTMLElementTagNameMap extends StObject {
      
      var `hex-alpha-color-picker`: HexAlphaColorPicker
    }
    object HTMLElementTagNameMap {
      
      inline def apply(`hex-alpha-color-picker`: HexAlphaColorPicker): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("hex-alpha-color-picker")(`hex-alpha-color-picker`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        inline def `setHex-alpha-color-picker`(value: HexAlphaColorPicker): Self = StObject.set(x, "hex-alpha-color-picker", value.asInstanceOf[js.Any])
      }
    }
  }
}
