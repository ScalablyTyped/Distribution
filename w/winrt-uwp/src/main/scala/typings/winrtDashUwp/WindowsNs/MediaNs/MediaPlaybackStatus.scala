package typings.winrtDashUwp.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaPlaybackStatus extends js.Object

/** Defines values for the status of the media playback. */
@JSGlobal("Windows.Media.MediaPlaybackStatus")
@js.native
object MediaPlaybackStatus extends js.Object {
  /** The media is changing. */
  @js.native
  sealed trait changing extends MediaPlaybackStatus
  
  /** The media is closd. */
  @js.native
  sealed trait closed extends MediaPlaybackStatus
  
  /** The media is paused. */
  @js.native
  sealed trait paused extends MediaPlaybackStatus
  
  /** The media is playing. */
  @js.native
  sealed trait playing extends MediaPlaybackStatus
  
  /** The media is stopped. */
  @js.native
  sealed trait stopped extends MediaPlaybackStatus
  
  /* 1 */ val changing: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPlaybackStatus.changing with Double = js.native
  /* 0 */ val closed: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPlaybackStatus.closed with Double = js.native
  /* 4 */ val paused: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPlaybackStatus.paused with Double = js.native
  /* 3 */ val playing: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPlaybackStatus.playing with Double = js.native
  /* 2 */ val stopped: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPlaybackStatus.stopped with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPlaybackStatus with Double] = js.native
}

