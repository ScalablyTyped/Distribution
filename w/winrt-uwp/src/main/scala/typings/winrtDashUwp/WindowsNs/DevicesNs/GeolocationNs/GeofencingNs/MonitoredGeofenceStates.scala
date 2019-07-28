package typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs

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
  sealed trait entered extends MonitoredGeofenceStates
  
  /** The device has left a geofence area. */
  @js.native
  sealed trait exited extends MonitoredGeofenceStates
  
  /** No flag is set. */
  @js.native
  sealed trait none extends MonitoredGeofenceStates
  
  /** The geofence has been removed. */
  @js.native
  sealed trait removed extends MonitoredGeofenceStates
  
  /* 1 */ val entered: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.MonitoredGeofenceStates.entered with Double = js.native
  /* 2 */ val exited: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.MonitoredGeofenceStates.exited with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.MonitoredGeofenceStates.none with Double = js.native
  /* 3 */ val removed: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.MonitoredGeofenceStates.removed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MonitoredGeofenceStates with Double] = js.native
}

