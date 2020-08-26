package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionID extends js.Object {
  var txid: String = js.native
}

object TransactionID {
  @scala.inline
  def apply(txid: String): TransactionID = {
    val __obj = js.Dynamic.literal(txid = txid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionID]
  }
  @scala.inline
  implicit class TransactionIDOps[Self <: TransactionID] (val x: Self) extends AnyVal {
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
    def setTxid(value: String): Self = this.set("txid", value.asInstanceOf[js.Any])
  }
  
}

