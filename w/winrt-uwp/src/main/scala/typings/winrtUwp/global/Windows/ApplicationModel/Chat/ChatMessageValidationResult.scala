package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides results for validation of chat messages. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageValidationResult")
@js.native
abstract class ChatMessageValidationResult ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageValidationResult {
  /** Gets the maximum number of text fragments allowed for a message. This value has meaning when the SMS text portion of a message is validated. */
  /* CompleteClass */
  override var maxPartCount: Double = js.native
  /** Gets the total number of text fragments needed for this message. This value has meaning when the SMS text portion of a message is validated. */
  /* CompleteClass */
  override var partCount: Double = js.native
  /** Gets the number of characters not used in the final message fragments. This value has meaning when the SMS text portion of a message is validated. */
  /* CompleteClass */
  override var remainingCharacterCountInPart: Double = js.native
  /** Gets the message validation status code. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageValidationStatus = js.native
}

