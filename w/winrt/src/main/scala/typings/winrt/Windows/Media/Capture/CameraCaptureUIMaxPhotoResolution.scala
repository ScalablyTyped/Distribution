package typings.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIMaxPhotoResolution extends js.Object

@JSGlobal("Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution")
@js.native
object CameraCaptureUIMaxPhotoResolution extends js.Object {
  @js.native
  sealed trait highestAvailable extends CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait large3M extends CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait mediumXga extends CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait smallVga extends CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait veryLarge5M extends CameraCaptureUIMaxPhotoResolution
  
  @js.native
  sealed trait verySmallQvga extends CameraCaptureUIMaxPhotoResolution
  
}

