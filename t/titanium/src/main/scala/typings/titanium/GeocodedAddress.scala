package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object representing a place, returned in the callback from the
  * [reverseGeocoder](Titanium.Geolocation.reverseGeocoder) method.
  */
trait GeocodedAddress extends js.Object {
  /**
  	 * Full address.
  	 */
  var address: js.UndefOr[String] = js.undefined
  /**
  	 * City name.
  	 */
  var city: js.UndefOr[String] = js.undefined
  /**
  	 * Country name.
  	 */
  var country: js.UndefOr[String] = js.undefined
  /**
  	 * Country code.
  	 */
  var countryCode: js.UndefOr[String] = js.undefined
  /**
  	 * Country code. To be replaced by `countryCode`.
  	 */
  var country_code: js.UndefOr[String] = js.undefined
  /**
  	 * Display address. Identical to `address`.
  	 */
  var displayAddress: js.UndefOr[String] = js.undefined
  /**
  	 * Latitude of the geocoded point.
  	 */
  var latitude: js.UndefOr[Double] = js.undefined
  /**
  	 * Longitude of the geocoded point.
  	 */
  var longitude: js.UndefOr[Double] = js.undefined
  /**
  	 * Postal code
  	 */
  var postalCode: js.UndefOr[String] = js.undefined
  /**
  	 * First line of region.
  	 */
  var region1: js.UndefOr[String] = js.undefined
  /**
  	 * Not used.
  	 */
  var region2: js.UndefOr[String] = js.undefined
  /**
  	 * Street name, without street address.
  	 */
  var street: js.UndefOr[String] = js.undefined
  /**
  	 * Street name.
  	 */
  var street1: js.UndefOr[String] = js.undefined
  /**
  	 * Postal code. To be replaced by `postalCode`
  	 */
  var zipcode: js.UndefOr[String] = js.undefined
}

object GeocodedAddress {
  @scala.inline
  def apply(
    address: String = null,
    city: String = null,
    country: String = null,
    countryCode: String = null,
    country_code: String = null,
    displayAddress: String = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    postalCode: String = null,
    region1: String = null,
    region2: String = null,
    street: String = null,
    street1: String = null,
    zipcode: String = null
  ): GeocodedAddress = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (country_code != null) __obj.updateDynamic("country_code")(country_code)
    if (displayAddress != null) __obj.updateDynamic("displayAddress")(displayAddress)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (region1 != null) __obj.updateDynamic("region1")(region1)
    if (region2 != null) __obj.updateDynamic("region2")(region2)
    if (street != null) __obj.updateDynamic("street")(street)
    if (street1 != null) __obj.updateDynamic("street1")(street1)
    if (zipcode != null) __obj.updateDynamic("zipcode")(zipcode)
    __obj.asInstanceOf[GeocodedAddress]
  }
}

