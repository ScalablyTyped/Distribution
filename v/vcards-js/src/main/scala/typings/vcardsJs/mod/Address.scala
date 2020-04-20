package typings.vcardsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  /**
    * City
    */
  var city: String
  /**
    * Country or region
    */
  var countryRegion: String
  /**
    * Represents the actual text that should be put on the mailing label when delivering a physical package
    */
  var label: String
  /**
    * Postal code
    */
  var postalCode: String
  /**
    * State or province
    */
  var stateProvince: String
  /**
    * Street address
    */
  var street: String
}

object Address {
  @scala.inline
  def apply(
    city: String,
    countryRegion: String,
    label: String,
    postalCode: String,
    stateProvince: String,
    street: String
  ): Address = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], countryRegion = countryRegion.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], stateProvince = stateProvince.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

