package typings.stripeV3.stripe

import typings.stripeV3.stripe.paymentMethod.PaymentMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodResponse extends js.Object {
  var error: js.UndefOr[Error] = js.native
  var paymentMethod: js.UndefOr[PaymentMethod] = js.native
}

object PaymentMethodResponse {
  @scala.inline
  def apply(): PaymentMethodResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentMethodResponse]
  }
  @scala.inline
  implicit class PaymentMethodResponseOps[Self <: PaymentMethodResponse] (val x: Self) extends AnyVal {
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
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setPaymentMethod(value: PaymentMethod): Self = this.set("paymentMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentMethod: Self = this.set("paymentMethod", js.undefined)
  }
  
}

