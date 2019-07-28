package typings.winrt.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIMaxVideoResolution extends js.Object

@JSGlobal("Windows.Media.Capture.CameraCaptureUIMaxVideoResolution")
@js.native
object CameraCaptureUIMaxVideoResolution extends js.Object {
  @js.native
  sealed trait highDefinition extends CameraCaptureUIMaxVideoResolution
  
  @js.native
  sealed trait highestAvailable extends CameraCaptureUIMaxVideoResolution
  
  @js.native
  sealed trait lowDefinition extends CameraCaptureUIMaxVideoResolution
  
  @js.native
  sealed trait standardDefinition extends CameraCaptureUIMaxVideoResolution
  
  /* 3 */ val highDefinition: typings.winrt.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution.highDefinition with Double = js.native
  /* 0 */ val highestAvailable: typings.winrt.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution.highestAvailable with Double = js.native
  /* 1 */ val lowDefinition: typings.winrt.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution.lowDefinition with Double = js.native
  /* 2 */ val standardDefinition: typings.winrt.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution.standardDefinition with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIMaxVideoResolution with Double] = js.native
}

