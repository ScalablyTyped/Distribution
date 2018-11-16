package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the photo sequence PhotoCaptured event. */
@JSGlobal("Windows.Media.Capture.PhotoCapturedEventArgs")
@js.native
abstract class PhotoCapturedEventArgs () extends js.Object {
  /** Gets a value that indicates time offset in the photo sequence. */
  var captureTimeOffset: scala.Double = js.native
  /** Gets the captured image associated with the event. */
  var frame: CapturedFrame = js.native
  /** Gets a thumbnail version of the captured image associated with the event. */
  var thumbnail: CapturedFrame = js.native
}

