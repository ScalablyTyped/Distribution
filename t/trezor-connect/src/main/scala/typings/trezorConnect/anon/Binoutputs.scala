package typings.trezorConnect.anon

import typings.trezorConnect.bitcoinMod.RefTransaction
import typings.trezorConnect.protobufMod.PrevInput
import typings.trezorConnect.protobufMod.TxOutputBinType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binoutputs
  extends StObject
     with RefTransaction {
  
  var bin_outputs: js.Array[TxOutputBinType]
  
  var branch_id: js.UndefOr[Double] = js.undefined
  
  var expiry: js.UndefOr[Double] = js.undefined
  
  var extra_data: js.UndefOr[String] = js.undefined
  
  var hash: String
  
  var inputs: js.Array[PrevInput]
  
  var lock_time: Double
  
  var outputs: scala.Unit
  
  var overwintered: js.UndefOr[Boolean] = js.undefined
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var version: Double
  
  var version_group_id: js.UndefOr[Double] = js.undefined
}
object Binoutputs {
  
  inline def apply(
    bin_outputs: js.Array[TxOutputBinType],
    hash: String,
    inputs: js.Array[PrevInput],
    lock_time: Double,
    outputs: scala.Unit,
    version: Double
  ): Binoutputs = {
    val __obj = js.Dynamic.literal(bin_outputs = bin_outputs.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], lock_time = lock_time.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binoutputs]
  }
  
  extension [Self <: Binoutputs](x: Self) {
    
    inline def setBin_outputs(value: js.Array[TxOutputBinType]): Self = StObject.set(x, "bin_outputs", value.asInstanceOf[js.Any])
    
    inline def setBin_outputsVarargs(value: TxOutputBinType*): Self = StObject.set(x, "bin_outputs", js.Array(value*))
    
    inline def setBranch_id(value: Double): Self = StObject.set(x, "branch_id", value.asInstanceOf[js.Any])
    
    inline def setBranch_idUndefined: Self = StObject.set(x, "branch_id", js.undefined)
    
    inline def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setExtra_data(value: String): Self = StObject.set(x, "extra_data", value.asInstanceOf[js.Any])
    
    inline def setExtra_dataUndefined: Self = StObject.set(x, "extra_data", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: js.Array[PrevInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: PrevInput*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setLock_time(value: Double): Self = StObject.set(x, "lock_time", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: scala.Unit): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOverwintered(value: Boolean): Self = StObject.set(x, "overwintered", value.asInstanceOf[js.Any])
    
    inline def setOverwinteredUndefined: Self = StObject.set(x, "overwintered", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersion_group_id(value: Double): Self = StObject.set(x, "version_group_id", value.asInstanceOf[js.Any])
    
    inline def setVersion_group_idUndefined: Self = StObject.set(x, "version_group_id", js.undefined)
  }
}
