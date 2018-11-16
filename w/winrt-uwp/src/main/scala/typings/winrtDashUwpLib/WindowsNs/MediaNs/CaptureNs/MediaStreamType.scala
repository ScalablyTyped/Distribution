package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaStreamType extends js.Object

/** Specifies a type of stream on a media capture device. */
@JSGlobal("Windows.Media.Capture.MediaStreamType")
@js.native
object MediaStreamType extends js.Object {
  /** An audio stream. */
  @js.native
  sealed trait audio
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType
  
  /** A photo stream. */
  @js.native
  sealed trait photo
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType
  
  /** A video preview stream. */
  @js.native
  sealed trait videoPreview
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType
  
  /** A video recording stream. */
  @js.native
  sealed trait videoRecord
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType
  
  val audio: audio with java.lang.String = js.native
  val photo: photo with java.lang.String = js.native
  val videoPreview: videoPreview with java.lang.String = js.native
  val videoRecord: videoRecord with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType with java.lang.String
  ] = js.native
}

