package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptTrezorProtobufMod.TxAckResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expiry
  extends StObject
     with TxAckResponse {
  
  var branch_id: js.UndefOr[Double] = js.undefined
  
  var expiry: js.UndefOr[Double] = js.undefined
  
  var extra_data: js.UndefOr[String] = js.undefined
  
  var extra_data_len: js.UndefOr[Double] = js.undefined
  
  var inputs_cnt: Double
  
  var lock_time: js.UndefOr[Double] = js.undefined
  
  var outputs_cnt: Double
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
  
  var version_group_id: js.UndefOr[Double] = js.undefined
}
object Expiry {
  
  inline def apply(inputs_cnt: Double, outputs_cnt: Double): Expiry = {
    val __obj = js.Dynamic.literal(inputs_cnt = inputs_cnt.asInstanceOf[js.Any], outputs_cnt = outputs_cnt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expiry]
  }
  
  extension [Self <: Expiry](x: Self) {
    
    inline def setBranch_id(value: Double): Self = StObject.set(x, "branch_id", value.asInstanceOf[js.Any])
    
    inline def setBranch_idUndefined: Self = StObject.set(x, "branch_id", js.undefined)
    
    inline def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setExtra_data(value: String): Self = StObject.set(x, "extra_data", value.asInstanceOf[js.Any])
    
    inline def setExtra_dataUndefined: Self = StObject.set(x, "extra_data", js.undefined)
    
    inline def setExtra_data_len(value: Double): Self = StObject.set(x, "extra_data_len", value.asInstanceOf[js.Any])
    
    inline def setExtra_data_lenUndefined: Self = StObject.set(x, "extra_data_len", js.undefined)
    
    inline def setInputs_cnt(value: Double): Self = StObject.set(x, "inputs_cnt", value.asInstanceOf[js.Any])
    
    inline def setLock_time(value: Double): Self = StObject.set(x, "lock_time", value.asInstanceOf[js.Any])
    
    inline def setLock_timeUndefined: Self = StObject.set(x, "lock_time", js.undefined)
    
    inline def setOutputs_cnt(value: Double): Self = StObject.set(x, "outputs_cnt", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersion_group_id(value: Double): Self = StObject.set(x, "version_group_id", value.asInstanceOf[js.Any])
    
    inline def setVersion_group_idUndefined: Self = StObject.set(x, "version_group_id", js.undefined)
  }
}
