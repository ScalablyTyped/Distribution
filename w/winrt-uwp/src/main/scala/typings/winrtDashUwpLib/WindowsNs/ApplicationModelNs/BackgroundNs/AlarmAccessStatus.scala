package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

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
  sealed trait allowedWithWakeupCapability
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.AlarmAccessStatus
  
  /** The user has given permission for the app to set alarms, but the alarms cannot wake up the computer from standby. */
  @js.native
  sealed trait allowedWithoutWakeupCapability
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.AlarmAccessStatus
  
  /** The user has denied permission for the app to set alarms. */
  @js.native
  sealed trait denied
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.AlarmAccessStatus
  
  /** The user has not responded to a permission request for the app to set alarms. */
  @js.native
  sealed trait unspecified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.AlarmAccessStatus
  
  /* 1 */ val allowedWithWakeupCapability: allowedWithWakeupCapability with scala.Double = js.native
  /* 2 */ val allowedWithoutWakeupCapability: allowedWithoutWakeupCapability with scala.Double = js.native
  /* 3 */ val denied: denied with scala.Double = js.native
  /* 0 */ val unspecified: unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.AlarmAccessStatus with scala.Double
  ] = js.native
}

