package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoAddressParametersType extends StObject {
  
  var address_n: js.Array[Double]
  
  var address_n_staking: js.Array[Double]
  
  var address_type: CardanoAddressType
  
  var certificate_pointer: js.UndefOr[CardanoBlockchainPointerType] = js.undefined
  
  var script_payment_hash: js.UndefOr[String] = js.undefined
  
  var script_staking_hash: js.UndefOr[String] = js.undefined
  
  var staking_key_hash: js.UndefOr[String] = js.undefined
}
object CardanoAddressParametersType {
  
  inline def apply(address_n: js.Array[Double], address_n_staking: js.Array[Double], address_type: CardanoAddressType): CardanoAddressParametersType = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], address_n_staking = address_n_staking.asInstanceOf[js.Any], address_type = address_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoAddressParametersType]
  }
  
  extension [Self <: CardanoAddressParametersType](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setAddress_n_staking(value: js.Array[Double]): Self = StObject.set(x, "address_n_staking", value.asInstanceOf[js.Any])
    
    inline def setAddress_n_stakingVarargs(value: Double*): Self = StObject.set(x, "address_n_staking", js.Array(value*))
    
    inline def setAddress_type(value: CardanoAddressType): Self = StObject.set(x, "address_type", value.asInstanceOf[js.Any])
    
    inline def setCertificate_pointer(value: CardanoBlockchainPointerType): Self = StObject.set(x, "certificate_pointer", value.asInstanceOf[js.Any])
    
    inline def setCertificate_pointerUndefined: Self = StObject.set(x, "certificate_pointer", js.undefined)
    
    inline def setScript_payment_hash(value: String): Self = StObject.set(x, "script_payment_hash", value.asInstanceOf[js.Any])
    
    inline def setScript_payment_hashUndefined: Self = StObject.set(x, "script_payment_hash", js.undefined)
    
    inline def setScript_staking_hash(value: String): Self = StObject.set(x, "script_staking_hash", value.asInstanceOf[js.Any])
    
    inline def setScript_staking_hashUndefined: Self = StObject.set(x, "script_staking_hash", js.undefined)
    
    inline def setStaking_key_hash(value: String): Self = StObject.set(x, "staking_key_hash", value.asInstanceOf[js.Any])
    
    inline def setStaking_key_hashUndefined: Self = StObject.set(x, "staking_key_hash", js.undefined)
  }
}
