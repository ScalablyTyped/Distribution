package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaStreamType extends js.Object

@JSGlobal("Windows.Media.Capture.MediaStreamType")
@js.native
object MediaStreamType extends js.Object {
  @js.native
  sealed trait audio
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType
  
  @js.native
  sealed trait photo
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType
  
  @js.native
  sealed trait videoPreview
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType
  
  @js.native
  sealed trait videoRecord
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType
  
  /* 2 */ val audio: audio with scala.Double = js.native
  /* 3 */ val photo: photo with scala.Double = js.native
  /* 0 */ val videoPreview: videoPreview with scala.Double = js.native
  /* 1 */ val videoRecord: videoRecord with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType with scala.Double] = js.native
}

