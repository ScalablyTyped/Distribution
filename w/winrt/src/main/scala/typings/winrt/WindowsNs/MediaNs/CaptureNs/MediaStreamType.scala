package typings.winrt.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaStreamType extends js.Object

@JSGlobal("Windows.Media.Capture.MediaStreamType")
@js.native
object MediaStreamType extends js.Object {
  @js.native
  sealed trait audio extends MediaStreamType
  
  @js.native
  sealed trait photo extends MediaStreamType
  
  @js.native
  sealed trait videoPreview extends MediaStreamType
  
  @js.native
  sealed trait videoRecord extends MediaStreamType
  
  /* 2 */ val audio: typings.winrt.WindowsNs.MediaNs.CaptureNs.MediaStreamType.audio with Double = js.native
  /* 3 */ val photo: typings.winrt.WindowsNs.MediaNs.CaptureNs.MediaStreamType.photo with Double = js.native
  /* 0 */ val videoPreview: typings.winrt.WindowsNs.MediaNs.CaptureNs.MediaStreamType.videoPreview with Double = js.native
  /* 1 */ val videoRecord: typings.winrt.WindowsNs.MediaNs.CaptureNs.MediaStreamType.videoRecord with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaStreamType with Double] = js.native
}

