package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represent the delivery info about a chat recipient. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatRecipientDeliveryInfo")
@js.native
/** Initializes a new instance of the ChatRecipientDeliveryInfo class. */
class ChatRecipientDeliveryInfo ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.ChatRecipientDeliveryInfo {
  /** Gets or sets the time the message was sent to the recipient. */
  /* CompleteClass */
  override var deliveryTime: Date = js.native
  /** Gets a Boolean value indicating whether the error for the message that was sent to the recipient is permanent. */
  /* CompleteClass */
  override var isErrorPermanent: Boolean = js.native
  /** Gets or sets the time the recipient read the message. */
  /* CompleteClass */
  override var readTime: Date = js.native
  /** Gets the status of the message. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageStatus = js.native
  /** Gets or sets the transport address of the recipient. */
  /* CompleteClass */
  override var transportAddress: String = js.native
  /** Get the transport error code. */
  /* CompleteClass */
  override var transportErrorCode: Double = js.native
  /** Gets the category for the TransportErrorCode . */
  /* CompleteClass */
  override var transportErrorCodeCategory: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatTransportErrorCodeCategory = js.native
  /** Gets the interpreted error code for the transport. */
  /* CompleteClass */
  override var transportInterpretedErrorCode: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatTransportInterpretedErrorCode = js.native
}

