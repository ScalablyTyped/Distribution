package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LocationTriggerType extends js.Object

/** Indicates a type of location event for a location background task trigger. */
@JSGlobal("Windows.ApplicationModel.Background.LocationTriggerType")
@js.native
object LocationTriggerType extends js.Object {
  /** Indicates a geofence location trigger. */
  @js.native
  sealed trait geofence
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.LocationTriggerType
  
  /* 0 */ val geofence: geofence with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.LocationTriggerType with scala.Double
  ] = js.native
}

