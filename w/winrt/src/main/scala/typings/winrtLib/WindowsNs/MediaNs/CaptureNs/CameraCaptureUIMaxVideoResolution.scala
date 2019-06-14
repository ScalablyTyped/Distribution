package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIMaxVideoResolution extends js.Object

@JSGlobal("Windows.Media.Capture.CameraCaptureUIMaxVideoResolution")
@js.native
object CameraCaptureUIMaxVideoResolution extends js.Object {
  @js.native
  sealed trait highDefinition
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution
  
  @js.native
  sealed trait highestAvailable
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution
  
  @js.native
  sealed trait lowDefinition
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution
  
  @js.native
  sealed trait standardDefinition
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution
  
  /* 3 */ val highDefinition: highDefinition with scala.Double = js.native
  /* 0 */ val highestAvailable: highestAvailable with scala.Double = js.native
  /* 1 */ val lowDefinition: lowDefinition with scala.Double = js.native
  /* 2 */ val standardDefinition: standardDefinition with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution with scala.Double
  ] = js.native
}

