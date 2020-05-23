package typings.winrtUwp.global.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.Devices.AdvancedPhotoMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a photo captured using system-provided computational photography techniques provided by the AdvancedPhotoCapture class. */
@JSGlobal("Windows.Media.Capture.AdvancedCapturedPhoto")
@js.native
abstract class AdvancedCapturedPhoto ()
  extends typings.winrtUwp.Windows.Media.Capture.AdvancedCapturedPhoto {
  /** Gets the app-defined context object associated with the advanced photo capture operation, if one was provided in the call to AdvancedPhotoCapture::CaptureAsync(Object) . */
  /* CompleteClass */
  override var context: js.Any = js.native
  /** Gets the captured frame containing the result of the advanced photo capture. */
  /* CompleteClass */
  override var frame: typings.winrtUwp.Windows.Media.Capture.CapturedFrame = js.native
  /** Gets a value indicating the advanced capture mode with which the photo was captured. */
  /* CompleteClass */
  override var mode: AdvancedPhotoMode = js.native
}

