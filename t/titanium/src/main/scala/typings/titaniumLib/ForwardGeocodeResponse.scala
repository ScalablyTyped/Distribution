package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Simple object returned in the callback from the
 * [forwardGeocoder](Titanium.Geolocation.forwardGeocoder) method.
 * Note that Android includes a number of extra fields.
 */

trait ForwardGeocodeResponse extends js.Object {
  /**
  	 * Estimated accuracy of the geocoding, in meters.
  	 */
  var accuracy: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Full address.
  	 */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * City name.
  	 */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Error code. Returns 0 if `success` is `true`.
  	 */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Country name.
  	 */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Country code.
  	 */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Country code. Same as `countryCode`.
  	 */
  var country_code: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Display address. Identical to `address`.
  	 */
  var displayAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Latitude of the geocoded address.
  	 */
  var latitude: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Longitude of the geocoded address.
  	 */
  var longitude: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Postal code.
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
  	 * Indicates if the operation succeeded.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

