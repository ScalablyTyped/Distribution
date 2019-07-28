package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs

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
  sealed trait invalidBody extends ChatMessageValidationStatus
  
  /** Invalid data */
  @js.native
  sealed trait invalidData extends ChatMessageValidationStatus
  
  /** Invalid other */
  @js.native
  sealed trait invalidOther extends ChatMessageValidationStatus
  
  /** Invalid recipients */
  @js.native
  sealed trait invalidRecipients extends ChatMessageValidationStatus
  
  /** Message too large */
  @js.native
  sealed trait messageTooLarge extends ChatMessageValidationStatus
  
  /** No recipients */
  @js.native
  sealed trait noRecipients extends ChatMessageValidationStatus
  
  /** Too many attachments */
  @js.native
  sealed trait tooManyAttachments extends ChatMessageValidationStatus
  
  /** Too many recipients */
  @js.native
  sealed trait tooManyRecipients extends ChatMessageValidationStatus
  
  /** Transport inactive */
  @js.native
  sealed trait transportInactive extends ChatMessageValidationStatus
  
  /** Transport not found */
  @js.native
  sealed trait transportNotFound extends ChatMessageValidationStatus
  
  /** Valid */
  @js.native
  sealed trait valid extends ChatMessageValidationStatus
  
  /* 9 */ val invalidBody: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus.invalidBody with Double = js.native
  /* 2 */ val invalidData: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus.invalidData with Double = js.native
  /* 10 */ val invalidOther: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus.invalidOther with Double = js.native
  /* 8 */ val invalidRecipients: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus.invalidRecipients with Double = js.native
  /* 3 */ val messageTooLarge: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus.messageTooLarge with Double = js.native
  /* 1 */ val noRecipients: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus.noRecipients with Double = js.native
  /* 7 */ val tooManyAttachments: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus.tooManyAttachments with Double = js.native
  /* 4 */ val tooManyRecipients: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus.tooManyRecipients with Double = js.native
  /* 5 */ val transportInactive: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus.transportInactive with Double = js.native
  /* 6 */ val transportNotFound: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus.transportNotFound with Double = js.native
  /* 0 */ val valid: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageValidationStatus.valid with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatMessageValidationStatus with Double] = js.native
}

