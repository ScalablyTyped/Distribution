package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefTransaction extends StObject {
  
  var bin_outputs: js.Array[BinOutput]
  
  var extra_data: js.UndefOr[String] = js.undefined
  
  var hash: String
  
  var inputs: js.Array[Input]
  
  var lock_time: js.UndefOr[Double] = js.undefined
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
  
  var version_group_id: js.UndefOr[Double] = js.undefined
}
object RefTransaction {
  
  inline def apply(bin_outputs: js.Array[BinOutput], hash: String, inputs: js.Array[Input]): RefTransaction = {
    val __obj = js.Dynamic.literal(bin_outputs = bin_outputs.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefTransaction]
  }
  
  extension [Self <: RefTransaction](x: Self) {
    
    inline def setBin_outputs(value: js.Array[BinOutput]): Self = StObject.set(x, "bin_outputs", value.asInstanceOf[js.Any])
    
    inline def setBin_outputsVarargs(value: BinOutput*): Self = StObject.set(x, "bin_outputs", js.Array(value :_*))
    
    inline def setExtra_data(value: String): Self = StObject.set(x, "extra_data", value.asInstanceOf[js.Any])
    
    inline def setExtra_dataUndefined: Self = StObject.set(x, "extra_data", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: js.Array[Input]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: Input*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    inline def setLock_time(value: Double): Self = StObject.set(x, "lock_time", value.asInstanceOf[js.Any])
    
    inline def setLock_timeUndefined: Self = StObject.set(x, "lock_time", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersion_group_id(value: Double): Self = StObject.set(x, "version_group_id", value.asInstanceOf[js.Any])
    
    inline def setVersion_group_idUndefined: Self = StObject.set(x, "version_group_id", js.undefined)
  }
}
