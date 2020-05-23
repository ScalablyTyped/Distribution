package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoRotation extends js.Object

/** Specifies the rotation of the video stream. */
@JSGlobal("Windows.Media.Capture.VideoRotation")
@js.native
object VideoRotation extends js.Object {
  /** The video stream is rotated 180 degrees clockwise. */
  @js.native
  sealed trait clockwise180Degrees extends VideoRotation
  
  /** The video stream is rotated 270 degrees clockwise. */
  @js.native
  sealed trait clockwise270Degrees extends VideoRotation
  
  /** The video stream is rotated 90 degrees clockwise. */
  @js.native
  sealed trait clockwise90Degrees extends VideoRotation
  
  /** The video stream is not rotated. */
  @js.native
  sealed trait none extends VideoRotation
  
}

