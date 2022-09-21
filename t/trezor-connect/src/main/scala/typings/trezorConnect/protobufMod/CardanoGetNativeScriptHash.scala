package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoGetNativeScriptHash extends StObject {
  
  var derivation_type: CardanoDerivationType
  
  var display_format: CardanoNativeScriptHashDisplayFormat
  
  var script: CardanoNativeScript
}
object CardanoGetNativeScriptHash {
  
  inline def apply(
    derivation_type: CardanoDerivationType,
    display_format: CardanoNativeScriptHashDisplayFormat,
    script: CardanoNativeScript
  ): CardanoGetNativeScriptHash = {
    val __obj = js.Dynamic.literal(derivation_type = derivation_type.asInstanceOf[js.Any], display_format = display_format.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoGetNativeScriptHash]
  }
  
  extension [Self <: CardanoGetNativeScriptHash](x: Self) {
    
    inline def setDerivation_type(value: CardanoDerivationType): Self = StObject.set(x, "derivation_type", value.asInstanceOf[js.Any])
    
    inline def setDisplay_format(value: CardanoNativeScriptHashDisplayFormat): Self = StObject.set(x, "display_format", value.asInstanceOf[js.Any])
    
    inline def setScript(value: CardanoNativeScript): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
