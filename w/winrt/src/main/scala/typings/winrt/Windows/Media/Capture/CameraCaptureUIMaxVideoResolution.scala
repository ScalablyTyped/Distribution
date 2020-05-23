package typings.winrt.Windows.Media.Capture

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
  
}

