package typings.trezorConnect.cardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoNativeScript extends StObject {
  
  var invalidBefore: js.UndefOr[String] = js.undefined
  
  var invalidHereafter: js.UndefOr[String] = js.undefined
  
  var keyHash: js.UndefOr[String] = js.undefined
  
  var keyPath: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var requiredSignaturesCount: js.UndefOr[Double] = js.undefined
  
  var scripts: js.UndefOr[js.Array[CardanoNativeScript]] = js.undefined
  
  var `type`: typings.trezorConnect.protobufMod.CardanoNativeScriptType
}
object CardanoNativeScript {
  
  inline def apply(`type`: typings.trezorConnect.protobufMod.CardanoNativeScriptType): CardanoNativeScript = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoNativeScript]
  }
  
  extension [Self <: CardanoNativeScript](x: Self) {
    
    inline def setInvalidBefore(value: String): Self = StObject.set(x, "invalidBefore", value.asInstanceOf[js.Any])
    
    inline def setInvalidBeforeUndefined: Self = StObject.set(x, "invalidBefore", js.undefined)
    
    inline def setInvalidHereafter(value: String): Self = StObject.set(x, "invalidHereafter", value.asInstanceOf[js.Any])
    
    inline def setInvalidHereafterUndefined: Self = StObject.set(x, "invalidHereafter", js.undefined)
    
    inline def setKeyHash(value: String): Self = StObject.set(x, "keyHash", value.asInstanceOf[js.Any])
    
    inline def setKeyHashUndefined: Self = StObject.set(x, "keyHash", js.undefined)
    
    inline def setKeyPath(value: String | js.Array[Double]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    inline def setKeyPathUndefined: Self = StObject.set(x, "keyPath", js.undefined)
    
    inline def setKeyPathVarargs(value: Double*): Self = StObject.set(x, "keyPath", js.Array(value*))
    
    inline def setRequiredSignaturesCount(value: Double): Self = StObject.set(x, "requiredSignaturesCount", value.asInstanceOf[js.Any])
    
    inline def setRequiredSignaturesCountUndefined: Self = StObject.set(x, "requiredSignaturesCount", js.undefined)
    
    inline def setScripts(value: js.Array[CardanoNativeScript]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setScriptsVarargs(value: CardanoNativeScript*): Self = StObject.set(x, "scripts", js.Array(value*))
    
    inline def setType(value: typings.trezorConnect.protobufMod.CardanoNativeScriptType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
