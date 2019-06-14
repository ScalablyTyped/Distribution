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
  
  /* 9 */ val invalidBody: invalidBody with scala.Double = js.native
  /* 2 */ val invalidData: invalidData with scala.Double = js.native
  /* 10 */ val invalidOther: invalidOther with scala.Double = js.native
  /* 8 */ val invalidRecipients: invalidRecipients with scala.Double = js.native
  /* 3 */ val messageTooLarge: messageTooLarge with scala.Double = js.native
  /* 1 */ val noRecipients: noRecipients with scala.Double = js.native
  /* 7 */ val tooManyAttachments: tooManyAttachments with scala.Double = js.native
  /* 4 */ val tooManyRecipients: tooManyRecipients with scala.Double = js.native
  /* 5 */ val transportInactive: transportInactive with scala.Double = js.native
  /* 6 */ val transportNotFound: transportNotFound with scala.Double = js.native
  /* 0 */ val valid: valid with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus with scala.Double
  ] = js.native
}

