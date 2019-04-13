package typings
package titaniumLib

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
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * City name.
  	 */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Country name.
  	 */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Country code.
  	 */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Country code. To be replaced by `countryCode`.
  	 */
  var country_code: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Display address. Identical to `address`.
  	 */
  var displayAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Latitude of the geocoded point.
  	 */
  var latitude: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Longitude of the geocoded point.
  	 */
  var longitude: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Postal code
  	 */
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * First line of region.
  	 */
  var region1: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Not used.
  	 */
  var region2: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Street name, without street address.
  	 */
  var street: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Street name.
  	 */
  var street1: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Postal code. To be replaced by `postalCode`
  	 */
  var zipcode: js.UndefOr[java.lang.String] = js.undefined
}

object GeocodedAddress {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    city: java.lang.String = null,
    country: java.lang.String = null,
    countryCode: java.lang.String = null,
    country_code: java.lang.String = null,
    displayAddress: java.lang.String = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null,
    postalCode: java.lang.String = null,
    region1: java.lang.String = null,
    region2: java.lang.String = null,
    street: java.lang.String = null,
    street1: java.lang.String = null,
    zipcode: java.lang.String = null
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

