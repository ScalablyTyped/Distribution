package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait cleared
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailFlagState
  
  /** The email was flagged for follow up and has been marked completed. */
  @js.native
  sealed trait completed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailFlagState
  
  /** The email has been flagged for follow up. */
  @js.native
  sealed trait flagged
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailFlagState
  
  /** The email has not been flagged for follow up. */
  @js.native
  sealed trait unflagged
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailFlagState
  
  /* 3 */ val cleared: cleared with scala.Double = js.native
  /* 2 */ val completed: completed with scala.Double = js.native
  /* 1 */ val flagged: flagged with scala.Double = js.native
  /* 0 */ val unflagged: unflagged with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailFlagState with scala.Double
  ] = js.native
}

