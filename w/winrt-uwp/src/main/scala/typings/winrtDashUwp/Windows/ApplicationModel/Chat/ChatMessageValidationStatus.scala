package typings.winrtDashUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatMessageValidationStatus with Double] = js.native
  /* 9 */ @js.native
  object invalidBody extends TopLevel[invalidBody with Double]
  
  /* 2 */ @js.native
  object invalidData extends TopLevel[invalidData with Double]
  
  /* 10 */ @js.native
  object invalidOther extends TopLevel[invalidOther with Double]
  
  /* 8 */ @js.native
  object invalidRecipients extends TopLevel[invalidRecipients with Double]
  
  /* 3 */ @js.native
  object messageTooLarge extends TopLevel[messageTooLarge with Double]
  
  /* 1 */ @js.native
  object noRecipients extends TopLevel[noRecipients with Double]
  
  /* 7 */ @js.native
  object tooManyAttachments extends TopLevel[tooManyAttachments with Double]
  
  /* 4 */ @js.native
  object tooManyRecipients extends TopLevel[tooManyRecipients with Double]
  
  /* 5 */ @js.native
  object transportInactive extends TopLevel[transportInactive with Double]
  
  /* 6 */ @js.native
  object transportNotFound extends TopLevel[transportNotFound with Double]
  
  /* 0 */ @js.native
  object valid extends TopLevel[valid with Double]
  
}

