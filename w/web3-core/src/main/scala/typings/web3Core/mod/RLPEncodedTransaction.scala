package typings.web3Core.mod

import typings.web3Core.anon.Gas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RLPEncodedTransaction extends js.Object {
  var raw: String = js.native
  var tx: Gas = js.native
}

object RLPEncodedTransaction {
  @scala.inline
  def apply(raw: String, tx: Gas): RLPEncodedTransaction = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[RLPEncodedTransaction]
  }
  @scala.inline
  implicit class RLPEncodedTransactionOps[Self <: RLPEncodedTransaction] (val x: Self) extends AnyVal {
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
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setTx(value: Gas): Self = this.set("tx", value.asInstanceOf[js.Any])
  }
  
}

