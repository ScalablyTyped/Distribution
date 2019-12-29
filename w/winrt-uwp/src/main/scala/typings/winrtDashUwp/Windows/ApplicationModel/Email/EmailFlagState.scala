package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailFlagState with Double] = js.native
  /* 3 */ @js.native
  object cleared extends TopLevel[cleared with Double]
  
  /* 2 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 1 */ @js.native
  object flagged extends TopLevel[flagged with Double]
  
  /* 0 */ @js.native
  object unflagged extends TopLevel[unflagged with Double]
  
}

