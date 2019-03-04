package typings
package stripejsLib.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentOptions extends UpdateOptions {
  /**
    * The two letter code representing your country
    * @example 'US'
    */
  var country: java.lang.String
  /**
    * Whether or not the form should ask for the payer's email address
    * @default false
    */
  var requestPayerEmail: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not the form should ask for the payer's name
    * @default false
    */
  var requestPayerName: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not the form should ask for the payer's phone number
    * @default false
    */
  var requestPayerPhone: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not a shipping address should be requested
    * NOTE: Setting this to true requires `shippingOptions` to be set with at least one option!
    * @see shippingOptions
    */
  var requestShipping: js.UndefOr[scala.Boolean] = js.undefined
}

object StripePaymentOptions {
  @scala.inline
  def apply(
    country: java.lang.String,
    currency: java.lang.String,
    total: PaymentItem,
    displayItems: js.Array[PaymentItem] = null,
    requestPayerEmail: js.UndefOr[scala.Boolean] = js.undefined,
    requestPayerName: js.UndefOr[scala.Boolean] = js.undefined,
    requestPayerPhone: js.UndefOr[scala.Boolean] = js.undefined,
    requestShipping: js.UndefOr[scala.Boolean] = js.undefined,
    shippingOptions: js.Array[stripejsLib.shippingMod.ShippingOption] = null
  ): StripePaymentOptions = {
    val __obj = js.Dynamic.literal(country = country, currency = currency, total = total)
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems)
    if (!js.isUndefined(requestPayerEmail)) __obj.updateDynamic("requestPayerEmail")(requestPayerEmail)
    if (!js.isUndefined(requestPayerName)) __obj.updateDynamic("requestPayerName")(requestPayerName)
    if (!js.isUndefined(requestPayerPhone)) __obj.updateDynamic("requestPayerPhone")(requestPayerPhone)
    if (!js.isUndefined(requestShipping)) __obj.updateDynamic("requestShipping")(requestShipping)
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions)
    __obj.asInstanceOf[StripePaymentOptions]
  }
}

