package typings
package stripejsLib.shippingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingAddress extends js.Object {
  /**
    * An array of address line items
    * @example ['185 Berry St.', 'Suite 500', 'P.O. Box 12345']
    */
  var addressLine: js.Array[java.lang.String]
  /**
    * The name of a city, town, village, etc
    */
  var city: java.lang.String
  /**
    * Two-letter country code, capitalized
    * NOTE: The codes are specified by the ISO3166 alpha-2
    */
  var country: java.lang.String
  /**
    * A logical subdivision of a city
    * NOTE: Not present on Apple platforms
    */
  var dependentLocality: java.lang.String
  /**
    * The phone number of the recipient
    * NOTE: This is only filled if `requestPayerPhone` was set to `true`
    *
    * @see PaymentOptions.requestPayerPhone
    */
  var phone: java.lang.String
  /**
    * The postal code or ZIP code
    * NOTE: This is known as the PIN code in India
    */
  var postalCode: java.lang.String
  /**
    * The name of the recipient.
    * NOTE: This might be a person, a business name, or contain “care of” (c/o) instructions
    */
  var recipient: java.lang.String
  /**
    * The most coarse subdivision of a country
    * NOTE: Depending on the country, this might correspond to a state, a province, an oblast, a prefecture,
    * or something else along these lines.
    */
  var region: java.lang.String
  /**
    * The sorting code as used in, for example, France
    * NOTE: Not present on Apple platforms
    */
  var sortingCode: java.lang.String
}

object ShippingAddress {
  @scala.inline
  def apply(
    addressLine: js.Array[java.lang.String],
    city: java.lang.String,
    country: java.lang.String,
    dependentLocality: java.lang.String,
    phone: java.lang.String,
    postalCode: java.lang.String,
    recipient: java.lang.String,
    region: java.lang.String,
    sortingCode: java.lang.String
  ): ShippingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addressLine")(addressLine)
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("dependentLocality")(dependentLocality)
    __obj.updateDynamic("phone")(phone)
    __obj.updateDynamic("postalCode")(postalCode)
    __obj.updateDynamic("recipient")(recipient)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("sortingCode")(sortingCode)
    __obj.asInstanceOf[ShippingAddress]
  }
}

