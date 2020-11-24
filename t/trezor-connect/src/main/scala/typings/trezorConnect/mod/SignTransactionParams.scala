package typings.trezorConnect.mod

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
  implicit class SignTransactionParamsOps[Self <: SignTransactionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoin(value: String): Self = this.set("coin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: Input*): Self = this.set("inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: js.Array[Input]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = this.set("outputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: js.Array[Output]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchId(value: Double): Self = this.set("branchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranchId: Self = this.set("branchId", js.undefined)
    
    @scala.inline
    def setExpiry(value: Double): Self = this.set("expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiry: Self = this.set("expiry", js.undefined)
    
    @scala.inline
    def setLocktime(value: Double): Self = this.set("locktime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocktime: Self = this.set("locktime", js.undefined)
    
    @scala.inline
    def setPush(value: Boolean): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    
    @scala.inline
    def setRefTxsVarargs(value: RefTransaction*): Self = this.set("refTxs", js.Array(value :_*))
    
    @scala.inline
    def setRefTxs(value: js.Array[RefTransaction]): Self = this.set("refTxs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefTxs: Self = this.set("refTxs", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
