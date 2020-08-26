package typings.stripeV3.stripe.paymentRequest

import typings.stripeV3.stripe.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeSourcePaymentResponse extends StripePaymentResponse {
  var source: Source = js.native
}

object StripeSourcePaymentResponse {
  @scala.inline
  def apply(complete: String => Unit, methodName: String, source: Source): StripeSourcePaymentResponse = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeSourcePaymentResponse]
  }
  @scala.inline
  implicit class StripeSourcePaymentResponseOps[Self <: StripeSourcePaymentResponse] (val x: Self) extends AnyVal {
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
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

