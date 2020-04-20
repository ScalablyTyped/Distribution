package typings.titanium.Titanium

import typings.titanium.LocationCoordinates
import typings.titanium.LocationProviderDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired when a location update is received.
	 */
trait GeolocationLocationEvent extends GeolocationBaseEvent {
  /**
  		 * if `success` is false, the error code if available.
  		 */
  var code: Double
  /**
  		 * If `success` is true, actual location data for this update.
  		 */
  var coords: LocationCoordinates
  /**
  		 * If `success` is false, a string describing the error.
  		 */
  var error: String
  /**
  		 * If `success` is true, object describing the location provider generating this update.
  		 */
  var provider: LocationProviderDict
  /**
  		 * Indicates if location data was successfully retrieved.
  		 */
  var success: Boolean
}

object GeolocationLocationEvent {
  @scala.inline
  def apply(
    code: Double,
    coords: LocationCoordinates,
    error: String,
    provider: LocationProviderDict,
    source: Geolocation,
    success: Boolean
  ): GeolocationLocationEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], coords = coords.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationLocationEvent]
  }
}

