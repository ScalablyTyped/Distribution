package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIVideoFormat extends js.Object

@JSGlobal("Windows.Media.Capture.CameraCaptureUIVideoFormat")
@js.native
object CameraCaptureUIVideoFormat extends js.Object {
  @js.native
  sealed trait mp4 extends CameraCaptureUIVideoFormat
  
  @js.native
  sealed trait wmv extends CameraCaptureUIVideoFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIVideoFormat with Double] = js.native
  /* 0 */ @js.native
  object mp4 extends TopLevel[mp4 with Double]
  
  /* 1 */ @js.native
  object wmv extends TopLevel[wmv with Double]
  
}

