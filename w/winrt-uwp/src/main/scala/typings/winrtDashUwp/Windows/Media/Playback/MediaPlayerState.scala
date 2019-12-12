package typings.winrtDashUwp.Windows.Media.Playback

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Playback.MediaPlayerState.buffering
import typings.winrtDashUwp.Windows.Media.Playback.MediaPlayerState.closed
import typings.winrtDashUwp.Windows.Media.Playback.MediaPlayerState.opening
import typings.winrtDashUwp.Windows.Media.Playback.MediaPlayerState.paused
import typings.winrtDashUwp.Windows.Media.Playback.MediaPlayerState.playing
import typings.winrtDashUwp.Windows.Media.Playback.MediaPlayerState.stopped
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPlayerState with Double] = js.native
  /* 2 */ @js.native
  object buffering extends TopLevel[buffering with Double]
  
  /* 0 */ @js.native
  object closed extends TopLevel[closed with Double]
  
  /* 1 */ @js.native
  object opening extends TopLevel[opening with Double]
  
  /* 4 */ @js.native
  object paused extends TopLevel[paused with Double]
  
  /* 3 */ @js.native
  object playing extends TopLevel[playing with Double]
  
  /* 5 */ @js.native
  object stopped extends TopLevel[stopped with Double]
  
}

