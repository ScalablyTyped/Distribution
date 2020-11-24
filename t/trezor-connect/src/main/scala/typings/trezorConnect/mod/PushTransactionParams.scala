package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushTransactionParams extends CommonParams {
  
  var coin: String = js.native
  
  var tx: String = js.native
}
object PushTransactionParams {
  
  @scala.inline
  def apply(coin: String, tx: String): PushTransactionParams = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushTransactionParams]
  }
  
  @scala.inline
  implicit class PushTransactionParamsOps[Self <: PushTransactionParams] (val x: Self) extends AnyVal {
    
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
    def setTx(value: String): Self = this.set("tx", value.asInstanceOf[js.Any])
  }
}
