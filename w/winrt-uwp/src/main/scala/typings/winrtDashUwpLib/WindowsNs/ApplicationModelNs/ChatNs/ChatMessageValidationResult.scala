package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides results for validation of chat messages. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageValidationResult")
@js.native
abstract class ChatMessageValidationResult () extends js.Object {
  /** Gets the maximum number of text fragments allowed for a message. This value has meaning when the SMS text portion of a message is validated. */
  var maxPartCount: scala.Double = js.native
  /** Gets the total number of text fragments needed for this message. This value has meaning when the SMS text portion of a message is validated. */
  var partCount: scala.Double = js.native
  /** Gets the number of characters not used in the final message fragments. This value has meaning when the SMS text portion of a message is validated. */
  var remainingCharacterCountInPart: scala.Double = js.native
  /** Gets the message validation status code. */
  var status: ChatMessageValidationStatus = js.native
}

