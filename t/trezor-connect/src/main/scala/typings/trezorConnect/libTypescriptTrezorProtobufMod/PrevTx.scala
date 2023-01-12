package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrevTx extends StObject {
  
  var branch_id: js.UndefOr[Double] = js.undefined
  
  var expiry: js.UndefOr[Double] = js.undefined
  
  var extra_data_len: js.UndefOr[Double] = js.undefined
  
  var inputs_count: Double
  
  var lock_time: Double
  
  var outputs_count: Double
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var version: Double
  
  var version_group_id: js.UndefOr[Double] = js.undefined
}
object PrevTx {
  
  inline def apply(inputs_count: Double, lock_time: Double, outputs_count: Double, version: Double): PrevTx = {
    val __obj = js.Dynamic.literal(inputs_count = inputs_count.asInstanceOf[js.Any], lock_time = lock_time.asInstanceOf[js.Any], outputs_count = outputs_count.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevTx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrevTx] (val x: Self) extends AnyVal {
    
    inline def setBranch_id(value: Double): Self = StObject.set(x, "branch_id", value.asInstanceOf[js.Any])
    
    inline def setBranch_idUndefined: Self = StObject.set(x, "branch_id", js.undefined)
    
    inline def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setExtra_data_len(value: Double): Self = StObject.set(x, "extra_data_len", value.asInstanceOf[js.Any])
    
    inline def setExtra_data_lenUndefined: Self = StObject.set(x, "extra_data_len", js.undefined)
    
    inline def setInputs_count(value: Double): Self = StObject.set(x, "inputs_count", value.asInstanceOf[js.Any])
    
    inline def setLock_time(value: Double): Self = StObject.set(x, "lock_time", value.asInstanceOf[js.Any])
    
    inline def setOutputs_count(value: Double): Self = StObject.set(x, "outputs_count", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersion_group_id(value: Double): Self = StObject.set(x, "version_group_id", value.asInstanceOf[js.Any])
    
    inline def setVersion_group_idUndefined: Self = StObject.set(x, "version_group_id", js.undefined)
  }
}
