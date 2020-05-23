package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object returned in the callback from the
  * [reverseGeocoder](Titanium.Geolocation.reverseGeocoder) method.
  */
trait ReverseGeocodeResponse extends ErrorResponse {
  /**
    * An array of reverse-geocoded addresses matching the requested location.
    */
  var places: js.UndefOr[js.Array[GeocodedAddress]] = js.undefined
}

object ReverseGeocodeResponse {
  @scala.inline
  def apply(
    code: js.UndefOr[Double] = js.undefined,
    error: java.lang.String = null,
    places: js.Array[GeocodedAddress] = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): ReverseGeocodeResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (places != null) __obj.updateDynamic("places")(places.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseGeocodeResponse]
  }
}

