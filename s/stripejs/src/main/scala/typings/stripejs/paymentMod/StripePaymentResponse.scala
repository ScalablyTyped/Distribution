package typings.stripejs.paymentMod

import typings.stripejs.shippingMod.ShippingAddress
import typings.stripejs.shippingMod.ShippingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripePaymentResponse extends js.Object {
  /**
    * The unique name of the payment handler the customer chose to authorize payment
    * @example 'basic-card'
    */
  val methodName: String = js.native
  val payerEmail: js.UndefOr[String] = js.native
  /**
    * Information about the payer
    * NOTE: This is only set if the corresponding field was set to `true` in the `PaymentOptions`
    *
    * @see PaymentOptions.requestPayerName
    * @see PaymentOptions.requestPayerEmail
    * @see PaymentOptions.requestPayerPhone
    */
  val payerName: js.UndefOr[String] = js.native
  val payerPhone: js.UndefOr[String] = js.native
  /**
    * The shipping address the payer selected
    */
  val shippingAddress: ShippingAddress = js.native
  /**
    * The shipping option the payer selected
    */
  val shippingOption: ShippingOption = js.native
  /**
    * NOTE: Only available when the event type 'source' was used
    */
  val source: js.UndefOr[js.Any] = js.native
  /**
    * NOTE: Only available when the event type 'token' was used
    */
  val token: js.UndefOr[js.Any] = js.native
  /**
    * A function to complete the payment and give feedback to the user
    * Call this when you have processed the token data provided by the API
    *
    * @param status - The status that should be shown to the user
    */
  def complete(status: completeStatus): Unit = js.native
}

object StripePaymentResponse {
  @scala.inline
  def apply(
    complete: completeStatus => Unit,
    methodName: String,
    shippingAddress: ShippingAddress,
    shippingOption: ShippingOption
  ): StripePaymentResponse = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName.asInstanceOf[js.Any], shippingAddress = shippingAddress.asInstanceOf[js.Any], shippingOption = shippingOption.asInstanceOf[js.Any])
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
    def setComplete(value: completeStatus => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    @scala.inline
    def setShippingAddress(value: ShippingAddress): Self = this.set("shippingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setShippingOption(value: ShippingOption): Self = this.set("shippingOption", value.asInstanceOf[js.Any])
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
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setToken(value: js.Any): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

