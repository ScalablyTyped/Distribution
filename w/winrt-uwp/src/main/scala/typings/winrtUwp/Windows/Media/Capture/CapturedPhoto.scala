package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a photo taken from a capture device such as a webcam attached. */
@JSGlobal("Windows.Media.Capture.CapturedPhoto")
@js.native
abstract class CapturedPhoto () extends js.Object {
  /** Gets the photo data, represented as CapturedFrame object, associated with the CapturedPhoto object. */
  var frame: CapturedFrame = js.native
  /** Represents a thumbnail image of the capture photo. */
  var thumbnail: CapturedFrame = js.native
}

