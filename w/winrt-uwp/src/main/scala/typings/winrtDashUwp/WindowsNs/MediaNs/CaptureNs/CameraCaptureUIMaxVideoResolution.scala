package typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs

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
  
  /* 3 */ val highDefinition: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution.highDefinition with Double = js.native
  /* 0 */ val highestAvailable: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution.highestAvailable with Double = js.native
  /* 1 */ val lowDefinition: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution.lowDefinition with Double = js.native
  /* 2 */ val standardDefinition: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution.standardDefinition with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIMaxVideoResolution with Double] = js.native
}

