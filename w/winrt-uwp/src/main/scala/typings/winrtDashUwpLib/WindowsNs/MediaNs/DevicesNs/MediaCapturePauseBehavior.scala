package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

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
  sealed trait releaseHardwareResources
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCapturePauseBehavior
  
  /** The calling app keeps control of the hardware resources, such as the camera, while capturing is paused. */
  @js.native
  sealed trait retainHardwareResources
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCapturePauseBehavior
  
  /* 1 */ val releaseHardwareResources: releaseHardwareResources with scala.Double = js.native
  /* 0 */ val retainHardwareResources: retainHardwareResources with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCapturePauseBehavior with scala.Double
  ] = js.native
}

