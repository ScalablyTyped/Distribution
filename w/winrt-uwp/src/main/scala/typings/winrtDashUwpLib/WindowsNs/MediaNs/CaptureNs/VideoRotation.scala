package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

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
  sealed trait clockwise180Degrees
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.VideoRotation
  
  /** The video stream is rotated 270 degrees clockwise. */
  @js.native
  sealed trait clockwise270Degrees
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.VideoRotation
  
  /** The video stream is rotated 90 degrees clockwise. */
  @js.native
  sealed trait clockwise90Degrees
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.VideoRotation
  
  /** The video stream is not rotated. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.VideoRotation
  
  val clockwise180Degrees: clockwise180Degrees with java.lang.String = js.native
  val clockwise270Degrees: clockwise270Degrees with java.lang.String = js.native
  val clockwise90Degrees: clockwise90Degrees with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.VideoRotation with java.lang.String] = js.native
}

