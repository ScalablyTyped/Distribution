package typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs

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
  sealed trait entered extends GeofenceState
  
  /** The device has left the geofence area. */
  @js.native
  sealed trait exited extends GeofenceState
  
  /** No flag is set. */
  @js.native
  sealed trait none extends GeofenceState
  
  /** The geofence was removed. */
  @js.native
  sealed trait removed extends GeofenceState
  
  /* 1 */ val entered: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceState.entered with Double = js.native
  /* 2 */ val exited: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceState.exited with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceState.none with Double = js.native
  /* 3 */ val removed: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceState.removed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeofenceState with Double] = js.native
}

