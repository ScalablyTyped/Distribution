package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MonitoredGeofenceStates extends js.Object

/** Indicates the state or states of the Geofences that are currently being monitored by the system. */
@JSGlobal("Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates")
@js.native
object MonitoredGeofenceStates extends js.Object {
  /** The device has entered a geofence area. */
  @js.native
  sealed trait entered
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.MonitoredGeofenceStates
  
  /** The device has left a geofence area. */
  @js.native
  sealed trait exited
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.MonitoredGeofenceStates
  
  /** No flag is set. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.MonitoredGeofenceStates
  
  /** The geofence has been removed. */
  @js.native
  sealed trait removed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.MonitoredGeofenceStates
  
  /* 1 */ val entered: entered with scala.Double = js.native
  /* 2 */ val exited: exited with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val removed: removed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.MonitoredGeofenceStates with scala.Double
  ] = js.native
}

