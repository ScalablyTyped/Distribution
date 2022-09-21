package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeCoinJoin extends StObject {
  
  var address_n: js.Array[Double]
  
  var amount_unit: js.UndefOr[AmountUnit] = js.undefined
  
  var coin_name: js.UndefOr[String] = js.undefined
  
  var coordinator: String
  
  var max_coordinator_fee_rate: Double
  
  var max_fee_per_kvbyte: Double
  
  var max_rounds: Double
  
  var script_type: js.UndefOr[InputScriptType] = js.undefined
}
object AuthorizeCoinJoin {
  
  inline def apply(
    address_n: js.Array[Double],
    coordinator: String,
    max_coordinator_fee_rate: Double,
    max_fee_per_kvbyte: Double,
    max_rounds: Double
  ): AuthorizeCoinJoin = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], coordinator = coordinator.asInstanceOf[js.Any], max_coordinator_fee_rate = max_coordinator_fee_rate.asInstanceOf[js.Any], max_fee_per_kvbyte = max_fee_per_kvbyte.asInstanceOf[js.Any], max_rounds = max_rounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeCoinJoin]
  }
  
  extension [Self <: AuthorizeCoinJoin](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setAmount_unit(value: AmountUnit): Self = StObject.set(x, "amount_unit", value.asInstanceOf[js.Any])
    
    inline def setAmount_unitUndefined: Self = StObject.set(x, "amount_unit", js.undefined)
    
    inline def setCoin_name(value: String): Self = StObject.set(x, "coin_name", value.asInstanceOf[js.Any])
    
    inline def setCoin_nameUndefined: Self = StObject.set(x, "coin_name", js.undefined)
    
    inline def setCoordinator(value: String): Self = StObject.set(x, "coordinator", value.asInstanceOf[js.Any])
    
    inline def setMax_coordinator_fee_rate(value: Double): Self = StObject.set(x, "max_coordinator_fee_rate", value.asInstanceOf[js.Any])
    
    inline def setMax_fee_per_kvbyte(value: Double): Self = StObject.set(x, "max_fee_per_kvbyte", value.asInstanceOf[js.Any])
    
    inline def setMax_rounds(value: Double): Self = StObject.set(x, "max_rounds", value.asInstanceOf[js.Any])
    
    inline def setScript_type(value: InputScriptType): Self = StObject.set(x, "script_type", value.asInstanceOf[js.Any])
    
    inline def setScript_typeUndefined: Self = StObject.set(x, "script_type", js.undefined)
  }
}
