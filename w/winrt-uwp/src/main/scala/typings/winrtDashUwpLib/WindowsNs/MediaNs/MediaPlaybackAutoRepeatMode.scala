package typings
package winrtDashUwpLib.WindowsNs.MediaNs

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
  sealed trait list
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackAutoRepeatMode
  
  /** No repeating. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackAutoRepeatMode
  
  /** Repeat the current track. */
  @js.native
  sealed trait track
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackAutoRepeatMode
  
  /* 2 */ val list: list with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val track: track with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackAutoRepeatMode with scala.Double] = js.native
}

