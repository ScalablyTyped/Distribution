package typings.stripejs.shippingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingAddress extends js.Object {
  /**
    * An array of address line items
    * @example ['185 Berry St.', 'Suite 500', 'P.O. Box 12345']
    */
  var addressLine: js.Array[String]
  /**
    * The name of a city, town, village, etc
    */
  var city: String
  /**
    * Two-letter country code, capitalized
    * NOTE: The codes are specified by the ISO3166 alpha-2
    */
  var country: String
  /**
    * A logical subdivision of a city
    * NOTE: Not present on Apple platforms
    */
  var dependentLocality: String
  /**
    * The phone number of the recipient
    * NOTE: This is only filled if `requestPayerPhone` was set to `true`
    *
    * @see PaymentOptions.requestPayerPhone
    */
  var phone: String
  /**
    * The postal code or ZIP code
    * NOTE: This is known as the PIN code in India
    */
  var postalCode: String
  /**
    * The name of the recipient.
    * NOTE: This might be a person, a business name, or contain “care of” (c/o) instructions
    */
  var recipient: String
  /**
    * The most coarse subdivision of a country
    * NOTE: Depending on the country, this might correspond to a state, a province, an oblast, a prefecture,
    * or something else along these lines.
    */
  var region: String
  /**
    * The sorting code as used in, for example, France
    * NOTE: Not present on Apple platforms
    */
  var sortingCode: String
}

object ShippingAddress {
  @scala.inline
  def apply(
    addressLine: js.Array[String],
    city: String,
    country: String,
    dependentLocality: String,
    phone: String,
    postalCode: String,
    recipient: String,
    region: String,
    sortingCode: String
  ): ShippingAddress = {
    val __obj = js.Dynamic.literal(addressLine = addressLine.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], dependentLocality = dependentLocality.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], sortingCode = sortingCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingAddress]
  }
}

