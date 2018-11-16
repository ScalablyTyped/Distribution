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
  
  val entered: entered with java.lang.String = js.native
  val exited: exited with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val removed: removed with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.MonitoredGeofenceStates with java.lang.String
  ] = js.native
}

