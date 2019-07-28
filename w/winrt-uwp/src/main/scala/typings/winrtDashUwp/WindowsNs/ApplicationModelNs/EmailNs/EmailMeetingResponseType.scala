package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

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
  
  /* 0 */ val accept: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMeetingResponseType.accept with Double = js.native
  /* 1 */ val decline: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMeetingResponseType.decline with Double = js.native
  /* 2 */ val tentative: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMeetingResponseType.tentative with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMeetingResponseType with Double] = js.native
}

