package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Media.Capture.StreamingCaptureMode.audio
import typings.winrt.Windows.Media.Capture.StreamingCaptureMode.audioAndVideo
import typings.winrt.Windows.Media.Capture.StreamingCaptureMode.video
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StreamingCaptureMode with Double] = js.native
  /* 1 */ @js.native
  object audio extends TopLevel[audio with Double]
  
  /* 0 */ @js.native
  object audioAndVideo extends TopLevel[audioAndVideo with Double]
  
  /* 2 */ @js.native
  object video extends TopLevel[video with Double]
  
}

