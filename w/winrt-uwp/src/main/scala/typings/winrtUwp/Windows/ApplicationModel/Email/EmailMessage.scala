package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an email message. */
trait EmailMessage extends StObject {
  
  /** Gets or sets a Boolean value indicating whether images may be embedded in the html encoded email message. */
  var allowInternetImages: Boolean
  
  /** Gets the attachments of the email message. */
  var attachments: IVector[EmailAttachment]
  
  /** Gets the recipients BCC'd to the email message. */
  var bcc: IVector[EmailRecipient]
  
  /** Gets or sets the body of the email message. */
  var body: String
  
  /** Gets the recipients CC'd to the email message. */
  var cc: IVector[EmailRecipient]
  
  /** Gets the current change number which is incremented for each change made to an email message. */
  var changeNumber: Double
  
  /** Gets the identifier for a conversation. */
  var conversationId: String
  
  /** Gets or sets the download status of an email message. */
  var downloadState: EmailMessageDownloadState
  
  /** Gets or sets the estimated size, in bytes, of an email message download. */
  var estimatedDownloadSizeInBytes: Double
  
  /** Represents the flag status of an email message. */
  var flagState: EmailFlagState
  
  /** Gets the identifier of a folder in the inbox. */
  var folderId: String
  
  /**
    * Gets the requested email stream such as plain text or HTML.
    * @param type The kind of message body; plain text or HTML.
    * @return The selected body stream.
    */
  def getBodyStream(`type`: EmailMessageBodyKind): IRandomAccessStreamReference
  
  /** Gets a Boolean value indicating whether this email message contains partial bodies. */
  var hasPartialBodies: Boolean
  
  /** Gets the identifier of an email message. */
  var id: String
  
  /** Gets the importance of an email message. */
  var importance: EmailImportance
  
  /** Gets the identifier for the email message to which this message is a response. */
  var inResponseToMessageId: String
  
  /** Gets or sets the Information Rights Management (IRM) information for this email message. */
  var irmInfo: EmailIrmInfo
  
  /** Gets a Boolean value indicating whether this message is a draft. */
  var isDraftMessage: Boolean
  
  /** Gets a Boolean value indicating whether the email message has been read. */
  var isRead: Boolean
  
  /** Gets a Boolean value indicating whether the email message has been seen. */
  var isSeen: Boolean
  
  /** Gets a Boolean value indicating whether the email message is a temporary server search message. */
  var isServerSearchMessage: Boolean
  
  /** Gets a Boolean value indicating whether the response email message is allowed to attempt a smart send, only sending that portion of the email message that has changed. */
  var isSmartSendable: Boolean
  
  /** Gets the last kind of response sent in reference to this email message. */
  var lastResponseKind: EmailMessageResponseKind
  
  /** Gets the identifier of the mailbox. */
  var mailboxId: String
  
  /** Gets the information associated with this meeting. */
  var meetingInfo: EmailMeetingInfo
  
  /** Gets or sets a string that indicates the class of the message. */
  var messageClass: String
  
  /** Gets the subject line of an email message stripped of additional prefixes such as fwd: and re: */
  var normalizedSubject: String
  
  /** Gets or sets the integer that identifies the original flavor of the character set used so that when the email message is condensed from wide character format (16-bit) to ASCII or other 8-bit encoding, in cases of later encoding questions, this integer can be used to recreate the original character set. */
  var originalCodePage: Double
  
  /** Gets or sets the short preview string that represents the longer email message in the list view of emails. */
  var preview: String
  
  /** Gets or sets the identifier that can be used by a service provider to access the email message on the client machine. */
  var remoteId: String
  
  /** Gets or sets the mailbox from which the email message was sent. */
  var sender: EmailRecipient
  
  /** Gets or sets the time an email was sent. */
  var sentTime: Date
  
