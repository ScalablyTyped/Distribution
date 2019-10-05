package typings.winrtDashUwp.Windows.ApplicationModel.Chat

import typings.std.Date
import typings.winrtDashUwp.Windows.Foundation.Collections.IMapView
import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a chat message. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessage")
@js.native
/** Creates a new instance of the ChatMessage class. */
class ChatMessage () extends js.Object {
  /** Gets a list of chat message attachments. */
  var attachments: IVector[ChatMessageAttachment] = js.native
  /** Gets or sets the body of the chat message. */
  var body: String = js.native
  /** Gets or sets the estimated size of a file to be sent or received. */
  var estimatedDownloadSize: Double = js.native
  /** Gets the identifier or address of the sender of the message. */
  var from: String = js.native
  /** Gets the identifier of the message. */
  var id: String = js.native
  /** Gets or sets a Boolean value indicating if the message is an auto-reply. */
  var isAutoReply: Boolean = js.native
  /** Gets a Boolean value indicating if forwarding is disabled. */
  var isForwardingDisabled: Boolean = js.native
  /** Gets Boolean a value indicating if the message is incoming or outgoing. */
  var isIncoming: Boolean = js.native
  /** Gets a Boolean value indicating if the message has been read. */
  var isRead: Boolean = js.native
  /** Gets or sets a Boolean value indicating if the message was received during user specified quiet hours. */
  var isReceivedDuringQuietHours: Boolean = js.native
  /** Gets a Boolean value indicating if reply is disabled on the ChatMessage . */
  var isReplyDisabled: Boolean = js.native
  /** Gets or sets a Boolean value indicating if the message has been seen. */
  var isSeen: Boolean = js.native
  /** Gets a Boolean value indicating if the message is stored on a SIM card. */
  var isSimMessage: Boolean = js.native
  /** Gets the local timestamp of the message. */
  var localTimestamp: Date = js.native
  /** Gets or sets the type of the ChatMessage . */
  var messageKind: ChatMessageKind = js.native
  /** Gets or sets a value indicating the type of message operator, such as SMS, MMS, or RCS. */
  var messageOperatorKind: ChatMessageOperatorKind = js.native
  /** Gets the network timestamp of the message. */
  var networkTimestamp: Date = js.native
  /** Gets the list of send statuses for the message. */
  var recipientSendStatuses: IMapView[String, ChatMessageStatus] = js.native
  /** Gets the list of recipients of the message. */
  var recipients: IVector[String] = js.native
  /** Gets the delivery info for each of the recipients of the ChatMessage . */
  var recipientsDeliveryInfos: IVector[ChatRecipientDeliveryInfo] = js.native
  /** Gets or sets the remote ID for the ChatMessage . */
  var remoteId: String = js.native
  /** Gets or sets a Boolean value indicating if notification of receiving the ChatMessage should be suppressed. */
  var shouldSuppressNotification: Boolean = js.native
  /** Gets the status of the message. Typical states include draft, sent, received, deleted, etc. */
  var status: ChatMessageStatus = js.native
  /** Gets the subject of the message. */
  var subject: String = js.native
  /** Gets or sets the conversation threading info for the ChatMessage . */
  var threadingInfo: ChatConversationThreadingInfo = js.native
  /** Gets the transport friendly name of the message. */
  var transportFriendlyName: String = js.native
  /** Gets or sets the transport ID of the message. */
  var transportId: String = js.native
}

