package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemMediaTransportControlsButton extends StObject
/** Defines values for the buttons on the SystemMediaTransportControls . */
@JSGlobal("Windows.Media.SystemMediaTransportControlsButton")
@js.native
object SystemMediaTransportControlsButton extends StObject {
  
  /** The channel down button. */
  @js.native
  sealed trait channelDown
    extends StObject
       with SystemMediaTransportControlsButton
  
  /** The channel up button. */
  @js.native
  sealed trait channelUp
    extends StObject
       with SystemMediaTransportControlsButton
  
  /** The fast forward button. */
  @js.native
  sealed trait fastForward
    extends StObject
       with SystemMediaTransportControlsButton
  
  /** The next button. */
  @js.native
  sealed trait next
    extends StObject
       with SystemMediaTransportControlsButton
  
  /** The pause button. */
  @js.native
  sealed trait pause
    extends StObject
       with SystemMediaTransportControlsButton
  
  /** The play button. */
  @js.native
  sealed trait play
    extends StObject
       with SystemMediaTransportControlsButton
  
  /** The previous button. */
  @js.native
  sealed trait previous
    extends StObject
       with SystemMediaTransportControlsButton
  
  /** The record button. */
  @js.native
  sealed trait record
    extends StObject
       with SystemMediaTransportControlsButton
  
  /** The rewind button. */
  @js.native
  sealed trait rewind
    extends StObject
       with SystemMediaTransportControlsButton
  
  /** The stop button. */
  @js.native
  sealed trait stop
    extends StObject
       with SystemMediaTransportControlsButton
}
