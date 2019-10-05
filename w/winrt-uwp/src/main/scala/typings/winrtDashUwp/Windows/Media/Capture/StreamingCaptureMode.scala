package typings.winrtDashUwp.Windows.Media.Capture

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
  sealed trait audio extends StreamingCaptureMode
  
  /** Capture audio and video. */
  @js.native
  sealed trait audioAndVideo extends StreamingCaptureMode
  
  /** Capture video only. */
  @js.native
  sealed trait video extends StreamingCaptureMode
  
  /* 1 */ val audio: typings.winrtDashUwp.Windows.Media.Capture.StreamingCaptureMode.audio with Double = js.native
  /* 0 */ val audioAndVideo: typings.winrtDashUwp.Windows.Media.Capture.StreamingCaptureMode.audioAndVideo with Double = js.native
  /* 2 */ val video: typings.winrtDashUwp.Windows.Media.Capture.StreamingCaptureMode.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StreamingCaptureMode with Double] = js.native
}

