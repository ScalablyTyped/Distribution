package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
