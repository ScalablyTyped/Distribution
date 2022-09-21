package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOwnershipProof extends StObject {
  
  var address_n: js.Array[Double]
  
  var coin_name: js.UndefOr[String] = js.undefined
  
  var commitment_data: js.UndefOr[String] = js.undefined
  
  var multisig: js.UndefOr[MultisigRedeemScriptType] = js.undefined
  
  var ownership_ids: js.Array[String]
  
  var script_type: js.UndefOr[InputScriptType] = js.undefined
  
  var user_confirmation: js.UndefOr[Boolean] = js.undefined
}
object GetOwnershipProof {
  
  inline def apply(address_n: js.Array[Double], ownership_ids: js.Array[String]): GetOwnershipProof = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], ownership_ids = ownership_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOwnershipProof]
  }
  
  extension [Self <: GetOwnershipProof](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setCoin_name(value: String): Self = StObject.set(x, "coin_name", value.asInstanceOf[js.Any])
    
    inline def setCoin_nameUndefined: Self = StObject.set(x, "coin_name", js.undefined)
    
    inline def setCommitment_data(value: String): Self = StObject.set(x, "commitment_data", value.asInstanceOf[js.Any])
    
    inline def setCommitment_dataUndefined: Self = StObject.set(x, "commitment_data", js.undefined)
    
    inline def setMultisig(value: MultisigRedeemScriptType): Self = StObject.set(x, "multisig", value.asInstanceOf[js.Any])
    
    inline def setMultisigUndefined: Self = StObject.set(x, "multisig", js.undefined)
    
    inline def setOwnership_ids(value: js.Array[String]): Self = StObject.set(x, "ownership_ids", value.asInstanceOf[js.Any])
    
    inline def setOwnership_idsVarargs(value: String*): Self = StObject.set(x, "ownership_ids", js.Array(value*))
    
    inline def setScript_type(value: InputScriptType): Self = StObject.set(x, "script_type", value.asInstanceOf[js.Any])
    
    inline def setScript_typeUndefined: Self = StObject.set(x, "script_type", js.undefined)
    
    inline def setUser_confirmation(value: Boolean): Self = StObject.set(x, "user_confirmation", value.asInstanceOf[js.Any])
    
    inline def setUser_confirmationUndefined: Self = StObject.set(x, "user_confirmation", js.undefined)
  }
}
