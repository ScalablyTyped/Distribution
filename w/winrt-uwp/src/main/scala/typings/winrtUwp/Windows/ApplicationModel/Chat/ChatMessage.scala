package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a chat message. */
@js.native
trait ChatMessage extends js.Object {
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
  @scala.inline
  implicit class ChatMessageOps[Self <: ChatMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttachments(value: IVector[ChatMessageAttachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setEstimatedDownloadSize(value: Double): Self = this.set("estimatedDownloadSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAutoReply(value: Boolean): Self = this.set("isAutoReply", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsForwardingDisabled(value: Boolean): Self = this.set("isForwardingDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIncoming(value: Boolean): Self = this.set("isIncoming", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRead(value: Boolean): Self = this.set("isRead", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsReceivedDuringQuietHours(value: Boolean): Self = this.set("isReceivedDuringQuietHours", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsReplyDisabled(value: Boolean): Self = this.set("isReplyDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSeen(value: Boolean): Self = this.set("isSeen", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSimMessage(value: Boolean): Self = this.set("isSimMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalTimestamp(value: Date): Self = this.set("localTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageKind(value: ChatMessageKind): Self = this.set("messageKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageOperatorKind(value: ChatMessageOperatorKind): Self = this.set("messageOperatorKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkTimestamp(value: Date): Self = this.set("networkTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipientSendStatuses(value: IMapView[String, ChatMessageStatus]): Self = this.set("recipientSendStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipients(value: IVector[String]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipientsDeliveryInfos(value: IVector[ChatRecipientDeliveryInfo]): Self = this.set("recipientsDeliveryInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteId(value: String): Self = this.set("remoteId", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldSuppressNotification(value: Boolean): Self = this.set("shouldSuppressNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ChatMessageStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setThreadingInfo(value: ChatConversationThreadingInfo): Self = this.set("threadingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransportFriendlyName(value: String): Self = this.set("transportFriendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransportId(value: String): Self = this.set("transportId", value.asInstanceOf[js.Any])
  }
  
}

