package typings
package winrtDashUwpLib.WindowsNs.MediaNs

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
  sealed trait changing
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackStatus
  
  /** The media is closd. */
  @js.native
  sealed trait closed
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackStatus
  
  /** The media is paused. */
  @js.native
  sealed trait paused
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackStatus
  
  /** The media is playing. */
  @js.native
  sealed trait playing
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackStatus
  
  /** The media is stopped. */
  @js.native
  sealed trait stopped
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackStatus
  
  val changing: changing with java.lang.String = js.native
  val closed: closed with java.lang.String = js.native
  val paused: paused with java.lang.String = js.native
  val playing: playing with java.lang.String = js.native
  val stopped: stopped with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackStatus with java.lang.String] = js.native
}

