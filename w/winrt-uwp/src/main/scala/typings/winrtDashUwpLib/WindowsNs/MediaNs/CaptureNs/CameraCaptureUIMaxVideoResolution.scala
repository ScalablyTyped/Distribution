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
  
  val highDefinition: highDefinition with java.lang.String = js.native
  val highestAvailable: highestAvailable with java.lang.String = js.native
  val lowDefinition: lowDefinition with java.lang.String = js.native
  val standardDefinition: standardDefinition with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution with java.lang.String
  ] = js.native
}

