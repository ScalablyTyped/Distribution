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
  
  /* 1 */ val changing: changing with scala.Double = js.native
  /* 0 */ val closed: closed with scala.Double = js.native
  /* 4 */ val paused: paused with scala.Double = js.native
  /* 3 */ val playing: playing with scala.Double = js.native
  /* 2 */ val stopped: stopped with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.MediaPlaybackStatus with scala.Double] = js.native
}

