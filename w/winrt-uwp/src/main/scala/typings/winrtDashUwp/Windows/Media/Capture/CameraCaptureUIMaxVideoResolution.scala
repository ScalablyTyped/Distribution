package typings.winrtDashUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIMaxVideoResolution extends js.Object

/** Determines the highest resolution the user can select for capturing video. */
@JSGlobal("Windows.Media.Capture.CameraCaptureUIMaxVideoResolution")
@js.native
object CameraCaptureUIMaxVideoResolution extends js.Object {
  /** The user can select resolutions up to high definition resolutions. */
  @js.native
  sealed trait highDefinition extends CameraCaptureUIMaxVideoResolution
  
  /** The user can select any resolution. */
  @js.native
  sealed trait highestAvailable extends CameraCaptureUIMaxVideoResolution
  
  /** The user can select resolutions up to low definition resolutions. */
  @js.native
  sealed trait lowDefinition extends CameraCaptureUIMaxVideoResolution
  
  /** The user can select resolutions up to standard definition resolutions. */
  @js.native
  sealed trait standardDefinition extends CameraCaptureUIMaxVideoResolution
  
  /* 3 */ val highDefinition: typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution.highDefinition with Double = js.native
  /* 0 */ val highestAvailable: typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution.highestAvailable with Double = js.native
  /* 1 */ val lowDefinition: typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution.lowDefinition with Double = js.native
  /* 2 */ val standardDefinition: typings.winrtDashUwp.Windows.Media.Capture.CameraCaptureUIMaxVideoResolution.standardDefinition with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIMaxVideoResolution with Double] = js.native
}

