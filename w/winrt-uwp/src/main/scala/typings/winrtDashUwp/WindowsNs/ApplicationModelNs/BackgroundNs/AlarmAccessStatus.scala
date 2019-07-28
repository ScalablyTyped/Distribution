package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AlarmAccessStatus extends js.Object

/** Indicates whether the user has given permission for the app to set alarms. */
@JSGlobal("Windows.ApplicationModel.Background.AlarmAccessStatus")
@js.native
object AlarmAccessStatus extends js.Object {
  /** The user has given permission for the app to set alarms, and alarms can wake up the computer from standby. */
  @js.native
  sealed trait allowedWithWakeupCapability extends AlarmAccessStatus
  
  /** The user has given permission for the app to set alarms, but the alarms cannot wake up the computer from standby. */
  @js.native
  sealed trait allowedWithoutWakeupCapability extends AlarmAccessStatus
  
  /** The user has denied permission for the app to set alarms. */
  @js.native
  sealed trait denied extends AlarmAccessStatus
  
  /** The user has not responded to a permission request for the app to set alarms. */
  @js.native
  sealed trait unspecified extends AlarmAccessStatus
  
  /* 1 */ val allowedWithWakeupCapability: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs.AlarmAccessStatus.allowedWithWakeupCapability with Double = js.native
  /* 2 */ val allowedWithoutWakeupCapability: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs.AlarmAccessStatus.allowedWithoutWakeupCapability with Double = js.native
  /* 3 */ val denied: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs.AlarmAccessStatus.denied with Double = js.native
  /* 0 */ val unspecified: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs.AlarmAccessStatus.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AlarmAccessStatus with Double] = js.native
}

