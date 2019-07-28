package typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.Geoposition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information about the state changes for a Geofence . */
@JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceStateChangeReport")
@js.native
abstract class GeofenceStateChangeReport () extends js.Object {
  /** The Geofence object whose state has changed. */
  var geofence: Geofence = js.native
  /** The position of the Geofence object whose state has changed. */
  var geoposition: Geoposition = js.native
  /** The new state of the Geofence object whose state has changed. */
  var newState: GeofenceState = js.native
  /** Indicates the reason a Geofence was removed. */
  var removalReason: GeofenceRemovalReason = js.native
}

