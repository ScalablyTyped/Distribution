package typings.winrtDashUwp.Windows.Media

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SystemMediaTransportControlsButton with Double] = js.native
  /* 9 */ @js.native
  object channelDown extends TopLevel[channelDown with Double]
  
  /* 8 */ @js.native
  object channelUp extends TopLevel[channelUp with Double]
  
  /* 4 */ @js.native
  object fastForward extends TopLevel[fastForward with Double]
  
  /* 6 */ @js.native
  object next extends TopLevel[next with Double]
  
  /* 1 */ @js.native
  object pause extends TopLevel[pause with Double]
  
  /* 0 */ @js.native
  object play extends TopLevel[play with Double]
  
  /* 7 */ @js.native
  object previous extends TopLevel[previous with Double]
  
  /* 3 */ @js.native
  object record extends TopLevel[record with Double]
  
  /* 5 */ @js.native
  object rewind extends TopLevel[rewind with Double]
  
  /* 2 */ @js.native
  object stop extends TopLevel[stop with Double]
  
}

