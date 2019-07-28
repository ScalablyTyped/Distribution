package typings.winrtDashUwp.WindowsNs.DevicesNs.PerceptionNs

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
  sealed trait allowed extends PerceptionFrameSourceAccessStatus
  
  /** The app is not allowed to access the type of perception frame source it requested because system access to camera devices is denied. This usually occurs when the user denies all apps access to camera devices in the system privacy settings. */
  @js.native
  sealed trait deniedBySystem extends PerceptionFrameSourceAccessStatus
  
  /** The app is not allowed to access the type of perception frame source it requested because the user denied the app access to camera devices. */
  @js.native
  sealed trait deniedByUser extends PerceptionFrameSourceAccessStatus
  
  /** Access status is not specified. */
  @js.native
  sealed trait unspecified extends PerceptionFrameSourceAccessStatus
  
  /* 1 */ val allowed: typings.winrtDashUwp.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourceAccessStatus.allowed with Double = js.native
  /* 3 */ val deniedBySystem: typings.winrtDashUwp.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourceAccessStatus.deniedBySystem with Double = js.native
  /* 2 */ val deniedByUser: typings.winrtDashUwp.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourceAccessStatus.deniedByUser with Double = js.native
  /* 0 */ val unspecified: typings.winrtDashUwp.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourceAccessStatus.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PerceptionFrameSourceAccessStatus with Double] = js.native
}

