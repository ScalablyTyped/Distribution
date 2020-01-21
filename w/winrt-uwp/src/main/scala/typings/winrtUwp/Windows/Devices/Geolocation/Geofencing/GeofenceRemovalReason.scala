package typings.winrtUwp.Windows.Devices.Geolocation.Geofencing

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeofenceRemovalReason with Double] = js.native
  /* 1 */ @js.native
  object expired extends TopLevel[expired with Double]
  
  /* 0 */ @js.native
  object used extends TopLevel[used with Double]
  
}

