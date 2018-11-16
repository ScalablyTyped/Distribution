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
  
  val cleared: cleared with java.lang.String = js.native
  val completed: completed with java.lang.String = js.native
  val flagged: flagged with java.lang.String = js.native
  val unflagged: unflagged with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailFlagState with java.lang.String
  ] = js.native
}

