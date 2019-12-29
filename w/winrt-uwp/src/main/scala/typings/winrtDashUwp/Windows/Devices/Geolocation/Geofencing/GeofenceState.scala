package typings.winrtDashUwp.Windows.Devices.Geolocation.Geofencing

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeofenceState with Double] = js.native
  /* 1 */ @js.native
  object entered extends TopLevel[entered with Double]
  
  /* 2 */ @js.native
  object exited extends TopLevel[exited with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object removed extends TopLevel[removed with Double]
  
}

