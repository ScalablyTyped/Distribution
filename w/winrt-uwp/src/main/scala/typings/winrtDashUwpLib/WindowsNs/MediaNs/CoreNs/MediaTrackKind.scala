package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaTrackKind extends js.Object

/** Specifies the type of a media track. */
@JSGlobal("Windows.Media.Core.MediaTrackKind")
@js.native
object MediaTrackKind extends js.Object {
  /** The track is an audio track. */
  @js.native
  sealed trait audio
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaTrackKind
  
  /** The track is a timed metadata track. */
  @js.native
  sealed trait timedMetadata
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaTrackKind
  
  /** The track is a video track. */
  @js.native
  sealed trait video
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaTrackKind
  
  val audio: audio with java.lang.String = js.native
  val timedMetadata: timedMetadata with java.lang.String = js.native
  val video: video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaTrackKind with java.lang.String] = js.native
}

