package typings.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIVideoFormat extends js.Object

@JSGlobal("Windows.Media.Capture.CameraCaptureUIVideoFormat")
@js.native
object CameraCaptureUIVideoFormat extends js.Object {
  @js.native
  sealed trait mp4 extends CameraCaptureUIVideoFormat
  
  @js.native
  sealed trait wmv extends CameraCaptureUIVideoFormat
  
}

