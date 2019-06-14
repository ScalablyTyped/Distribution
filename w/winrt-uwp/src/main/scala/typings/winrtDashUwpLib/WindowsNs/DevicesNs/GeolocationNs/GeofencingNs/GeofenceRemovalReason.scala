package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs

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
  sealed trait expired
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceRemovalReason
  
  /** The geofence event was triggered and the geofence was used. */
  @js.native
  sealed trait used
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceRemovalReason
  
  /* 1 */ val expired: expired with scala.Double = js.native
  /* 0 */ val used: used with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceRemovalReason with scala.Double
  ] = js.native
}

