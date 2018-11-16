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

