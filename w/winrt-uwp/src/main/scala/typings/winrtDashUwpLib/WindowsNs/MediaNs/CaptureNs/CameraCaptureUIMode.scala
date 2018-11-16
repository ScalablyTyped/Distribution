package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIMode extends js.Object

/** Determines whether the user interface for capturing from the attached camera allows capture of photos, videos, or both photos and videos. */
@JSGlobal("Windows.Media.Capture.CameraCaptureUIMode")
@js.native
object CameraCaptureUIMode extends js.Object {
  /** The user can only capture a photo. */
  @js.native
  sealed trait photo
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMode
  
  /** Either a photo or video can be captured. */
  @js.native
  sealed trait photoOrVideo
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMode
  
  /** The user can only capture a video. */
  @js.native
  sealed trait video
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMode
  
  val photo: photo with java.lang.String = js.native
  val photoOrVideo: photoOrVideo with java.lang.String = js.native
  val video: video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMode with java.lang.String
  ] = js.native
}

