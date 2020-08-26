package typings.stripe.mod.paymentMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenizedWallet extends js.Object {
  /** (For tokenized numbers only.) The last four digits of the device account number. */
  var dynamic_last4: js.UndefOr[String] = js.native
}

object TokenizedWallet {
  @scala.inline
  def apply(): TokenizedWallet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenizedWallet]
  }
  @scala.inline
  implicit class TokenizedWalletOps[Self <: TokenizedWallet] (val x: Self) extends AnyVal {
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
    def setDynamic_last4(value: String): Self = this.set("dynamic_last4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamic_last4: Self = this.set("dynamic_last4", js.undefined)
  }
  
}

