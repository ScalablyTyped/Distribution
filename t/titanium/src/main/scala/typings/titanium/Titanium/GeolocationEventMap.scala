package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeolocationEventMap extends ProxyEventMap {
  var authorization: GeolocationAuthorizationEvent = js.native
  var calibration: GeolocationCalibrationEvent = js.native
  var heading: GeolocationHeadingEvent = js.native
  var location: GeolocationLocationEvent = js.native
  var locationupdatepaused: GeolocationLocationupdatepausedEvent = js.native
  var locationupdateresumed: GeolocationLocationupdateresumedEvent = js.native
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
  @scala.inline
  implicit class GeolocationEventMapOps[Self <: GeolocationEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthorization(value: GeolocationAuthorizationEvent): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def setCalibration(value: GeolocationCalibrationEvent): Self = this.set("calibration", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeading(value: GeolocationHeadingEvent): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: GeolocationLocationEvent): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationupdatepaused(value: GeolocationLocationupdatepausedEvent): Self = this.set("locationupdatepaused", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationupdateresumed(value: GeolocationLocationupdateresumedEvent): Self = this.set("locationupdateresumed", value.asInstanceOf[js.Any])
  }
  
}

