package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoCaptureSource extends js.Object

/** Specifies which stream on a video camera is used to capture photos. */
@JSGlobal("Windows.Media.Capture.PhotoCaptureSource")
@js.native
object PhotoCaptureSource extends js.Object {
  /** Automatically select the stream. */
  @js.native
  sealed trait auto
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.PhotoCaptureSource
  
  /** Use the photo stream. */
  @js.native
  sealed trait photo
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.PhotoCaptureSource
  
  /** Use the video stream. */
  @js.native
  sealed trait videoPreview
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.PhotoCaptureSource
  
  /* 0 */ val auto: auto with scala.Double = js.native
  /* 2 */ val photo: photo with scala.Double = js.native
  /* 1 */ val videoPreview: videoPreview with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.PhotoCaptureSource with scala.Double] = js.native
}

