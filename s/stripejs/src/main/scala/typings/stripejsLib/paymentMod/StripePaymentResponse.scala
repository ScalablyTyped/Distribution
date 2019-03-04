package typings
package stripejsLib.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentResponse extends js.Object {
  /**
    * The unique name of the payment handler the customer chose to authorize payment
    * @example 'basic-card'
    */
  val methodName: java.lang.String
  val payerEmail: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Information about the payer
    * NOTE: This is only set if the corresponding field was set to `true` in the `PaymentOptions`
    *
    * @see PaymentOptions.requestPayerName
    * @see PaymentOptions.requestPayerEmail
    * @see PaymentOptions.requestPayerPhone
    */
  val payerName: js.UndefOr[java.lang.String] = js.undefined
  val payerPhone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The shipping address the payer selected
    */
  val shippingAddress: stripejsLib.shippingMod.ShippingAddress
  /**
    * The shipping option the payer selected
    */
  val shippingOption: stripejsLib.shippingMod.ShippingOption
  /**
    * NOTE: Only available when the event type 'source' was used
    */
  val source: js.UndefOr[js.Any] = js.undefined
  /**
    * NOTE: Only available when the event type 'token' was used
    */
  val token: js.UndefOr[js.Any] = js.undefined
  /**
    * A function to complete the payment and give feedback to the user
    * Call this when you have processed the token data provided by the API
    *
    * @param status - The status that should be shown to the user
    */
  def complete(status: completeStatus): scala.Unit
}

object StripePaymentResponse {
  @scala.inline
  def apply(
    complete: js.Function1[completeStatus, scala.Unit],
    methodName: java.lang.String,
    shippingAddress: stripejsLib.shippingMod.ShippingAddress,
    shippingOption: stripejsLib.shippingMod.ShippingOption,
    payerEmail: java.lang.String = null,
    payerName: java.lang.String = null,
    payerPhone: java.lang.String = null,
    source: js.Any = null,
    token: js.Any = null
  ): StripePaymentResponse = {
    val __obj = js.Dynamic.literal(complete = complete, methodName = methodName, shippingAddress = shippingAddress, shippingOption = shippingOption)
    if (payerEmail != null) __obj.updateDynamic("payerEmail")(payerEmail)
    if (payerName != null) __obj.updateDynamic("payerName")(payerName)
    if (payerPhone != null) __obj.updateDynamic("payerPhone")(payerPhone)
    if (source != null) __obj.updateDynamic("source")(source)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[StripePaymentResponse]
  }
}

