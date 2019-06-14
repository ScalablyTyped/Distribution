package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeofenceState extends js.Object

/** Indicates the current state of a Geofence . */
@JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceState")
@js.native
object GeofenceState extends js.Object {
  /** The device has entered the geofence area. */
  @js.native
  sealed trait entered
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceState
  
  /** The device has left the geofence area. */
  @js.native
  sealed trait exited
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceState
  
  /** No flag is set. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceState
  
  /** The geofence was removed. */
  @js.native
  sealed trait removed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceState
  
  /* 1 */ val entered: entered with scala.Double = js.native
  /* 2 */ val exited: exited with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val removed: removed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceState with scala.Double
  ] = js.native
}

