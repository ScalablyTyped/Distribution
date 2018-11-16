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
  
  val allowedWithWakeupCapability: allowedWithWakeupCapability with java.lang.String = js.native
  val allowedWithoutWakeupCapability: allowedWithoutWakeupCapability with java.lang.String = js.native
  val denied: denied with java.lang.String = js.native
  val unspecified: unspecified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.AlarmAccessStatus with java.lang.String
  ] = js.native
}

