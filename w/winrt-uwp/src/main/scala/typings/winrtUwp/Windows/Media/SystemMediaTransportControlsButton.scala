package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
