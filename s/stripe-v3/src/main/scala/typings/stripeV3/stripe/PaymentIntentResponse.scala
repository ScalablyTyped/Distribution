package typings.stripeV3.stripe

import typings.stripeV3.stripe.paymentIntents.PaymentIntent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentIntentResponse extends js.Object {
  var error: js.UndefOr[Error] = js.native
  var paymentIntent: js.UndefOr[PaymentIntent] = js.native
}

object PaymentIntentResponse {
  @scala.inline
  def apply(): PaymentIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentIntentResponse]
  }
  @scala.inline
  implicit class PaymentIntentResponseOps[Self <: PaymentIntentResponse] (val x: Self) extends AnyVal {
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
    def setPaymentIntent(value: PaymentIntent): Self = this.set("paymentIntent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentIntent: Self = this.set("paymentIntent", js.undefined)
  }
  
}

