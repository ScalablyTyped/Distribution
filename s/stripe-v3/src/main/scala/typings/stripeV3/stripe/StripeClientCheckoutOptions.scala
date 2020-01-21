package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeClientCheckoutOptions extends js.Object {
  var billingAddressCollection: js.UndefOr[billingAddressCollectionType] = js.undefined
  var cancelUrl: String
  var clientReferenceId: js.UndefOr[String] = js.undefined
  var customerEmail: js.UndefOr[String] = js.undefined
  var items: js.Array[StripeCheckoutItem]
  var locale: js.UndefOr[String] = js.undefined
  var successUrl: String
}

object StripeClientCheckoutOptions {
  @scala.inline
  def apply(
    cancelUrl: String,
    items: js.Array[StripeCheckoutItem],
    successUrl: String,
    billingAddressCollection: billingAddressCollectionType = null,
    clientReferenceId: String = null,
    customerEmail: String = null,
    locale: String = null
  ): StripeClientCheckoutOptions = {
    val __obj = js.Dynamic.literal(cancelUrl = cancelUrl.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], successUrl = successUrl.asInstanceOf[js.Any])
    if (billingAddressCollection != null) __obj.updateDynamic("billingAddressCollection")(billingAddressCollection.asInstanceOf[js.Any])
    if (clientReferenceId != null) __obj.updateDynamic("clientReferenceId")(clientReferenceId.asInstanceOf[js.Any])
    if (customerEmail != null) __obj.updateDynamic("customerEmail")(customerEmail.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeClientCheckoutOptions]
  }
}

