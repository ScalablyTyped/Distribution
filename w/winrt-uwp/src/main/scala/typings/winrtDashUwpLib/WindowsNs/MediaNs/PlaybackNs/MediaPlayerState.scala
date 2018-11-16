package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaPlayerState extends js.Object

/** Indicates the possible states that the player can be in. */
@JSGlobal("Windows.Media.Playback.MediaPlayerState")
@js.native
object MediaPlayerState extends js.Object {
  /** The media player is buffering content. */
  @js.native
  sealed trait buffering
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerState
  
  /** The media player is closed. */
  @js.native
  sealed trait closed
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerState
  
  /** The media player is opening. */
  @js.native
  sealed trait opening
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerState
  
  /** The media player is paused. */
  @js.native
  sealed trait paused
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerState
  
  /** The media player is playing. */
  @js.native
  sealed trait playing
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerState
  
  /** Not implemented. */
  @js.native
  sealed trait stopped
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerState
  
  val buffering: buffering with java.lang.String = js.native
  val closed: closed with java.lang.String = js.native
  val opening: opening with java.lang.String = js.native
  val paused: paused with java.lang.String = js.native
  val playing: playing with java.lang.String = js.native
  val stopped: stopped with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerState with java.lang.String
  ] = js.native
}

