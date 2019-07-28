package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailFlagState extends js.Object

/** Defines the flag state of an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailFlagState")
@js.native
object EmailFlagState extends js.Object {
  /** The email was flagged for follow up and the flag has been cleared. */
  @js.native
  sealed trait cleared extends EmailFlagState
  
  /** The email was flagged for follow up and has been marked completed. */
  @js.native
  sealed trait completed extends EmailFlagState
  
  /** The email has been flagged for follow up. */
  @js.native
  sealed trait flagged extends EmailFlagState
  
  /** The email has not been flagged for follow up. */
  @js.native
  sealed trait unflagged extends EmailFlagState
  
  /* 3 */ val cleared: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailFlagState.cleared with Double = js.native
  /* 2 */ val completed: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailFlagState.completed with Double = js.native
  /* 1 */ val flagged: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailFlagState.flagged with Double = js.native
  /* 0 */ val unflagged: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailFlagState.unflagged with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailFlagState with Double] = js.native
}

