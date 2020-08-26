package typings.stripeV3.stripe

import typings.stripeV3.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmCardSetupData extends js.Object {
  /*
    * Pass an object to confirm using data collected by a card or
    * cardNumber Element or an with an existing token and to supply
    * additional data relevant to the PaymentMethod, such as billing
    * details:
    */
  var payment_method: js.UndefOr[String | `0`] = js.native
}

object ConfirmCardSetupData {
  @scala.inline
  def apply(): ConfirmCardSetupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmCardSetupData]
  }
  @scala.inline
  implicit class ConfirmCardSetupDataOps[Self <: ConfirmCardSetupData] (val x: Self) extends AnyVal {
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
    def setPayment_method(value: String | `0`): Self = this.set("payment_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method: Self = this.set("payment_method", js.undefined)
  }
  
}

