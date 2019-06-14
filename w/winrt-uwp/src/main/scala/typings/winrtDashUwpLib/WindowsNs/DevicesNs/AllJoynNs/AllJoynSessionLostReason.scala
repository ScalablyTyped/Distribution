package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AllJoynSessionLostReason extends js.Object

/** Defines values used by AllJoynSessionLostEventArgs to indicate the reason for a lost session. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionLostReason")
@js.native
object AllJoynSessionLostReason extends js.Object {
  /** The connection supporting the session timed out. */
  @js.native
  sealed trait linkTimeout
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynSessionLostReason
  
  /** No reason indicated. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynSessionLostReason
  
  /** The session was lost due to any other reason. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynSessionLostReason
  
  /** The Producer closed the session unexpectedly. */
  @js.native
  sealed trait producerClosedAbruptly
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynSessionLostReason
  
  /** The Producer left the session. */
  @js.native
  sealed trait producerLeftSession
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynSessionLostReason
  
  /** The Consumer was removed from the session by the Producer. */
  @js.native
  sealed trait removedByProducer
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynSessionLostReason
  
  /* 4 */ val linkTimeout: linkTimeout with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 5 */ val other: other with scala.Double = js.native
  /* 2 */ val producerClosedAbruptly: producerClosedAbruptly with scala.Double = js.native
  /* 1 */ val producerLeftSession: producerLeftSession with scala.Double = js.native
  /* 3 */ val removedByProducer: removedByProducer with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynSessionLostReason with scala.Double
  ] = js.native
}

