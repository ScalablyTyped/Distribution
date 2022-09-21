package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOwnershipId extends StObject {
  
  var address_n: js.Array[Double]
  
  var coin_name: js.UndefOr[String] = js.undefined
  
  var multisig: js.UndefOr[MultisigRedeemScriptType] = js.undefined
  
  var script_type: js.UndefOr[InputScriptType] = js.undefined
}
object GetOwnershipId {
  
  inline def apply(address_n: js.Array[Double]): GetOwnershipId = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOwnershipId]
  }
  
  extension [Self <: GetOwnershipId](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setCoin_name(value: String): Self = StObject.set(x, "coin_name", value.asInstanceOf[js.Any])
    
    inline def setCoin_nameUndefined: Self = StObject.set(x, "coin_name", js.undefined)
    
    inline def setMultisig(value: MultisigRedeemScriptType): Self = StObject.set(x, "multisig", value.asInstanceOf[js.Any])
    
    inline def setMultisigUndefined: Self = StObject.set(x, "multisig", js.undefined)
    
    inline def setScript_type(value: InputScriptType): Self = StObject.set(x, "script_type", value.asInstanceOf[js.Any])
    
    inline def setScript_typeUndefined: Self = StObject.set(x, "script_type", js.undefined)
  }
}
