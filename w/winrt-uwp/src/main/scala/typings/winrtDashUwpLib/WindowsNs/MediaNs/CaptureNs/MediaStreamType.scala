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
  
  /* 2 */ val audio: audio with scala.Double = js.native
  /* 3 */ val photo: photo with scala.Double = js.native
  /* 0 */ val videoPreview: videoPreview with scala.Double = js.native
  /* 1 */ val videoRecord: videoRecord with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType with scala.Double] = js.native
}

