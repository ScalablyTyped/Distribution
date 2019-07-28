package typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs

import typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.AdvancedPhotoMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a photo captured using system-provided computational photography techniques provided by the AdvancedPhotoCapture class. */
@JSGlobal("Windows.Media.Capture.AdvancedCapturedPhoto")
@js.native
abstract class AdvancedCapturedPhoto () extends js.Object {
  /** Gets the app-defined context object associated with the advanced photo capture operation, if one was provided in the call to AdvancedPhotoCapture::CaptureAsync(Object) . */
  var context: js.Any = js.native
  /** Gets the captured frame containing the result of the advanced photo capture. */
  var frame: CapturedFrame = js.native
  /** Gets a value indicating the advanced capture mode with which the photo was captured. */
  var mode: AdvancedPhotoMode = js.native
}

