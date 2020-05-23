package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides results for validation of chat messages. */
trait ChatMessageValidationResult extends js.Object {
  /** Gets the maximum number of text fragments allowed for a message. This value has meaning when the SMS text portion of a message is validated. */
  var maxPartCount: Double
  /** Gets the total number of text fragments needed for this message. This value has meaning when the SMS text portion of a message is validated. */
  var partCount: Double
  /** Gets the number of characters not used in the final message fragments. This value has meaning when the SMS text portion of a message is validated. */
  var remainingCharacterCountInPart: Double
  /** Gets the message validation status code. */
  var status: ChatMessageValidationStatus
}

object ChatMessageValidationResult {
  @scala.inline
  def apply(
    maxPartCount: Double,
    partCount: Double,
    remainingCharacterCountInPart: Double,
    status: ChatMessageValidationStatus
  ): ChatMessageValidationResult = {
    val __obj = js.Dynamic.literal(maxPartCount = maxPartCount.asInstanceOf[js.Any], partCount = partCount.asInstanceOf[js.Any], remainingCharacterCountInPart = remainingCharacterCountInPart.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageValidationResult]
  }
}

