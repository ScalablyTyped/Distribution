package typings.winrt.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoCaptureSource extends js.Object

@JSGlobal("Windows.Media.Capture.PhotoCaptureSource")
@js.native
object PhotoCaptureSource extends js.Object {
  @js.native
  sealed trait auto extends PhotoCaptureSource
  
  @js.native
  sealed trait photo extends PhotoCaptureSource
  
  @js.native
  sealed trait videoPreview extends PhotoCaptureSource
  
  /* 0 */ val auto: typings.winrt.WindowsNs.MediaNs.CaptureNs.PhotoCaptureSource.auto with Double = js.native
  /* 2 */ val photo: typings.winrt.WindowsNs.MediaNs.CaptureNs.PhotoCaptureSource.photo with Double = js.native
  /* 1 */ val videoPreview: typings.winrt.WindowsNs.MediaNs.CaptureNs.PhotoCaptureSource.videoPreview with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoCaptureSource with Double] = js.native
}

