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
  
  @scala.inline
  def apply(bin_outputs: js.Array[BinOutput], hash: String, inputs: js.Array[Input]): RefTransaction = {
    val __obj = js.Dynamic.literal(bin_outputs = bin_outputs.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefTransaction]
  }
  
  @scala.inline
  implicit class RefTransactionMutableBuilder[Self <: RefTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBin_outputs(value: js.Array[BinOutput]): Self = StObject.set(x, "bin_outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBin_outputsVarargs(value: BinOutput*): Self = StObject.set(x, "bin_outputs", js.Array(value :_*))
    
    @scala.inline
    def setExtra_data(value: String): Self = StObject.set(x, "extra_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra_dataUndefined: Self = StObject.set(x, "extra_data", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: js.Array[Input]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: Input*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setLock_time(value: Double): Self = StObject.set(x, "lock_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLock_timeUndefined: Self = StObject.set(x, "lock_time", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVersion_group_id(value: Double): Self = StObject.set(x, "version_group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion_group_idUndefined: Self = StObject.set(x, "version_group_id", js.undefined)
  }
}
