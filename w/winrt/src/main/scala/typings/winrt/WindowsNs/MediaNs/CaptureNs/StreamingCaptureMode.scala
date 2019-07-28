package typings.winrt.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreamingCaptureMode extends js.Object

@JSGlobal("Windows.Media.Capture.StreamingCaptureMode")
@js.native
object StreamingCaptureMode extends js.Object {
  @js.native
  sealed trait audio extends StreamingCaptureMode
  
  @js.native
  sealed trait audioAndVideo extends StreamingCaptureMode
  
  @js.native
  sealed trait video extends StreamingCaptureMode
  
  /* 1 */ val audio: typings.winrt.WindowsNs.MediaNs.CaptureNs.StreamingCaptureMode.audio with Double = js.native
  /* 0 */ val audioAndVideo: typings.winrt.WindowsNs.MediaNs.CaptureNs.StreamingCaptureMode.audioAndVideo with Double = js.native
  /* 2 */ val video: typings.winrt.WindowsNs.MediaNs.CaptureNs.StreamingCaptureMode.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StreamingCaptureMode with Double] = js.native
}

