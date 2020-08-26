package typings.winrtUwp.Windows.Devices.Geolocation.Geofencing

import typings.winrtUwp.Windows.Devices.Geolocation.Geoposition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information about the state changes for a Geofence . */
@js.native
trait GeofenceStateChangeReport extends js.Object {
  /** The Geofence object whose state has changed. */
  var geofence: Geofence = js.native
  /** The position of the Geofence object whose state has changed. */
  var geoposition: Geoposition = js.native
  /** The new state of the Geofence object whose state has changed. */
  var newState: GeofenceState = js.native
  /** Indicates the reason a Geofence was removed. */
  var removalReason: GeofenceRemovalReason = js.native
}

object GeofenceStateChangeReport {
  @scala.inline
  def apply(
    geofence: Geofence,
    geoposition: Geoposition,
    newState: GeofenceState,
    removalReason: GeofenceRemovalReason
  ): GeofenceStateChangeReport = {
    val __obj = js.Dynamic.literal(geofence = geofence.asInstanceOf[js.Any], geoposition = geoposition.asInstanceOf[js.Any], newState = newState.asInstanceOf[js.Any], removalReason = removalReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeofenceStateChangeReport]
  }
  @scala.inline
  implicit class GeofenceStateChangeReportOps[Self <: GeofenceStateChangeReport] (val x: Self) extends AnyVal {
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
    def setGeofence(value: Geofence): Self = this.set("geofence", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeoposition(value: Geoposition): Self = this.set("geoposition", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewState(value: GeofenceState): Self = this.set("newState", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovalReason(value: GeofenceRemovalReason): Self = this.set("removalReason", value.asInstanceOf[js.Any])
  }
  
}

