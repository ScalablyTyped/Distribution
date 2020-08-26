package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.google_pay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePayWallet
  extends TokenizedWallet
     with CardWallet {
  var `type`: google_pay = js.native
}

object GooglePayWallet {
  @scala.inline
  def apply(`type`: google_pay): GooglePayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePayWallet]
  }
  @scala.inline
  implicit class GooglePayWalletOps[Self <: GooglePayWallet] (val x: Self) extends AnyVal {
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
    def setType(value: google_pay): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

