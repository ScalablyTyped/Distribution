package typings.winrtUwp.Windows.Devices.Geolocation.Geofencing

import typings.winrtUwp.Windows.Devices.Geolocation.Geoposition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information about the state changes for a Geofence . */
trait GeofenceStateChangeReport extends js.Object {
  /** The Geofence object whose state has changed. */
  var geofence: Geofence
  /** The position of the Geofence object whose state has changed. */
  var geoposition: Geoposition
  /** The new state of the Geofence object whose state has changed. */
  var newState: GeofenceState
  /** Indicates the reason a Geofence was removed. */
  var removalReason: GeofenceRemovalReason
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
}

