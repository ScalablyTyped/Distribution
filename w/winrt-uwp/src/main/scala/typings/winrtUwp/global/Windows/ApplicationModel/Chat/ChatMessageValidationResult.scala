package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides results for validation of chat messages. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Chat.ChatMessageValidationResult")
@js.native
open class ChatMessageValidationResult ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageValidationResult {
  
  /** Gets the maximum number of text fragments allowed for a message. This value has meaning when the SMS text portion of a message is validated. */
  /* CompleteClass */
  var maxPartCount: Double = js.native
  
  /** Gets the total number of text fragments needed for this message. This value has meaning when the SMS text portion of a message is validated. */
  /* CompleteClass */
  var partCount: Double = js.native
  
  /** Gets the number of characters not used in the final message fragments. This value has meaning when the SMS text portion of a message is validated. */
  /* CompleteClass */
  var remainingCharacterCountInPart: Double = js.native
  
  /** Gets the message validation status code. */
  /* CompleteClass */
  var status: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageValidationStatus = js.native
}
