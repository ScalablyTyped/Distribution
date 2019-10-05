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
  
  /* 0 */ val highestAvailable: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.highestAvailable with Double = js.native
  /* 4 */ val large3M: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.large3M with Double = js.native
  /* 3 */ val mediumXga: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.mediumXga with Double = js.native
  /* 2 */ val smallVga: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.smallVga with Double = js.native
  /* 5 */ val veryLarge5M: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.veryLarge5M with Double = js.native
  /* 1 */ val verySmallQvga: typings.winrt.Windows.Media.Capture.CameraCaptureUIMaxPhotoResolution.verySmallQvga with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIMaxPhotoResolution with Double] = js.native
}

