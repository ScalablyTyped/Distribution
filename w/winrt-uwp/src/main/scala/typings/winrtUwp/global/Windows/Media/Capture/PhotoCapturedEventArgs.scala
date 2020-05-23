package typings.winrtUwp.global.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the photo sequence PhotoCaptured event. */
@JSGlobal("Windows.Media.Capture.PhotoCapturedEventArgs")
@js.native
abstract class PhotoCapturedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Capture.PhotoCapturedEventArgs {
  /** Gets a value that indicates time offset in the photo sequence. */
  /* CompleteClass */
  override var captureTimeOffset: Double = js.native
  /** Gets the captured image associated with the event. */
  /* CompleteClass */
  override var frame: typings.winrtUwp.Windows.Media.Capture.CapturedFrame = js.native
  /** Gets a thumbnail version of the captured image associated with the event. */
  /* CompleteClass */
  override var thumbnail: typings.winrtUwp.Windows.Media.Capture.CapturedFrame = js.native
}

