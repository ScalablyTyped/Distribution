package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePaymentMethodOptions extends js.Object {
  /**
    * Billing information associated with the PaymentMethod
    * that may be used or required by particular types of
    * payment methods.
    */
  var billing_details: js.UndefOr[BillingDetails] = js.undefined
  var metadata: js.UndefOr[Metadata] = js.undefined
}

object CreatePaymentMethodOptions {
  @scala.inline
  def apply(billing_details: BillingDetails = null, metadata: Metadata = null): CreatePaymentMethodOptions = {
    val __obj = js.Dynamic.literal()
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePaymentMethodOptions]
  }
}

