package typings.web3Core.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedTransaction extends js.Object {
  var messageHash: js.UndefOr[String] = js.native
  var r: String = js.native
  var rawTransaction: js.UndefOr[String] = js.native
  var s: String = js.native
  var transactionHash: js.UndefOr[String] = js.native
  var v: String = js.native
}

object SignedTransaction {
  @scala.inline
  def apply(r: String, s: String, v: String): SignedTransaction = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedTransaction]
  }
  @scala.inline
  implicit class SignedTransactionOps[Self <: SignedTransaction] (val x: Self) extends AnyVal {
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
    def setR(value: String): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: String): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageHash(value: String): Self = this.set("messageHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageHash: Self = this.set("messageHash", js.undefined)
    @scala.inline
    def setRawTransaction(value: String): Self = this.set("rawTransaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawTransaction: Self = this.set("rawTransaction", js.undefined)
    @scala.inline
    def setTransactionHash(value: String): Self = this.set("transactionHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionHash: Self = this.set("transactionHash", js.undefined)
  }
  
}

