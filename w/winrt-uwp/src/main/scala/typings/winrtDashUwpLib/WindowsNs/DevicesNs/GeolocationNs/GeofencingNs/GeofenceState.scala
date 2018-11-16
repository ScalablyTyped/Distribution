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
  
  val entered: entered with java.lang.String = js.native
  val exited: exited with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val removed: removed with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceState with java.lang.String
  ] = js.native
}

