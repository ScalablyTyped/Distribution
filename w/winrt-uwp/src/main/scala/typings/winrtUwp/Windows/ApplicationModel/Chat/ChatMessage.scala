package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a chat message. */
trait ChatMessage extends js.Object {
  /** Gets a list of chat message attachments. */
  var attachments: IVector[ChatMessageAttachment]
  /** Gets or sets the body of the chat message. */
  var body: String
  /** Gets or sets the estimated size of a file to be sent or received. */
  var estimatedDownloadSize: Double
  /** Gets the identifier or address of the sender of the message. */
  var from: String
  /** Gets the identifier of the message. */
  var id: String
  /** Gets or sets a Boolean value indicating if the message is an auto-reply. */
  var isAutoReply: Boolean
  /** Gets a Boolean value indicating if forwarding is disabled. */
  var isForwardingDisabled: Boolean
  /** Gets Boolean a value indicating if the message is incoming or outgoing. */
  var isIncoming: Boolean
  /** Gets a Boolean value indicating if the message has been read. */
  var isRead: Boolean
  /** Gets or sets a Boolean value indicating if the message was received during user specified quiet hours. */
  var isReceivedDuringQuietHours: Boolean
  /** Gets a Boolean value indicating if reply is disabled on the ChatMessage . */
  var isReplyDisabled: Boolean
  /** Gets or sets a Boolean value indicating if the message has been seen. */
  var isSeen: Boolean
  /** Gets a Boolean value indicating if the message is stored on a SIM card. */
  var isSimMessage: Boolean
  /** Gets the local timestamp of the message. */
  var localTimestamp: Date
  /** Gets or sets the type of the ChatMessage . */
  var messageKind: ChatMessageKind
  /** Gets or sets a value indicating the type of message operator, such as SMS, MMS, or RCS. */
  var messageOperatorKind: ChatMessageOperatorKind
  /** Gets the network timestamp of the message. */
  var networkTimestamp: Date
  /** Gets the list of send statuses for the message. */
  var recipientSendStatuses: IMapView[String, ChatMessageStatus]
  /** Gets the list of recipients of the message. */
  var recipients: IVector[String]
  /** Gets the delivery info for each of the recipients of the ChatMessage . */
  var recipientsDeliveryInfos: IVector[ChatRecipientDeliveryInfo]
  /** Gets or sets the remote ID for the ChatMessage . */
  var remoteId: String
  /** Gets or sets a Boolean value indicating if notification of receiving the ChatMessage should be suppressed. */
  var shouldSuppressNotification: Boolean
  /** Gets the status of the message. Typical states include draft, sent, received, deleted, etc. */
  var status: ChatMessageStatus
  /** Gets the subject of the message. */
  var subject: String
  /** Gets or sets the conversation threading info for the ChatMessage . */
  var threadingInfo: ChatConversationThreadingInfo
  /** Gets the transport friendly name of the message. */
  var transportFriendlyName: String
  /** Gets or sets the transport ID of the message. */
  var transportId: String
}

object ChatMessage {
  @scala.inline
  def apply(
    attachments: IVector[ChatMessageAttachment],
    body: String,
    estimatedDownloadSize: Double,
    from: String,
    id: String,
    isAutoReply: Boolean,
    isForwardingDisabled: Boolean,
    isIncoming: Boolean,
    isRead: Boolean,
    isReceivedDuringQuietHours: Boolean,
    isReplyDisabled: Boolean,
    isSeen: Boolean,
    isSimMessage: Boolean,
    localTimestamp: Date,
    messageKind: ChatMessageKind,
    messageOperatorKind: ChatMessageOperatorKind,
    networkTimestamp: Date,
    recipientSendStatuses: IMapView[String, ChatMessageStatus],
    recipients: IVector[String],
    recipientsDeliveryInfos: IVector[ChatRecipientDeliveryInfo],
    remoteId: String,
    shouldSuppressNotification: Boolean,
    status: ChatMessageStatus,
    subject: String,
    threadingInfo: ChatConversationThreadingInfo,
    transportFriendlyName: String,
    transportId: String
  ): ChatMessage = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], estimatedDownloadSize = estimatedDownloadSize.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAutoReply = isAutoReply.asInstanceOf[js.Any], isForwardingDisabled = isForwardingDisabled.asInstanceOf[js.Any], isIncoming = isIncoming.asInstanceOf[js.Any], isRead = isRead.asInstanceOf[js.Any], isReceivedDuringQuietHours = isReceivedDuringQuietHours.asInstanceOf[js.Any], isReplyDisabled = isReplyDisabled.asInstanceOf[js.Any], isSeen = isSeen.asInstanceOf[js.Any], isSimMessage = isSimMessage.asInstanceOf[js.Any], localTimestamp = localTimestamp.asInstanceOf[js.Any], messageKind = messageKind.asInstanceOf[js.Any], messageOperatorKind = messageOperatorKind.asInstanceOf[js.Any], networkTimestamp = networkTimestamp.asInstanceOf[js.Any], recipientSendStatuses = recipientSendStatuses.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], recipientsDeliveryInfos = recipientsDeliveryInfos.asInstanceOf[js.Any], remoteId = remoteId.asInstanceOf[js.Any], shouldSuppressNotification = shouldSuppressNotification.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], threadingInfo = threadingInfo.asInstanceOf[js.Any], transportFriendlyName = transportFriendlyName.asInstanceOf[js.Any], transportId = transportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessage]
  }
}

