package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMeetingResponseType extends js.Object

/** Defines the type of response to a meeting request. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMeetingResponseType")
@js.native
object EmailMeetingResponseType extends js.Object {
  /** The meeting was accepted. */
  @js.native
  sealed trait accept extends EmailMeetingResponseType
  
  /** The meeting was declined. */
  @js.native
  sealed trait decline extends EmailMeetingResponseType
  
  /** The meeting was tentatively accepted. */
  @js.native
  sealed trait tentative extends EmailMeetingResponseType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMeetingResponseType with Double] = js.native
  /* 0 */ @js.native
  object accept extends TopLevel[accept with Double]
  
  /* 1 */ @js.native
  object decline extends TopLevel[decline with Double]
  
  /* 2 */ @js.native
  object tentative extends TopLevel[tentative with Double]
  
}

