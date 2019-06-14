package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

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
  sealed trait highDefinition
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution
  
  /** The user can select any resolution. */
  @js.native
  sealed trait highestAvailable
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution
  
  /** The user can select resolutions up to low definition resolutions. */
  @js.native
  sealed trait lowDefinition
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution
  
  /** The user can select resolutions up to standard definition resolutions. */
  @js.native
  sealed trait standardDefinition
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution
  
  /* 3 */ val highDefinition: highDefinition with scala.Double = js.native
  /* 0 */ val highestAvailable: highestAvailable with scala.Double = js.native
  /* 1 */ val lowDefinition: lowDefinition with scala.Double = js.native
  /* 2 */ val standardDefinition: standardDefinition with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution with scala.Double
  ] = js.native
}

