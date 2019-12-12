package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Media.Capture.CameraCaptureUIMode.photo
import typings.winrt.Windows.Media.Capture.CameraCaptureUIMode.photoOrVideo
import typings.winrt.Windows.Media.Capture.CameraCaptureUIMode.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIMode extends js.Object

@JSGlobal("Windows.Media.Capture.CameraCaptureUIMode")
@js.native
object CameraCaptureUIMode extends js.Object {
  @js.native
  sealed trait photo extends CameraCaptureUIMode
  
  @js.native
  sealed trait photoOrVideo extends CameraCaptureUIMode
  
  @js.native
  sealed trait video extends CameraCaptureUIMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIMode with Double] = js.native
  /* 1 */ @js.native
  object photo extends TopLevel[photo with Double]
  
  /* 0 */ @js.native
  object photoOrVideo extends TopLevel[photoOrVideo with Double]
  
  /* 2 */ @js.native
  object video extends TopLevel[video with Double]
  
}

