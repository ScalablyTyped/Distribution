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
  
  val channelDown: channelDown with java.lang.String = js.native
  val channelUp: channelUp with java.lang.String = js.native
  val fastForward: fastForward with java.lang.String = js.native
  val next: next with java.lang.String = js.native
  val pause: pause with java.lang.String = js.native
  val play: play with java.lang.String = js.native
  val previous: previous with java.lang.String = js.native
  val record: record with java.lang.String = js.native
  val rewind: rewind with java.lang.String = js.native
  val stop: stop with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SystemMediaTransportControlsButton with java.lang.String
  ] = js.native
}

