package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignTransactionParams extends CommonParams {
  
  var branchId: js.UndefOr[Double] = js.native
  
  var coin: String = js.native
  
  var expiry: js.UndefOr[Double] = js.native
  
  var inputs: js.Array[Input] = js.native
  
  var locktime: js.UndefOr[Double] = js.native
  
  var outputs: js.Array[Output] = js.native
  
  var push: js.UndefOr[Boolean] = js.native
  
  var refTxs: js.UndefOr[js.Array[RefTransaction]] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object SignTransactionParams {
  
  @scala.inline
  def apply(coin: String, inputs: js.Array[Input], outputs: js.Array[Output]): SignTransactionParams = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignTransactionParams]
  }
  
  @scala.inline
  implicit class SignTransactionParamsMutableBuilder[Self <: SignTransactionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchId(value: Double): Self = StObject.set(x, "branchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchIdUndefined: Self = StObject.set(x, "branchId", js.undefined)
    
    @scala.inline
    def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    @scala.inline
    def setInputs(value: js.Array[Input]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: Input*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setLocktime(value: Double): Self = StObject.set(x, "locktime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocktimeUndefined: Self = StObject.set(x, "locktime", js.undefined)
    
    @scala.inline
    def setOutputs(value: js.Array[Output]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    @scala.inline
    def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    @scala.inline
    def setRefTxs(value: js.Array[RefTransaction]): Self = StObject.set(x, "refTxs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefTxsUndefined: Self = StObject.set(x, "refTxs", js.undefined)
    
    @scala.inline
    def setRefTxsVarargs(value: RefTransaction*): Self = StObject.set(x, "refTxs", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
