package typings.stripe.mod.paymentIntents

import typings.stripe.mod.setupIntents.ISetupIntentTransferData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentCaptureOptions extends js.Object {
  /**
    * The amount to capture (in cents) from the PaymentIntent, which must be less than or equal to the original amount. Any additional amount will be automatically refunded. Defaults to the full `amount_capturable` if not provided.
    */
  var amount_to_capture: js.UndefOr[Double] = js.undefined
  /**
    * The amount of the application fee (if any) that will be applied to the payment and transferred to the application owner’s Stripe account. To use an application fee, the request must be made on behalf of another account, using the `Stripe-Account` header or an OAuth key.
    */
  var application_fee_amount: js.UndefOr[Double] = js.undefined
  /**
    * The account (if any) for which the funds of the PaymentIntent are intended. Used with connected accounts.
    */
  var on_behalf_of: js.UndefOr[String] = js.undefined
  /**
    * The data with which to automatically create a Transfer when the payment is finalized. Used with connected accounts.
    */
  var transfer_data: js.UndefOr[ISetupIntentTransferData] = js.undefined
}

object IPaymentIntentCaptureOptions {
  @scala.inline
  def apply(
    amount_to_capture: Int | Double = null,
    application_fee_amount: Int | Double = null,
    on_behalf_of: String = null,
    transfer_data: ISetupIntentTransferData = null
  ): IPaymentIntentCaptureOptions = {
    val __obj = js.Dynamic.literal()
    if (amount_to_capture != null) __obj.updateDynamic("amount_to_capture")(amount_to_capture.asInstanceOf[js.Any])
    if (application_fee_amount != null) __obj.updateDynamic("application_fee_amount")(application_fee_amount.asInstanceOf[js.Any])
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of.asInstanceOf[js.Any])
    if (transfer_data != null) __obj.updateDynamic("transfer_data")(transfer_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntentCaptureOptions]
  }
}

