package typings.winrtUwp.global.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaCapture.Failed event. */
@JSGlobal("Windows.Media.Capture.MediaCaptureFailedEventArgs")
@js.native
abstract class MediaCaptureFailedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Capture.MediaCaptureFailedEventArgs {
  /** The error code of the error that caused the event. */
  /* CompleteClass */
  override var code: Double = js.native
  /** A message string for the error. */
  /* CompleteClass */
  override var message: String = js.native
}

