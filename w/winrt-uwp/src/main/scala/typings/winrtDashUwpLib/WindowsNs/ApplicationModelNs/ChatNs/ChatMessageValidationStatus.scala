package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatMessageValidationStatus extends js.Object

/** Specifies the validation state of a chat message such as valid, no recipients, or too many attachments. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageValidationStatus")
@js.native
object ChatMessageValidationStatus extends js.Object {
  /** Invalid body */
  @js.native
  sealed trait invalidBody
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus
  
  /** Invalid data */
  @js.native
  sealed trait invalidData
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus
  
  /** Invalid other */
  @js.native
  sealed trait invalidOther
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus
  
  /** Invalid recipients */
  @js.native
  sealed trait invalidRecipients
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus
  
  /** Message too large */
  @js.native
  sealed trait messageTooLarge
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus
  
  /** No recipients */
  @js.native
  sealed trait noRecipients
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus
  
  /** Too many attachments */
  @js.native
  sealed trait tooManyAttachments
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus
  
  /** Too many recipients */
  @js.native
  sealed trait tooManyRecipients
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus
  
  /** Transport inactive */
  @js.native
  sealed trait transportInactive
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus
  
  /** Transport not found */
  @js.native
  sealed trait transportNotFound
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus
  
  /** Valid */
  @js.native
  sealed trait valid
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus
  
  val invalidBody: invalidBody with java.lang.String = js.native
  val invalidData: invalidData with java.lang.String = js.native
  val invalidOther: invalidOther with java.lang.String = js.native
  val invalidRecipients: invalidRecipients with java.lang.String = js.native
  val messageTooLarge: messageTooLarge with java.lang.String = js.native
  val noRecipients: noRecipients with java.lang.String = js.native
  val tooManyAttachments: tooManyAttachments with java.lang.String = js.native
  val tooManyRecipients: tooManyRecipients with java.lang.String = js.native
  val transportInactive: transportInactive with java.lang.String = js.native
  val transportNotFound: transportNotFound with java.lang.String = js.native
  val valid: valid with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus with java.lang.String
  ] = js.native
}

