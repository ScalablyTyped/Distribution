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
  
  /* 2 */ val buffering: buffering with scala.Double = js.native
  /* 0 */ val closed: closed with scala.Double = js.native
  /* 1 */ val opening: opening with scala.Double = js.native
  /* 4 */ val paused: paused with scala.Double = js.native
  /* 3 */ val playing: playing with scala.Double = js.native
  /* 5 */ val stopped: stopped with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlayerState with scala.Double] = js.native
}

