package typings.vanillaColorful

import typings.vanillaColorful.libEntrypointsHexMod.HexBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vanilla-colorful", "HexColorPicker")
  @js.native
  open class HexColorPicker () extends HexBase
  
  object global {
    
    trait HTMLElementTagNameMap extends StObject {
      
      var `hex-color-picker`: HexColorPicker
    }
    object HTMLElementTagNameMap {
      
      inline def apply(`hex-color-picker`: HexColorPicker): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("hex-color-picker")(`hex-color-picker`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        inline def `setHex-color-picker`(value: HexColorPicker): Self = StObject.set(x, "hex-color-picker", value.asInstanceOf[js.Any])
      }
    }
  }
}
