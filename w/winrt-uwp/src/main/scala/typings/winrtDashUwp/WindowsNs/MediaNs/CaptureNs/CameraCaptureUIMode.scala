package typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs

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
  sealed trait photo extends CameraCaptureUIMode
  
  /** Either a photo or video can be captured. */
  @js.native
  sealed trait photoOrVideo extends CameraCaptureUIMode
  
  /** The user can only capture a video. */
  @js.native
  sealed trait video extends CameraCaptureUIMode
  
  /* 1 */ val photo: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMode.photo with Double = js.native
  /* 0 */ val photoOrVideo: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMode.photoOrVideo with Double = js.native
  /* 2 */ val video: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMode.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIMode with Double] = js.native
}

