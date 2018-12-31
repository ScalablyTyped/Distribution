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
  	 * Country code. On iOS, use `country_code`.
  	 */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Country code. Same as `country_code`.
  	 */
  var country_code: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Display address. Identical to `address`.
  	 */
  var displayAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Latitude of the geocoded point.
  	 */
  var latitude: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Longitude of the geocoded point.
  	 */
  var longitude: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Postal code. On iOS, use `zipcode`.
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
  	 * Postal code. On Android, use `postalCode`.
  	 */
  var zipcode: js.UndefOr[java.lang.String] = js.undefined
}

