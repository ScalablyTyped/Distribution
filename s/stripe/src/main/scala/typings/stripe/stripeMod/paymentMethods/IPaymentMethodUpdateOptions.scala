package typings.stripe.stripeMod.paymentMethods

import typings.stripe.Anon_Address
import typings.stripe.Anon_Expmonth
import typings.stripe.stripeMod.IMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentMethodUpdateOptions extends js.Object {
  /** Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods. */
  var billing_details: js.UndefOr[Anon_Address] = js.undefined
  var card: js.UndefOr[Anon_Expmonth] = js.undefined
  /** Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. */
  var metadata: js.UndefOr[IMetadata] = js.undefined
}

object IPaymentMethodUpdateOptions {
  @scala.inline
  def apply(billing_details: Anon_Address = null, card: Anon_Expmonth = null, metadata: IMetadata = null): IPaymentMethodUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodUpdateOptions]
  }
}

