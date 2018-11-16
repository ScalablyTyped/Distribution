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
  
  val audio: audio with java.lang.String = js.native
  val audioAndVideo: audioAndVideo with java.lang.String = js.native
  val video: video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.MediaNs.CaptureNs.StreamingCaptureMode with java.lang.String] = js.native
}

