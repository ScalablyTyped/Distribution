package typings.stripeV3.stripe.paymentRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentRequestOptions extends StripePaymentRequestUpdateOptions {
  var country: String
  var requestPayerEmail: js.UndefOr[Boolean] = js.undefined
  var requestPayerName: js.UndefOr[Boolean] = js.undefined
  var requestPayerPhone: js.UndefOr[Boolean] = js.undefined
  var requestShipping: js.UndefOr[Boolean] = js.undefined
}

object StripePaymentRequestOptions {
  @scala.inline
  def apply(
    country: String,
    currency: String,
    total: DisplayItem,
    displayItems: js.Array[DisplayItem] = null,
    requestPayerEmail: js.UndefOr[Boolean] = js.undefined,
    requestPayerName: js.UndefOr[Boolean] = js.undefined,
    requestPayerPhone: js.UndefOr[Boolean] = js.undefined,
    requestShipping: js.UndefOr[Boolean] = js.undefined,
    shippingOptions: js.Array[ShippingOption] = null
  ): StripePaymentRequestOptions = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems.asInstanceOf[js.Any])
    if (!js.isUndefined(requestPayerEmail)) __obj.updateDynamic("requestPayerEmail")(requestPayerEmail.asInstanceOf[js.Any])
    if (!js.isUndefined(requestPayerName)) __obj.updateDynamic("requestPayerName")(requestPayerName.asInstanceOf[js.Any])
    if (!js.isUndefined(requestPayerPhone)) __obj.updateDynamic("requestPayerPhone")(requestPayerPhone.asInstanceOf[js.Any])
    if (!js.isUndefined(requestShipping)) __obj.updateDynamic("requestShipping")(requestShipping.asInstanceOf[js.Any])
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripePaymentRequestOptions]
  }
}

