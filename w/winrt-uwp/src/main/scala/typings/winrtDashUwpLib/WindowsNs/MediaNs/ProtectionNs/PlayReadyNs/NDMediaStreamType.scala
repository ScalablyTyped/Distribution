package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NDMediaStreamType extends js.Object

/** Indicates the type of a protected media stream. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDMediaStreamType")
@js.native
object NDMediaStreamType extends js.Object {
  /** The stream is an audio stream. */
  @js.native
  sealed trait audio
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDMediaStreamType
  
  /** The stream is a video stream. */
  @js.native
  sealed trait video
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDMediaStreamType
  
  /* 0 */ val audio: audio with scala.Double = js.native
  /* 1 */ val video: video with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDMediaStreamType with scala.Double
  ] = js.native
}