  /**
    * Sets the value of the specified body stream in an email message.
    * @param type Indicates which body stream, plain text or HTML.
    * @param stream The message for the specified body stream.
    */
  def setBodyStream(`type`: EmailMessageBodyKind, stream: IRandomAccessStreamReference): Unit
  
  /** Gets or sets the S/MIME data associated with an email message. For more information, see the Certificate class. */
  var smimeData: IRandomAccessStreamReference
  
  /** Gets or sets the type of S/MIME encryption/signature for the email message. */
  var smimeKind: EmailMessageSmimeKind
  
  /** Gets or sets the subject of the email message. */
  var subject: String
  
  /** Gets the direct recipients of the email message. */
  var to: IVector[EmailRecipient]
}
object EmailMessage {
  
  inline def apply(
    allowInternetImages: Boolean,
    attachments: IVector[EmailAttachment],
    bcc: IVector[EmailRecipient],
    body: String,
    cc: IVector[EmailRecipient],
    changeNumber: Double,
    conversationId: String,
    downloadState: EmailMessageDownloadState,
    estimatedDownloadSizeInBytes: Double,
    flagState: EmailFlagState,
    folderId: String,
    getBodyStream: EmailMessageBodyKind => IRandomAccessStreamReference,
    hasPartialBodies: Boolean,
    id: String,
    importance: EmailImportance,
    inResponseToMessageId: String,
    irmInfo: EmailIrmInfo,
    isDraftMessage: Boolean,
    isRead: Boolean,
    isSeen: Boolean,
    isServerSearchMessage: Boolean,
    isSmartSendable: Boolean,
    lastResponseKind: EmailMessageResponseKind,
    mailboxId: String,
    meetingInfo: EmailMeetingInfo,
    messageClass: String,
    normalizedSubject: String,
    originalCodePage: Double,
    preview: String,
    remoteId: String,
    sender: EmailRecipient,
    sentTime: Date,
    setBodyStream: (EmailMessageBodyKind, IRandomAccessStreamReference) => Unit,
    smimeData: IRandomAccessStreamReference,
    smimeKind: EmailMessageSmimeKind,
    subject: String,
    to: IVector[EmailRecipient]
  ): EmailMessage = {
    val __obj = js.Dynamic.literal(allowInternetImages = allowInternetImages.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], bcc = bcc.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], cc = cc.asInstanceOf[js.Any], changeNumber = changeNumber.asInstanceOf[js.Any], conversationId = conversationId.asInstanceOf[js.Any], downloadState = downloadState.asInstanceOf[js.Any], estimatedDownloadSizeInBytes = estimatedDownloadSizeInBytes.asInstanceOf[js.Any], flagState = flagState.asInstanceOf[js.Any], folderId = folderId.asInstanceOf[js.Any], getBodyStream = js.Any.fromFunction1(getBodyStream), hasPartialBodies = hasPartialBodies.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any], inResponseToMessageId = inResponseToMessageId.asInstanceOf[js.Any], irmInfo = irmInfo.asInstanceOf[js.Any], isDraftMessage = isDraftMessage.asInstanceOf[js.Any], isRead = isRead.asInstanceOf[js.Any], isSeen = isSeen.asInstanceOf[js.Any], isServerSearchMessage = isServerSearchMessage.asInstanceOf[js.Any], isSmartSendable = isSmartSendable.asInstanceOf[js.Any], lastResponseKind = lastResponseKind.asInstanceOf[js.Any], mailboxId = mailboxId.asInstanceOf[js.Any], meetingInfo = meetingInfo.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], normalizedSubject = normalizedSubject.asInstanceOf[js.Any], originalCodePage = originalCodePage.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], remoteId = remoteId.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], sentTime = sentTime.asInstanceOf[js.Any], setBodyStream = js.Any.fromFunction2(setBodyStream), smimeData = smimeData.asInstanceOf[js.Any], smimeKind = smimeKind.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMessage]
  }
  
  extension [Self <: EmailMessage](x: Self) {
    
    inline def setAllowInternetImages(value: Boolean): Self = StObject.set(x, "allowInternetImages", value.asInstanceOf[js.Any])
    
    inline def setAttachments(value: IVector[EmailAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setBcc(value: IVector[EmailRecipient]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCc(value: IVector[EmailRecipient]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    inline def setChangeNumber(value: Double): Self = StObject.set(x, "changeNumber", value.asInstanceOf[js.Any])
    
    inline def setConversationId(value: String): Self = StObject.set(x, "conversationId", value.asInstanceOf[js.Any])
    
    inline def setDownloadState(value: EmailMessageDownloadState): Self = StObject.set(x, "downloadState", value.asInstanceOf[js.Any])
    
    inline def setEstimatedDownloadSizeInBytes(value: Double): Self = StObject.set(x, "estimatedDownloadSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setFlagState(value: EmailFlagState): Self = StObject.set(x, "flagState", value.asInstanceOf[js.Any])
    
    inline def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
    
    inline def setGetBodyStream(value: EmailMessageBodyKind => IRandomAccessStreamReference): Self = StObject.set(x, "getBodyStream", js.Any.fromFunction1(value))
    
    inline def setHasPartialBodies(value: Boolean): Self = StObject.set(x, "hasPartialBodies", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImportance(value: EmailImportance): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    inline def setInResponseToMessageId(value: String): Self = StObject.set(x, "inResponseToMessageId", value.asInstanceOf[js.Any])
    
    inline def setIrmInfo(value: EmailIrmInfo): Self = StObject.set(x, "irmInfo", value.asInstanceOf[js.Any])
    
    inline def setIsDraftMessage(value: Boolean): Self = StObject.set(x, "isDraftMessage", value.asInstanceOf[js.Any])
    
    inline def setIsRead(value: Boolean): Self = StObject.set(x, "isRead", value.asInstanceOf[js.Any])
    
    inline def setIsSeen(value: Boolean): Self = StObject.set(x, "isSeen", value.asInstanceOf[js.Any])
    
    inline def setIsServerSearchMessage(value: Boolean): Self = StObject.set(x, "isServerSearchMessage", value.asInstanceOf[js.Any])
    
    inline def setIsSmartSendable(value: Boolean): Self = StObject.set(x, "isSmartSendable", value.asInstanceOf[js.Any])
    
    inline def setLastResponseKind(value: EmailMessageResponseKind): Self = StObject.set(x, "lastResponseKind", value.asInstanceOf[js.Any])
    
    inline def setMailboxId(value: String): Self = StObject.set(x, "mailboxId", value.asInstanceOf[js.Any])
    
    inline def setMeetingInfo(value: EmailMeetingInfo): Self = StObject.set(x, "meetingInfo", value.asInstanceOf[js.Any])
    
    inline def setMessageClass(value: String): Self = StObject.set(x, "messageClass", value.asInstanceOf[js.Any])
    
    inline def setNormalizedSubject(value: String): Self = StObject.set(x, "normalizedSubject", value.asInstanceOf[js.Any])
    
    inline def setOriginalCodePage(value: Double): Self = StObject.set(x, "originalCodePage", value.asInstanceOf[js.Any])
    
    inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setRemoteId(value: String): Self = StObject.set(x, "remoteId", value.asInstanceOf[js.Any])
    
    inline def setSender(value: EmailRecipient): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSentTime(value: Date): Self = StObject.set(x, "sentTime", value.asInstanceOf[js.Any])
    
    inline def setSetBodyStream(value: (EmailMessageBodyKind, IRandomAccessStreamReference) => Unit): Self = StObject.set(x, "setBodyStream", js.Any.fromFunction2(value))
    
    inline def setSmimeData(value: IRandomAccessStreamReference): Self = StObject.set(x, "smimeData", value.asInstanceOf[js.Any])
    
    inline def setSmimeKind(value: EmailMessageSmimeKind): Self = StObject.set(x, "smimeKind", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTo(value: IVector[EmailRecipient]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
