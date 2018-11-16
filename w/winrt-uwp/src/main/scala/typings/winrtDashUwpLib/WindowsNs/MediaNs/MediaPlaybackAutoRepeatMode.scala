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
  
  val list: list with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val track: track with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackAutoRepeatMode with java.lang.String
  ] = js.native
}

