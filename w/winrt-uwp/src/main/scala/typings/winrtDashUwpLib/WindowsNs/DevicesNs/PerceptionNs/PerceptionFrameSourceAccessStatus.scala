package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PerceptionFrameSourceAccessStatus extends js.Object

/** Indicates the access status an app is allowed for a particular type of frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionFrameSourceAccessStatus")
@js.native
object PerceptionFrameSourceAccessStatus extends js.Object {
  /** The app is allowed to access the type of perception frame source it requested. */
  @js.native
  sealed trait allowed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourceAccessStatus
  
  /** The app is not allowed to access the type of perception frame source it requested because system access to camera devices is denied. This usually occurs when the user denies all apps access to camera devices in the system privacy settings. */
  @js.native
  sealed trait deniedBySystem
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourceAccessStatus
  
  /** The app is not allowed to access the type of perception frame source it requested because the user denied the app access to camera devices. */
  @js.native
  sealed trait deniedByUser
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourceAccessStatus
  
  /** Access status is not specified. */
  @js.native
  sealed trait unspecified
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourceAccessStatus
  
  val allowed: allowed with java.lang.String = js.native
  val deniedBySystem: deniedBySystem with java.lang.String = js.native
  val deniedByUser: deniedByUser with java.lang.String = js.native
  val unspecified: unspecified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourceAccessStatus with java.lang.String
  ] = js.native
}

