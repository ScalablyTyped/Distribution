package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignTx extends StObject {
  
  var amount_unit: js.UndefOr[AmountUnit] = js.undefined
  
  var branch_id: js.UndefOr[Double] = js.undefined
  
  var coin_name: js.UndefOr[String] = js.undefined
  
  var decred_staking_ticket: js.UndefOr[Boolean] = js.undefined
  
  var expiry: js.UndefOr[Double] = js.undefined
  
  var inputs_count: Double
  
  var lock_time: js.UndefOr[Double] = js.undefined
  
  var outputs_count: Double
  
  var overwintered: js.UndefOr[Boolean] = js.undefined
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
  
  var version_group_id: js.UndefOr[Double] = js.undefined
}
object SignTx {
  
  inline def apply(inputs_count: Double, outputs_count: Double): SignTx = {
    val __obj = js.Dynamic.literal(inputs_count = inputs_count.asInstanceOf[js.Any], outputs_count = outputs_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignTx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignTx] (val x: Self) extends AnyVal {
    
    inline def setAmount_unit(value: AmountUnit): Self = StObject.set(x, "amount_unit", value.asInstanceOf[js.Any])
    
    inline def setAmount_unitUndefined: Self = StObject.set(x, "amount_unit", js.undefined)
    
    inline def setBranch_id(value: Double): Self = StObject.set(x, "branch_id", value.asInstanceOf[js.Any])
    
    inline def setBranch_idUndefined: Self = StObject.set(x, "branch_id", js.undefined)
    
    inline def setCoin_name(value: String): Self = StObject.set(x, "coin_name", value.asInstanceOf[js.Any])
    
    inline def setCoin_nameUndefined: Self = StObject.set(x, "coin_name", js.undefined)
    
    inline def setDecred_staking_ticket(value: Boolean): Self = StObject.set(x, "decred_staking_ticket", value.asInstanceOf[js.Any])
    
    inline def setDecred_staking_ticketUndefined: Self = StObject.set(x, "decred_staking_ticket", js.undefined)
    
    inline def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setInputs_count(value: Double): Self = StObject.set(x, "inputs_count", value.asInstanceOf[js.Any])
    
    inline def setLock_time(value: Double): Self = StObject.set(x, "lock_time", value.asInstanceOf[js.Any])
    
    inline def setLock_timeUndefined: Self = StObject.set(x, "lock_time", js.undefined)
    
    inline def setOutputs_count(value: Double): Self = StObject.set(x, "outputs_count", value.asInstanceOf[js.Any])
    
    inline def setOverwintered(value: Boolean): Self = StObject.set(x, "overwintered", value.asInstanceOf[js.Any])
    
    inline def setOverwinteredUndefined: Self = StObject.set(x, "overwintered", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersion_group_id(value: Double): Self = StObject.set(x, "version_group_id", value.asInstanceOf[js.Any])
    
    inline def setVersion_group_idUndefined: Self = StObject.set(x, "version_group_id", js.undefined)
  }
}
