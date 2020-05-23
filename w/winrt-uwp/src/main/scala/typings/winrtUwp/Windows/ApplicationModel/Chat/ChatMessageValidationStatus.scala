package typings.winrtUwp.Windows.ApplicationModel.Chat

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
  
}

