package typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeofenceRemovalReason extends js.Object

/** Indicates the reason a Geofence was removed. */
@JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceRemovalReason")
@js.native
object GeofenceRemovalReason extends js.Object {
  /** The duration of the geofence has expired. */
  @js.native
  sealed trait expired extends GeofenceRemovalReason
  
  /** The geofence event was triggered and the geofence was used. */
  @js.native
  sealed trait used extends GeofenceRemovalReason
  
  /* 1 */ val expired: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceRemovalReason.expired with Double = js.native
  /* 0 */ val used: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceRemovalReason.used with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeofenceRemovalReason with Double] = js.native
}

