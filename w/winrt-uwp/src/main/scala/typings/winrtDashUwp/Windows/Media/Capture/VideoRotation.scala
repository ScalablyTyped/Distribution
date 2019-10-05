package typings.winrtDashUwp.Windows.Media.Capture

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
  
  /* 2 */ val clockwise180Degrees: typings.winrtDashUwp.Windows.Media.Capture.VideoRotation.clockwise180Degrees with Double = js.native
  /* 3 */ val clockwise270Degrees: typings.winrtDashUwp.Windows.Media.Capture.VideoRotation.clockwise270Degrees with Double = js.native
  /* 1 */ val clockwise90Degrees: typings.winrtDashUwp.Windows.Media.Capture.VideoRotation.clockwise90Degrees with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Media.Capture.VideoRotation.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoRotation with Double] = js.native
}

