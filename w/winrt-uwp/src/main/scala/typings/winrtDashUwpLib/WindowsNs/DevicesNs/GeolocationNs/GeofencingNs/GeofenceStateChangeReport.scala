package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs

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
  var geoposition: winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.Geoposition = js.native
  /** The new state of the Geofence object whose state has changed. */
  var newState: GeofenceState = js.native
  /** Indicates the reason a Geofence was removed. */
  var removalReason: GeofenceRemovalReason = js.native
}

