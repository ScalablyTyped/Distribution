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
  
  val audio: audio with java.lang.String = js.native
  val photo: photo with java.lang.String = js.native
  val videoPreview: videoPreview with java.lang.String = js.native
  val videoRecord: videoRecord with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType with java.lang.String] = js.native
}

