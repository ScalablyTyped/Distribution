package typings
package winrtDashUwpLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemMediaTransportControlsButton extends js.Object

/** Defines values for the buttons on the SystemMediaTransportControls . */
@JSGlobal("Windows.Media.SystemMediaTransportControlsButton")
@js.native
object SystemMediaTransportControlsButton extends js.Object {
  /** The channel down button. */
  @js.native
  sealed trait channelDown
    extends winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControlsButton
  
  /** The channel up button. */
  @js.native
  sealed trait channelUp
    extends winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControlsButton
  
  /** The fast forward button. */
  @js.native
  sealed trait fastForward
    extends winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControlsButton
  
  /** The next button. */
  @js.native
  sealed trait next
    extends winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControlsButton
  
  /** The pause button. */
  @js.native
  sealed trait pause
    extends winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControlsButton
  
  /** The play button. */
  @js.native
  sealed trait play
    extends winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControlsButton
  
  /** The previous button. */
  @js.native
  sealed trait previous
    extends winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControlsButton
  
  /** The record button. */
  @js.native
  sealed trait record
    extends winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControlsButton
  
  /** The rewind button. */
  @js.native
  sealed trait rewind
    extends winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControlsButton
  
  /** The stop button. */
  @js.native
  sealed trait stop
    extends winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControlsButton
  
  /* 9 */ val channelDown: channelDown with scala.Double = js.native
  /* 8 */ val channelUp: channelUp with scala.Double = js.native
  /* 4 */ val fastForward: fastForward with scala.Double = js.native
  /* 6 */ val next: next with scala.Double = js.native
  /* 1 */ val pause: pause with scala.Double = js.native
  /* 0 */ val play: play with scala.Double = js.native
  /* 7 */ val previous: previous with scala.Double = js.native
  /* 3 */ val record: record with scala.Double = js.native
  /* 5 */ val rewind: rewind with scala.Double = js.native
  /* 2 */ val stop: stop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControlsButton with scala.Double
  ] = js.native
}

