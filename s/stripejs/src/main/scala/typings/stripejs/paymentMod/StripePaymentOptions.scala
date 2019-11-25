package typings.stripejs.paymentMod

import typings.stripejs.shippingMod.ShippingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentOptions extends UpdateOptions {
  /**
    * The two letter code representing your country
    * @example 'US'
    */
  var country: String
  /**
    * Whether or not the form should ask for the payer's email address
    * @default false
    */
  var requestPayerEmail: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the form should ask for the payer's name
    * @default false
    */
  var requestPayerName: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the form should ask for the payer's phone number
    * @default false
    */
  var requestPayerPhone: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not a shipping address should be requested
    * NOTE: Setting this to true requires `shippingOptions` to be set with at least one option!
    * @see shippingOptions
    */
  var requestShipping: js.UndefOr[Boolean] = js.undefined
}

object StripePaymentOptions {
  @scala.inline
  def apply(
    country: String,
    currency: String,
    total: PaymentItem,
    displayItems: js.Array[PaymentItem] = null,
    requestPayerEmail: js.UndefOr[Boolean] = js.undefined,
    requestPayerName: js.UndefOr[Boolean] = js.undefined,
    requestPayerPhone: js.UndefOr[Boolean] = js.undefined,
    requestShipping: js.UndefOr[Boolean] = js.undefined,
    shippingOptions: js.Array[ShippingOption] = null
  ): StripePaymentOptions = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems.asInstanceOf[js.Any])
    if (!js.isUndefined(requestPayerEmail)) __obj.updateDynamic("requestPayerEmail")(requestPayerEmail.asInstanceOf[js.Any])
    if (!js.isUndefined(requestPayerName)) __obj.updateDynamic("requestPayerName")(requestPayerName.asInstanceOf[js.Any])
    if (!js.isUndefined(requestPayerPhone)) __obj.updateDynamic("requestPayerPhone")(requestPayerPhone.asInstanceOf[js.Any])
    if (!js.isUndefined(requestShipping)) __obj.updateDynamic("requestShipping")(requestShipping.asInstanceOf[js.Any])
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripePaymentOptions]
  }
}

