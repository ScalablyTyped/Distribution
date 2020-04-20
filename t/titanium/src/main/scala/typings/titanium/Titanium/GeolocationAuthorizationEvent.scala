package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired when changes are made to the authorization status for location services.
	 */
trait GeolocationAuthorizationEvent extends GeolocationBaseEvent {
  /**
  		 * New authorization status for the application.
  		 */
  var authorizationStatus: Double
}

object GeolocationAuthorizationEvent {
  @scala.inline
  def apply(authorizationStatus: Double, source: Geolocation): GeolocationAuthorizationEvent = {
    val __obj = js.Dynamic.literal(authorizationStatus = authorizationStatus.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationAuthorizationEvent]
  }
}

