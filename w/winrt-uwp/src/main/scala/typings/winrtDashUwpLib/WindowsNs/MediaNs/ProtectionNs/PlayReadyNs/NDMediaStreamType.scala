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
  
  val audio: audio with java.lang.String = js.native
  val video: video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDMediaStreamType with java.lang.String
  ] = js.native
}

