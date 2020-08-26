package typings.stripeV3.stripe.paymentRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripePaymentResponse extends js.Object {
  var methodName: String = js.native
  var payerEmail: js.UndefOr[String] = js.native
  var payerName: js.UndefOr[String] = js.native
  var payerPhone: js.UndefOr[String] = js.native
  var shippingAddress: js.UndefOr[ShippingAddress] = js.native
  var shippingOption: js.UndefOr[ShippingOption] = js.native
  def complete(status: String): Unit = js.native
}

object StripePaymentResponse {
  @scala.inline
  def apply(complete: String => Unit, methodName: String): StripePaymentResponse = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripePaymentResponse]
  }
  @scala.inline
  implicit class StripePaymentResponseOps[Self <: StripePaymentResponse] (val x: Self) extends AnyVal {
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
    def setComplete(value: String => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayerEmail(value: String): Self = this.set("payerEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayerEmail: Self = this.set("payerEmail", js.undefined)
    @scala.inline
    def setPayerName(value: String): Self = this.set("payerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayerName: Self = this.set("payerName", js.undefined)
    @scala.inline
    def setPayerPhone(value: String): Self = this.set("payerPhone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayerPhone: Self = this.set("payerPhone", js.undefined)
    @scala.inline
    def setShippingAddress(value: ShippingAddress): Self = this.set("shippingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingAddress: Self = this.set("shippingAddress", js.undefined)
    @scala.inline
    def setShippingOption(value: ShippingOption): Self = this.set("shippingOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingOption: Self = this.set("shippingOption", js.undefined)
  }
  
}

