package typings.winrtDashUwp.WindowsNs.MediaNs

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
  sealed trait channelDown extends SystemMediaTransportControlsButton
  
  /** The channel up button. */
  @js.native
  sealed trait channelUp extends SystemMediaTransportControlsButton
  
  /** The fast forward button. */
  @js.native
  sealed trait fastForward extends SystemMediaTransportControlsButton
  
  /** The next button. */
  @js.native
  sealed trait next extends SystemMediaTransportControlsButton
  
  /** The pause button. */
  @js.native
  sealed trait pause extends SystemMediaTransportControlsButton
  
  /** The play button. */
  @js.native
  sealed trait play extends SystemMediaTransportControlsButton
  
  /** The previous button. */
  @js.native
  sealed trait previous extends SystemMediaTransportControlsButton
  
  /** The record button. */
  @js.native
  sealed trait record extends SystemMediaTransportControlsButton
  
  /** The rewind button. */
  @js.native
  sealed trait rewind extends SystemMediaTransportControlsButton
  
  /** The stop button. */
  @js.native
  sealed trait stop extends SystemMediaTransportControlsButton
  
  /* 9 */ val channelDown: typings.winrtDashUwp.WindowsNs.MediaNs.SystemMediaTransportControlsButton.channelDown with Double = js.native
  /* 8 */ val channelUp: typings.winrtDashUwp.WindowsNs.MediaNs.SystemMediaTransportControlsButton.channelUp with Double = js.native
  /* 4 */ val fastForward: typings.winrtDashUwp.WindowsNs.MediaNs.SystemMediaTransportControlsButton.fastForward with Double = js.native
  /* 6 */ val next: typings.winrtDashUwp.WindowsNs.MediaNs.SystemMediaTransportControlsButton.next with Double = js.native
  /* 1 */ val pause: typings.winrtDashUwp.WindowsNs.MediaNs.SystemMediaTransportControlsButton.pause with Double = js.native
  /* 0 */ val play: typings.winrtDashUwp.WindowsNs.MediaNs.SystemMediaTransportControlsButton.play with Double = js.native
  /* 7 */ val previous: typings.winrtDashUwp.WindowsNs.MediaNs.SystemMediaTransportControlsButton.previous with Double = js.native
  /* 3 */ val record: typings.winrtDashUwp.WindowsNs.MediaNs.SystemMediaTransportControlsButton.record with Double = js.native
  /* 5 */ val rewind: typings.winrtDashUwp.WindowsNs.MediaNs.SystemMediaTransportControlsButton.rewind with Double = js.native
  /* 2 */ val stop: typings.winrtDashUwp.WindowsNs.MediaNs.SystemMediaTransportControlsButton.stop with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SystemMediaTransportControlsButton with Double] = js.native
}

