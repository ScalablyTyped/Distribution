package typings.winrtDashUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Devices.MediaCapturePauseBehavior.releaseHardwareResources
import typings.winrtDashUwp.Windows.Media.Devices.MediaCapturePauseBehavior.retainHardwareResources
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaCapturePauseBehavior with Double] = js.native
  /* 1 */ @js.native
  object releaseHardwareResources extends TopLevel[releaseHardwareResources with Double]
  
  /* 0 */ @js.native
  object retainHardwareResources extends TopLevel[retainHardwareResources with Double]
  
}

