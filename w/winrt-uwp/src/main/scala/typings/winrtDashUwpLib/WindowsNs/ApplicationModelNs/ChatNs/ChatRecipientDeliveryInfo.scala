package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represent the delivery info about a chat recipient. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatRecipientDeliveryInfo")
@js.native
class ChatRecipientDeliveryInfo () extends js.Object {
  /** Gets or sets the time the message was sent to the recipient. */
  var deliveryTime: stdLib.Date = js.native
  /** Gets a Boolean value indicating whether the error for the message that was sent to the recipient is permanent. */
  var isErrorPermanent: scala.Boolean = js.native
  /** Gets or sets the time the recipient read the message. */
  var readTime: stdLib.Date = js.native
  /** Gets the status of the message. */
  var status: ChatMessageStatus = js.native
  /** Gets or sets the transport address of the recipient. */
  var transportAddress: java.lang.String = js.native
  /** Get the transport error code. */
  var transportErrorCode: scala.Double = js.native
  /** Gets the category for the TransportErrorCode . */
  var transportErrorCodeCategory: ChatTransportErrorCodeCategory = js.native
  /** Gets the interpreted error code for the transport. */
  var transportInterpretedErrorCode: ChatTransportInterpretedErrorCode = js.native
}

