package typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PhotoConfirmationCaptured event. */
@JSGlobal("Windows.Media.Capture.PhotoConfirmationCapturedEventArgs")
@js.native
abstract class PhotoConfirmationCapturedEventArgs () extends js.Object {
  /** Gets the time offset from when capture began to the capture of the frame associated with the event. */
  var captureTimeOffset: Double = js.native
  /** Gets the captured frame. */
  var frame: CapturedFrame = js.native
}

