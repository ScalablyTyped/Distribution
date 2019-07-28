package typings.winrtDashUwp.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaPlaybackAutoRepeatMode extends js.Object

/** Specifies the auto repeat mode for media playback. */
@JSGlobal("Windows.Media.MediaPlaybackAutoRepeatMode")
@js.native
object MediaPlaybackAutoRepeatMode extends js.Object {
  /** Repeat the current list of tracks. */
  @js.native
  sealed trait list extends MediaPlaybackAutoRepeatMode
  
  /** No repeating. */
  @js.native
  sealed trait none extends MediaPlaybackAutoRepeatMode
  
  /** Repeat the current track. */
  @js.native
  sealed trait track extends MediaPlaybackAutoRepeatMode
  
  /* 2 */ val list: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPlaybackAutoRepeatMode.list with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPlaybackAutoRepeatMode.none with Double = js.native
  /* 1 */ val track: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPlaybackAutoRepeatMode.track with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPlaybackAutoRepeatMode with Double] = js.native
}

