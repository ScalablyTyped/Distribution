package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when changes are made to the authorization status for location services.
  */
@js.native
trait GeolocationAuthorizationEvent extends GeolocationBaseEvent {
  /**
    * New authorization status for the application.
    */
  var authorizationStatus: Double = js.native
}

object GeolocationAuthorizationEvent {
  @scala.inline
  def apply(authorizationStatus: Double, source: Geolocation): GeolocationAuthorizationEvent = {
    val __obj = js.Dynamic.literal(authorizationStatus = authorizationStatus.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationAuthorizationEvent]
  }
  @scala.inline
  implicit class GeolocationAuthorizationEventOps[Self <: GeolocationAuthorizationEvent] (val x: Self) extends AnyVal {
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
    def setAuthorizationStatus(value: Double): Self = this.set("authorizationStatus", value.asInstanceOf[js.Any])
  }
  
}

