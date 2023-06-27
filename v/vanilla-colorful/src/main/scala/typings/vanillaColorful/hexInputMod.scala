package typings.vanillaColorful

import typings.vanillaColorful.libEntrypointsHexInputMod.HexInputBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hexInputMod {
  
  @JSImport("vanilla-colorful/hex-input", "HexInput")
  @js.native
  open class HexInput () extends HexInputBase
  
  object global {
    
    trait HTMLElementTagNameMap extends StObject {
      
      var `hex-input`: HexInput
    }
    object HTMLElementTagNameMap {
      
      inline def apply(`hex-input`: HexInput): HTMLElementTagNameMap = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("hex-input")(`hex-input`.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElementTagNameMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
        
        inline def `setHex-input`(value: HexInput): Self = StObject.set(x, "hex-input", value.asInstanceOf[js.Any])
      }
    }
  }
}
