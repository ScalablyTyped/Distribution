package typings.winrtUwp.global.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PhotoConfirmationCaptured event. */
@JSGlobal("Windows.Media.Capture.PhotoConfirmationCapturedEventArgs")
@js.native
abstract class PhotoConfirmationCapturedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Capture.PhotoConfirmationCapturedEventArgs {
  /** Gets the time offset from when capture began to the capture of the frame associated with the event. */
  /* CompleteClass */
  override var captureTimeOffset: Double = js.native
  /** Gets the captured frame. */
  /* CompleteClass */
  override var frame: typings.winrtUwp.Windows.Media.Capture.CapturedFrame = js.native
}

