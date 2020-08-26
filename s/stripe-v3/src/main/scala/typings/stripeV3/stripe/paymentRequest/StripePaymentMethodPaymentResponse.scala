package typings.stripeV3.stripe.paymentRequest

import typings.stripeV3.stripe.paymentMethod.PaymentMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripePaymentMethodPaymentResponse extends StripePaymentResponse {
  var paymentMethod: PaymentMethod = js.native
}

object StripePaymentMethodPaymentResponse {
  @scala.inline
  def apply(complete: String => Unit, methodName: String, paymentMethod: PaymentMethod): StripePaymentMethodPaymentResponse = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName.asInstanceOf[js.Any], paymentMethod = paymentMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripePaymentMethodPaymentResponse]
  }
  @scala.inline
  implicit class StripePaymentMethodPaymentResponseOps[Self <: StripePaymentMethodPaymentResponse] (val x: Self) extends AnyVal {
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
    def setPaymentMethod(value: PaymentMethod): Self = this.set("paymentMethod", value.asInstanceOf[js.Any])
  }
  
}

