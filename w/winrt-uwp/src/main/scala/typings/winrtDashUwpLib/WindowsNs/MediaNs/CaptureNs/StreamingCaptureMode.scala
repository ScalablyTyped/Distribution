package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreamingCaptureMode extends js.Object

/** Specifies the streaming mode for a media capture device. */
@JSGlobal("Windows.Media.Capture.StreamingCaptureMode")
@js.native
object StreamingCaptureMode extends js.Object {
  /** Capture audio only. */
  @js.native
  sealed trait audio
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.StreamingCaptureMode
  
  /** Capture audio and video. */
  @js.native
  sealed trait audioAndVideo
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.StreamingCaptureMode
  
  /** Capture video only. */
  @js.native
  sealed trait video
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.StreamingCaptureMode
  
  /* 1 */ val audio: audio with scala.Double = js.native
  /* 0 */ val audioAndVideo: audioAndVideo with scala.Double = js.native
  /* 2 */ val video: video with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.StreamingCaptureMode with scala.Double
  ] = js.native
}

