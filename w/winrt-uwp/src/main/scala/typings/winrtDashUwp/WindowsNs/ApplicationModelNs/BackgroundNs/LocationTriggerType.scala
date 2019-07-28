package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs

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
  sealed trait geofence extends LocationTriggerType
  
  /* 0 */ val geofence: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs.LocationTriggerType.geofence with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationTriggerType with Double] = js.native
}

