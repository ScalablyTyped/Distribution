package typings.winrtDashUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.TopLevel
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
  sealed trait linkTimeout extends AllJoynSessionLostReason
  
  /** No reason indicated. */
  @js.native
  sealed trait none extends AllJoynSessionLostReason
  
  /** The session was lost due to any other reason. */
  @js.native
  sealed trait other extends AllJoynSessionLostReason
  
  /** The Producer closed the session unexpectedly. */
  @js.native
  sealed trait producerClosedAbruptly extends AllJoynSessionLostReason
  
  /** The Producer left the session. */
  @js.native
  sealed trait producerLeftSession extends AllJoynSessionLostReason
  
  /** The Consumer was removed from the session by the Producer. */
  @js.native
  sealed trait removedByProducer extends AllJoynSessionLostReason
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AllJoynSessionLostReason with Double] = js.native
  /* 4 */ @js.native
  object linkTimeout extends TopLevel[linkTimeout with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 5 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 2 */ @js.native
  object producerClosedAbruptly extends TopLevel[producerClosedAbruptly with Double]
  
  /* 1 */ @js.native
  object producerLeftSession extends TopLevel[producerLeftSession with Double]
  
  /* 3 */ @js.native
  object removedByProducer extends TopLevel[removedByProducer with Double]
  
}

