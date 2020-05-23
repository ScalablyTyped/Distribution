package typings.winrtUwp.global.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a description of media that is supported by a video profile. */
@JSGlobal("Windows.Media.Capture.MediaCaptureVideoProfileMediaDescription")
@js.native
abstract class MediaCaptureVideoProfileMediaDescription ()
  extends typings.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfileMediaDescription {
  /** Gets the frame rate of the media description. */
  /* CompleteClass */
  override var frameRate: Double = js.native
  /** Gets the height of the media description. */
  /* CompleteClass */
  override var height: Double = js.native
  /** Gets a value indicating if the media description includes HDR video support. */
  /* CompleteClass */
  override var isHdrVideoSupported: Boolean = js.native
  /** Gets a value indicating if the media description includes variable photo sequence support. */
  /* CompleteClass */
  override var isVariablePhotoSequenceSupported: Boolean = js.native
  /** Gets the height of the media description. */
  /* CompleteClass */
  override var width: Double = js.native
}

