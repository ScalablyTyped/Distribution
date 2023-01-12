package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptNetworksBitcoinMod.RefTransaction
import typings.trezorConnect.libTypescriptTrezorProtobufMod.TxInput
import typings.trezorConnect.libTypescriptTrezorProtobufMod.TxOutputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Branchid
  extends StObject
     with RefTransaction {
  
  var bin_outputs: scala.Unit
  
  var branch_id: js.UndefOr[Double] = js.undefined
  
  var expiry: js.UndefOr[Double] = js.undefined
  
  var extra_data: js.UndefOr[String] = js.undefined
  
  var hash: String
  
  var inputs: js.Array[TxInput]
  
  var lock_time: Double
  
  var outputs: js.Array[TxOutputType]
  
  var overwintered: js.UndefOr[Boolean] = js.undefined
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var version: Double
  
  var version_group_id: js.UndefOr[Double] = js.undefined
}
object Branchid {
  
  inline def apply(
    bin_outputs: scala.Unit,
    hash: String,
    inputs: js.Array[TxInput],
    lock_time: Double,
    outputs: js.Array[TxOutputType],
    version: Double
  ): Branchid = {
    val __obj = js.Dynamic.literal(bin_outputs = bin_outputs.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], lock_time = lock_time.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branchid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Branchid] (val x: Self) extends AnyVal {
    
    inline def setBin_outputs(value: scala.Unit): Self = StObject.set(x, "bin_outputs", value.asInstanceOf[js.Any])
    
    inline def setBranch_id(value: Double): Self = StObject.set(x, "branch_id", value.asInstanceOf[js.Any])
    
    inline def setBranch_idUndefined: Self = StObject.set(x, "branch_id", js.undefined)
    
    inline def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setExtra_data(value: String): Self = StObject.set(x, "extra_data", value.asInstanceOf[js.Any])
    
    inline def setExtra_dataUndefined: Self = StObject.set(x, "extra_data", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: js.Array[TxInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: TxInput*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setLock_time(value: Double): Self = StObject.set(x, "lock_time", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: js.Array[TxOutputType]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: TxOutputType*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setOverwintered(value: Boolean): Self = StObject.set(x, "overwintered", value.asInstanceOf[js.Any])
    
    inline def setOverwinteredUndefined: Self = StObject.set(x, "overwintered", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersion_group_id(value: Double): Self = StObject.set(x, "version_group_id", value.asInstanceOf[js.Any])
    
    inline def setVersion_group_idUndefined: Self = StObject.set(x, "version_group_id", js.undefined)
  }
}
