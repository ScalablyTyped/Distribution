package typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs

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
  sealed trait buffering extends MediaPlayerState
  
  /** The media player is closed. */
  @js.native
  sealed trait closed extends MediaPlayerState
  
  /** The media player is opening. */
  @js.native
  sealed trait opening extends MediaPlayerState
  
  /** The media player is paused. */
  @js.native
  sealed trait paused extends MediaPlayerState
  
  /** The media player is playing. */
  @js.native
  sealed trait playing extends MediaPlayerState
  
  /** Not implemented. */
  @js.native
  sealed trait stopped extends MediaPlayerState
  
  /* 2 */ val buffering: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerState.buffering with Double = js.native
  /* 0 */ val closed: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerState.closed with Double = js.native
  /* 1 */ val opening: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerState.opening with Double = js.native
  /* 4 */ val paused: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerState.paused with Double = js.native
  /* 3 */ val playing: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerState.playing with Double = js.native
  /* 5 */ val stopped: typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs.MediaPlayerState.stopped with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPlayerState with Double] = js.native
}

