package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a chat message. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessage")
@js.native
/** Creates a new instance of the ChatMessage class. */
class ChatMessage ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessage {
  
  /** Gets a list of chat message attachments. */
  /* CompleteClass */
  var attachments: IVector[typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageAttachment] = js.native
  
  /** Gets or sets the body of the chat message. */
  /* CompleteClass */
  var body: String = js.native
  
  /** Gets or sets the estimated size of a file to be sent or received. */
  /* CompleteClass */
  var estimatedDownloadSize: Double = js.native
  
  /** Gets the identifier or address of the sender of the message. */
  /* CompleteClass */
  var from: String = js.native
  
  /** Gets the identifier of the message. */
  /* CompleteClass */
  var id: String = js.native
  
  /** Gets or sets a Boolean value indicating if the message is an auto-reply. */
  /* CompleteClass */
  var isAutoReply: Boolean = js.native
  
  /** Gets a Boolean value indicating if forwarding is disabled. */
  /* CompleteClass */
  var isForwardingDisabled: Boolean = js.native
  
  /** Gets Boolean a value indicating if the message is incoming or outgoing. */
  /* CompleteClass */
  var isIncoming: Boolean = js.native
  
  /** Gets a Boolean value indicating if the message has been read. */
  /* CompleteClass */
  var isRead: Boolean = js.native
  
  /** Gets or sets a Boolean value indicating if the message was received during user specified quiet hours. */
  /* CompleteClass */
  var isReceivedDuringQuietHours: Boolean = js.native
  
  /** Gets a Boolean value indicating if reply is disabled on the ChatMessage . */
  /* CompleteClass */
  var isReplyDisabled: Boolean = js.native
  
  /** Gets or sets a Boolean value indicating if the message has been seen. */
  /* CompleteClass */
  var isSeen: Boolean = js.native
  
  /** Gets a Boolean value indicating if the message is stored on a SIM card. */
  /* CompleteClass */
  var isSimMessage: Boolean = js.native
  
  /** Gets the local timestamp of the message. */
  /* CompleteClass */
  var localTimestamp: Date = js.native
  
  /** Gets or sets the type of the ChatMessage . */
  /* CompleteClass */
  var messageKind: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageKind = js.native
  
  /** Gets or sets a value indicating the type of message operator, such as SMS, MMS, or RCS. */
  /* CompleteClass */
  var messageOperatorKind: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageOperatorKind = js.native
  
  /** Gets the network timestamp of the message. */
  /* CompleteClass */
  var networkTimestamp: Date = js.native
  
  /** Gets the list of send statuses for the message. */
  /* CompleteClass */
  var recipientSendStatuses: IMapView[String, typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageStatus] = js.native
  
  /** Gets the list of recipients of the message. */
  /* CompleteClass */
  var recipients: IVector[String] = js.native
  
  /** Gets the delivery info for each of the recipients of the ChatMessage . */
  /* CompleteClass */
  var recipientsDeliveryInfos: IVector[typings.winrtUwp.Windows.ApplicationModel.Chat.ChatRecipientDeliveryInfo] = js.native
  
  /** Gets or sets the remote ID for the ChatMessage . */
  /* CompleteClass */
  var remoteId: String = js.native
  
  /** Gets or sets a Boolean value indicating if notification of receiving the ChatMessage should be suppressed. */
  /* CompleteClass */
  var shouldSuppressNotification: Boolean = js.native
  
  /** Gets the status of the message. Typical states include draft, sent, received, deleted, etc. */
  /* CompleteClass */
  var status: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageStatus = js.native
  
  /** Gets the subject of the message. */
  /* CompleteClass */
  var subject: String = js.native
  
  /** Gets or sets the conversation threading info for the ChatMessage . */
  /* CompleteClass */
  var threadingInfo: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatConversationThreadingInfo = js.native
  
  /** Gets the transport friendly name of the message. */
  /* CompleteClass */
  var transportFriendlyName: String = js.native
  
  /** Gets or sets the transport ID of the message. */
  /* CompleteClass */
  var transportId: String = js.native
}
