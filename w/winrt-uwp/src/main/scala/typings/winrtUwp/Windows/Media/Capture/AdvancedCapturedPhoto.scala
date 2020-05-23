package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.Devices.AdvancedPhotoMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a photo captured using system-provided computational photography techniques provided by the AdvancedPhotoCapture class. */
trait AdvancedCapturedPhoto extends js.Object {
  /** Gets the app-defined context object associated with the advanced photo capture operation, if one was provided in the call to AdvancedPhotoCapture::CaptureAsync(Object) . */
  var context: js.Any
  /** Gets the captured frame containing the result of the advanced photo capture. */
  var frame: CapturedFrame
  /** Gets a value indicating the advanced capture mode with which the photo was captured. */
  var mode: AdvancedPhotoMode
}

object AdvancedCapturedPhoto {
  @scala.inline
  def apply(context: js.Any, frame: CapturedFrame, mode: AdvancedPhotoMode): AdvancedCapturedPhoto = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedCapturedPhoto]
  }
}

