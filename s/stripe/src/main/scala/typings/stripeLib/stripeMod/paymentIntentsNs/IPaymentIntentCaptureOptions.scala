package typings
package stripeLib.stripeMod.paymentIntentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentCaptureOptions extends js.Object {
  /**
    * The amount to capture (in cents) from the PaymentIntent, which must be less than or equal to the original amount. Any additional amount will be automatically refunded. Defaults to the full `amount_capturable` if not provided.
    */
  var amount_to_capture: js.UndefOr[scala.Double] = js.undefined
  /**
    * The amount of the application fee (if any) that will be applied to the payment and transferred to the application owner’s Stripe account. To use an application fee, the request must be made on behalf of another account, using the `Stripe-Account` header or an OAuth key.
    */
  var application_fee_amount: js.UndefOr[scala.Double] = js.undefined
}

object IPaymentIntentCaptureOptions {
  @scala.inline
  def apply(
    amount_to_capture: scala.Int | scala.Double = null,
    application_fee_amount: scala.Int | scala.Double = null
  ): IPaymentIntentCaptureOptions = {
    val __obj = js.Dynamic.literal()
    if (amount_to_capture != null) __obj.updateDynamic("amount_to_capture")(amount_to_capture.asInstanceOf[js.Any])
    if (application_fee_amount != null) __obj.updateDynamic("application_fee_amount")(application_fee_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntentCaptureOptions]
  }
}

