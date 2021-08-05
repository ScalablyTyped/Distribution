package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignTransactionParams
  extends StObject
     with CommonParams {
  
  var branchId: js.UndefOr[Double] = js.undefined
  
  var coin: String
  
  var expiry: js.UndefOr[Double] = js.undefined
  
  var inputs: js.Array[Input]
  
  var locktime: js.UndefOr[Double] = js.undefined
  
  var outputs: js.Array[Output]
  
  var push: js.UndefOr[Boolean] = js.undefined
  
  var refTxs: js.UndefOr[js.Array[RefTransaction]] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object SignTransactionParams {
  
  inline def apply(coin: String, inputs: js.Array[Input], outputs: js.Array[Output]): SignTransactionParams = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignTransactionParams]
  }
  
  extension [Self <: SignTransactionParams](x: Self) {
    
    inline def setBranchId(value: Double): Self = StObject.set(x, "branchId", value.asInstanceOf[js.Any])
    
    inline def setBranchIdUndefined: Self = StObject.set(x, "branchId", js.undefined)
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setInputs(value: js.Array[Input]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: Input*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    inline def setLocktime(value: Double): Self = StObject.set(x, "locktime", value.asInstanceOf[js.Any])
    
    inline def setLocktimeUndefined: Self = StObject.set(x, "locktime", js.undefined)
    
    inline def setOutputs(value: js.Array[Output]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: Output*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    inline def setRefTxs(value: js.Array[RefTransaction]): Self = StObject.set(x, "refTxs", value.asInstanceOf[js.Any])
    
    inline def setRefTxsUndefined: Self = StObject.set(x, "refTxs", js.undefined)
    
    inline def setRefTxsVarargs(value: RefTransaction*): Self = StObject.set(x, "refTxs", js.Array(value :_*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
