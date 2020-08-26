package typings.stripeV3.anon

import typings.stripeV3.stripe.paymentMethod.PaymentMethodDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Charge extends js.Object {
  var charge: js.UndefOr[String | Null] = js.native
  var payment_method_details: js.UndefOr[PaymentMethodDetails | Null] = js.native
}

object Charge {
  @scala.inline
  def apply(): Charge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Charge]
  }
  @scala.inline
  implicit class ChargeOps[Self <: Charge] (val x: Self) extends AnyVal {
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
    def setCharge(value: String): Self = this.set("charge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharge: Self = this.set("charge", js.undefined)
    @scala.inline
    def setChargeNull: Self = this.set("charge", null)
    @scala.inline
    def setPayment_method_details(value: PaymentMethodDetails): Self = this.set("payment_method_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method_details: Self = this.set("payment_method_details", js.undefined)
    @scala.inline
    def setPayment_method_detailsNull: Self = this.set("payment_method_details", null)
  }
  
}

