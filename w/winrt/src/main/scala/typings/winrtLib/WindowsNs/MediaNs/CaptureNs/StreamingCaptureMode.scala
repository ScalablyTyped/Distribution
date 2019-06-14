package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreamingCaptureMode extends js.Object

@JSGlobal("Windows.Media.Capture.StreamingCaptureMode")
@js.native
object StreamingCaptureMode extends js.Object {
  @js.native
  sealed trait audio
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.StreamingCaptureMode
  
  @js.native
  sealed trait audioAndVideo
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.StreamingCaptureMode
  
  @js.native
  sealed trait video
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.StreamingCaptureMode
  
  /* 1 */ val audio: audio with scala.Double = js.native
  /* 0 */ val audioAndVideo: audioAndVideo with scala.Double = js.native
  /* 2 */ val video: video with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.MediaNs.CaptureNs.StreamingCaptureMode with scala.Double] = js.native
}

