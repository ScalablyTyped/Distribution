package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represent the delivery info about a chat recipient. */
trait ChatRecipientDeliveryInfo extends js.Object {
  /** Gets or sets the time the message was sent to the recipient. */
  var deliveryTime: Date
  /** Gets a Boolean value indicating whether the error for the message that was sent to the recipient is permanent. */
  var isErrorPermanent: Boolean
  /** Gets or sets the time the recipient read the message. */
  var readTime: Date
  /** Gets the status of the message. */
  var status: ChatMessageStatus
  /** Gets or sets the transport address of the recipient. */
  var transportAddress: String
  /** Get the transport error code. */
  var transportErrorCode: Double
  /** Gets the category for the TransportErrorCode . */
  var transportErrorCodeCategory: ChatTransportErrorCodeCategory
  /** Gets the interpreted error code for the transport. */
  var transportInterpretedErrorCode: ChatTransportInterpretedErrorCode
}

object ChatRecipientDeliveryInfo {
  @scala.inline
  def apply(
    deliveryTime: Date,
    isErrorPermanent: Boolean,
    readTime: Date,
    status: ChatMessageStatus,
    transportAddress: String,
    transportErrorCode: Double,
    transportErrorCodeCategory: ChatTransportErrorCodeCategory,
    transportInterpretedErrorCode: ChatTransportInterpretedErrorCode
  ): ChatRecipientDeliveryInfo = {
    val __obj = js.Dynamic.literal(deliveryTime = deliveryTime.asInstanceOf[js.Any], isErrorPermanent = isErrorPermanent.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transportAddress = transportAddress.asInstanceOf[js.Any], transportErrorCode = transportErrorCode.asInstanceOf[js.Any], transportErrorCodeCategory = transportErrorCodeCategory.asInstanceOf[js.Any], transportInterpretedErrorCode = transportInterpretedErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRecipientDeliveryInfo]
  }
}

