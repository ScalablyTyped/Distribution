package typings
package stripeLib.stripeMod.paymentMethodsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentMethodUpdateOptions extends js.Object {
  /** Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods. */
  var billing_details: js.UndefOr[stripeLib.Anon_AddressEmail] = js.undefined
  var card: js.UndefOr[stripeLib.Anon_Expmonth] = js.undefined
  /** Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. */
  var metadata: js.UndefOr[stripeLib.stripeMod.IMetadata] = js.undefined
}

object IPaymentMethodUpdateOptions {
  @scala.inline
  def apply(
    billing_details: stripeLib.Anon_AddressEmail = null,
    card: stripeLib.Anon_Expmonth = null,
    metadata: stripeLib.stripeMod.IMetadata = null
  ): IPaymentMethodUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details)
    if (card != null) __obj.updateDynamic("card")(card)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[IPaymentMethodUpdateOptions]
  }
}

