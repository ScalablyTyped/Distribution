package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaCapturePauseBehavior extends js.Object

/** Defines the behavior when media capture is paused with a call to PauseAsync or PauseRecordAsync . */
@JSGlobal("Windows.Media.Devices.MediaCapturePauseBehavior")
@js.native
object MediaCapturePauseBehavior extends js.Object {
  /** The hardware resources are released while capturing is paused. */
  @js.native
  sealed trait releaseHardwareResources extends MediaCapturePauseBehavior
  
  /** The calling app keeps control of the hardware resources, such as the camera, while capturing is paused. */
  @js.native
  sealed trait retainHardwareResources extends MediaCapturePauseBehavior
  
  /* 1 */ val releaseHardwareResources: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.MediaCapturePauseBehavior.releaseHardwareResources with Double = js.native
  /* 0 */ val retainHardwareResources: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.MediaCapturePauseBehavior.retainHardwareResources with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaCapturePauseBehavior with Double] = js.native
}

