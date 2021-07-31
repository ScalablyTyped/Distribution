package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatMessageValidationStatus extends StObject
/** Specifies the validation state of a chat message such as valid, no recipients, or too many attachments. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageValidationStatus")
@js.native
object ChatMessageValidationStatus extends StObject {
  
  /** Invalid body */
  @js.native
  sealed trait invalidBody
    extends StObject
       with ChatMessageValidationStatus
  
  /** Invalid data */
  @js.native
  sealed trait invalidData
    extends StObject
       with ChatMessageValidationStatus
  
  /** Invalid other */
  @js.native
  sealed trait invalidOther
    extends StObject
       with ChatMessageValidationStatus
  
  /** Invalid recipients */
  @js.native
  sealed trait invalidRecipients
    extends StObject
       with ChatMessageValidationStatus
  
  /** Message too large */
  @js.native
  sealed trait messageTooLarge
    extends StObject
       with ChatMessageValidationStatus
  
  /** No recipients */
  @js.native
  sealed trait noRecipients
    extends StObject
       with ChatMessageValidationStatus
  
  /** Too many attachments */
  @js.native
  sealed trait tooManyAttachments
    extends StObject
       with ChatMessageValidationStatus
  
  /** Too many recipients */
  @js.native
  sealed trait tooManyRecipients
    extends StObject
       with ChatMessageValidationStatus
  
  /** Transport inactive */
  @js.native
  sealed trait transportInactive
    extends StObject
       with ChatMessageValidationStatus
  
  /** Transport not found */
  @js.native
  sealed trait transportNotFound
    extends StObject
       with ChatMessageValidationStatus
  
  /** Valid */
  @js.native
  sealed trait valid
    extends StObject
       with ChatMessageValidationStatus
}
