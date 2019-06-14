package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait accept
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMeetingResponseType
  
  /** The meeting was declined. */
  @js.native
  sealed trait decline
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMeetingResponseType
  
  /** The meeting was tentatively accepted. */
  @js.native
  sealed trait tentative
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMeetingResponseType
  
  /* 0 */ val accept: accept with scala.Double = js.native
  /* 1 */ val decline: decline with scala.Double = js.native
  /* 2 */ val tentative: tentative with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMeetingResponseType with scala.Double
  ] = js.native
}

