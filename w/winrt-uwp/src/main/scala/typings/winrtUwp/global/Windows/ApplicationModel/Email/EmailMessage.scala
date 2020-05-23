package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessage")
@js.native
/** Creates an instance of the EmailMessage class. */
class EmailMessage ()
  extends typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessage {
  /** Gets or sets a Boolean value indicating whether images may be embedded in the html encoded email message. */
  /* CompleteClass */
  override var allowInternetImages: Boolean = js.native
  /** Gets the attachments of the email message. */
  /* CompleteClass */
  override var attachments: IVector[typings.winrtUwp.Windows.ApplicationModel.Email.EmailAttachment] = js.native
  /** Gets the recipients BCC'd to the email message. */
  /* CompleteClass */
  override var bcc: IVector[typings.winrtUwp.Windows.ApplicationModel.Email.EmailRecipient] = js.native
  /** Gets or sets the body of the email message. */
  /* CompleteClass */
  override var body: String = js.native
  /** Gets the recipients CC'd to the email message. */
  /* CompleteClass */
  override var cc: IVector[typings.winrtUwp.Windows.ApplicationModel.Email.EmailRecipient] = js.native
  /** Gets the current change number which is incremented for each change made to an email message. */
  /* CompleteClass */
  override var changeNumber: Double = js.native
  /** Gets the identifier for a conversation. */
  /* CompleteClass */
  override var conversationId: String = js.native
  /** Gets or sets the download status of an email message. */
  /* CompleteClass */
  override var downloadState: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageDownloadState = js.native
  /** Gets or sets the estimated size, in bytes, of an email message download. */
  /* CompleteClass */
  override var estimatedDownloadSizeInBytes: Double = js.native
  /** Represents the flag status of an email message. */
  /* CompleteClass */
  override var flagState: typings.winrtUwp.Windows.ApplicationModel.Email.EmailFlagState = js.native
  /** Gets the identifier of a folder in the inbox. */
  /* CompleteClass */
  override var folderId: String = js.native
  /** Gets a Boolean value indicating whether this email message contains partial bodies. */
  /* CompleteClass */
  override var hasPartialBodies: Boolean = js.native
  /** Gets the identifier of an email message. */
  /* CompleteClass */
  override var id: String = js.native
  /** Gets the importance of an email message. */
  /* CompleteClass */
  override var importance: typings.winrtUwp.Windows.ApplicationModel.Email.EmailImportance = js.native
  /** Gets the identifier for the email message to which this message is a response. */
  /* CompleteClass */
  override var inResponseToMessageId: String = js.native
  /** Gets or sets the Information Rights Management (IRM) information for this email message. */
  /* CompleteClass */
  override var irmInfo: typings.winrtUwp.Windows.ApplicationModel.Email.EmailIrmInfo = js.native
  /** Gets a Boolean value indicating whether this message is a draft. */
  /* CompleteClass */
  override var isDraftMessage: Boolean = js.native
  /** Gets a Boolean value indicating whether the email message has been read. */
  /* CompleteClass */
  override var isRead: Boolean = js.native
  /** Gets a Boolean value indicating whether the email message has been seen. */
  /* CompleteClass */
  override var isSeen: Boolean = js.native
  /** Gets a Boolean value indicating whether the email message is a temporary server search message. */
  /* CompleteClass */
  override var isServerSearchMessage: Boolean = js.native
  /** Gets a Boolean value indicating whether the response email message is allowed to attempt a smart send, only sending that portion of the email message that has changed. */
  /* CompleteClass */
  override var isSmartSendable: Boolean = js.native
  /** Gets the last kind of response sent in reference to this email message. */
  /* CompleteClass */
  override var lastResponseKind: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageResponseKind = js.native
  /** Gets the identifier of the mailbox. */
  /* CompleteClass */
  override var mailboxId: String = js.native
  /** Gets the information associated with this meeting. */
  /* CompleteClass */
  override var meetingInfo: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMeetingInfo = js.native
  /** Gets or sets a string that indicates the class of the message. */
  /* CompleteClass */
  override var messageClass: String = js.native
  /** Gets the subject line of an email message stripped of additional prefixes such as fwd: and re: */
  /* CompleteClass */
  override var normalizedSubject: String = js.native
  /** Gets or sets the integer that identifies the original flavor of the character set used so that when the email message is condensed from wide character format (16-bit) to ASCII or other 8-bit encoding, in cases of later encoding questions, this integer can be used to recreate the original character set. */
  /* CompleteClass */
  override var originalCodePage: Double = js.native
  /** Gets or sets the short preview string that represents the longer email message in the list view of emails. */
  /* CompleteClass */
  override var preview: String = js.native
  /** Gets or sets the identifier that can be used by a service provider to access the email message on the client machine. */
  /* CompleteClass */
  override var remoteId: String = js.native
  /** Gets or sets the mailbox from which the email message was sent. */
  /* CompleteClass */
  override var sender: typings.winrtUwp.Windows.ApplicationModel.Email.EmailRecipient = js.native
  /** Gets or sets the time an email was sent. */
  /* CompleteClass */
  override var sentTime: Date = js.native
  /** Gets or sets the S/MIME data associated with an email message. For more information, see the Certificate class. */
  /* CompleteClass */
  override var smimeData: IRandomAccessStreamReference = js.native
  /** Gets or sets the type of S/MIME encryption/signature for the email message. */
  /* CompleteClass */
  override var smimeKind: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageSmimeKind = js.native
  /** Gets or sets the subject of the email message. */
  /* CompleteClass */
  override var subject: String = js.native
  /** Gets the direct recipients of the email message. */
  /* CompleteClass */
  override var to: IVector[typings.winrtUwp.Windows.ApplicationModel.Email.EmailRecipient] = js.native
  /**
    * Gets the requested email stream such as plain text or HTML.
    * @param type The kind of message body; plain text or HTML.
    * @return The selected body stream.
    */
  /* CompleteClass */
  override def getBodyStream(`type`: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageBodyKind): IRandomAccessStreamReference = js.native
  /**
    * Sets the value of the specified body stream in an email message.
    * @param type Indicates which body stream, plain text or HTML.
    * @param stream The message for the specified body stream.
    */
  /* CompleteClass */
  override def setBodyStream(
    `type`: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageBodyKind,
    stream: IRandomAccessStreamReference
  ): Unit = js.native
}

