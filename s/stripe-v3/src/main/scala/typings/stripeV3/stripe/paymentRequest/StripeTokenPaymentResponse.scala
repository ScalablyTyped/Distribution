package typings.stripeV3.stripe.paymentRequest

import typings.stripeV3.stripe.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeTokenPaymentResponse extends StripePaymentResponse {
  var token: Token = js.native
}

object StripeTokenPaymentResponse {
  @scala.inline
  def apply(complete: String => Unit, methodName: String, token: Token): StripeTokenPaymentResponse = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeTokenPaymentResponse]
  }
  @scala.inline
  implicit class StripeTokenPaymentResponseOps[Self <: StripeTokenPaymentResponse] (val x: Self) extends AnyVal {
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
    def setToken(value: Token): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

