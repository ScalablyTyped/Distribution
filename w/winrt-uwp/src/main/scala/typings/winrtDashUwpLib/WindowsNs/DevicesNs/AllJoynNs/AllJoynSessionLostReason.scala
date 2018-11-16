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
  
  val linkTimeout: linkTimeout with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  val producerClosedAbruptly: producerClosedAbruptly with java.lang.String = js.native
  val producerLeftSession: producerLeftSession with java.lang.String = js.native
  val removedByProducer: removedByProducer with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynSessionLostReason with java.lang.String
  ] = js.native
}

