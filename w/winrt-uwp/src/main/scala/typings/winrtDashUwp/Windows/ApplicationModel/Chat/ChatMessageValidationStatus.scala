package typings.winrtDashUwp.Windows.ApplicationModel.Chat

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
  
  /* 9 */ val invalidBody: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageValidationStatus.invalidBody with Double = js.native
  /* 2 */ val invalidData: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageValidationStatus.invalidData with Double = js.native
  /* 10 */ val invalidOther: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageValidationStatus.invalidOther with Double = js.native
  /* 8 */ val invalidRecipients: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageValidationStatus.invalidRecipients with Double = js.native
  /* 3 */ val messageTooLarge: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageValidationStatus.messageTooLarge with Double = js.native
  /* 1 */ val noRecipients: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageValidationStatus.noRecipients with Double = js.native
  /* 7 */ val tooManyAttachments: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageValidationStatus.tooManyAttachments with Double = js.native
  /* 4 */ val tooManyRecipients: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageValidationStatus.tooManyRecipients with Double = js.native
  /* 5 */ val transportInactive: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageValidationStatus.transportInactive with Double = js.native
  /* 6 */ val transportNotFound: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageValidationStatus.transportNotFound with Double = js.native
  /* 0 */ val valid: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageValidationStatus.valid with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatMessageValidationStatus with Double] = js.native
}

