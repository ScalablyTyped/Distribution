package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object returned in the callback from the
  * [reverseGeocoder](Titanium.Geolocation.reverseGeocoder) method.
  */
trait ReverseGeocodeResponse extends js.Object {
  /**
  	 * Error code. Returns 0 if `success` is `true`.
  	 */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * An array of reverse-geocoded addresses matching the requested location.
  	 */
  var places: js.UndefOr[js.Array[GeocodedAddress]] = js.undefined
  /**
  	 * Indicates if the operation succeeded.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

object ReverseGeocodeResponse {
  @scala.inline
  def apply(
    code: scala.Int | scala.Double = null,
    error: java.lang.String = null,
    places: js.Array[GeocodedAddress] = null,
    success: js.UndefOr[scala.Boolean] = js.undefined
  ): ReverseGeocodeResponse = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (places != null) __obj.updateDynamic("places")(places)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ReverseGeocodeResponse]
  }
}

