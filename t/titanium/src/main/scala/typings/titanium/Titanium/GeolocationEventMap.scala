package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationEventMap extends ProxyEventMap {
  var authorization: GeolocationAuthorizationEvent
  var calibration: GeolocationCalibrationEvent
  var heading: GeolocationHeadingEvent
  var location: GeolocationLocationEvent
  var locationupdatepaused: GeolocationLocationupdatepausedEvent
  var locationupdateresumed: GeolocationLocationupdateresumedEvent
}

object GeolocationEventMap {
  @scala.inline
  def apply(
    authorization: GeolocationAuthorizationEvent,
    calibration: GeolocationCalibrationEvent,
    heading: GeolocationHeadingEvent,
    location: GeolocationLocationEvent,
    locationupdatepaused: GeolocationLocationupdatepausedEvent,
    locationupdateresumed: GeolocationLocationupdateresumedEvent
  ): GeolocationEventMap = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], calibration = calibration.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], locationupdatepaused = locationupdatepaused.asInstanceOf[js.Any], locationupdateresumed = locationupdateresumed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationEventMap]
  }
}

