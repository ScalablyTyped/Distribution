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
  
  val accept: accept with java.lang.String = js.native
  val decline: decline with java.lang.String = js.native
  val tentative: tentative with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMeetingResponseType with java.lang.String
  ] = js.native
}

