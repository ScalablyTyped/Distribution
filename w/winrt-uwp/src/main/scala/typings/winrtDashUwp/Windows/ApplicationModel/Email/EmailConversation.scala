package typings.winrtDashUwp.Windows.ApplicationModel.Email

import typings.std.Date
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an email conversation. */
@JSGlobal("Windows.ApplicationModel.Email.EmailConversation")
@js.native
abstract class EmailConversation () extends js.Object {
  /** Gets the EmailFlagState for the conversation. */
  var flagState: EmailFlagState = js.native
  /** Gets a Boolean value indicating if the conversation has an attachment. */
  var hasAttachment: Boolean = js.native
  /** Gets the unique identifier for the EmailConversation . */
  var id: String = js.native
  /** Gets the value that specifies the importance of the conversation; normal, high or low. */
  var importance: EmailImportance = js.native
  /** Gets the last EmailMessageResponseKind for the conversation. */
  var lastEmailResponseKind: EmailMessageResponseKind = js.native
  /** Gets the latest sender in the conversation. */
  var latestSender: EmailRecipient = js.native
  /** Gets the ID for the mailbox. */
  var mailboxId: String = js.native
  /** Gets the number of messages in the conversation. */
  var messageCount: Double = js.native
  /** Gets the ID of the most recent message in the conversation. */
  var mostRecentMessageId: String = js.native
  /** Gets the time of the most recent message in the conversation. */
  var mostRecentMessageTime: Date = js.native
  /** Gets a preview of the latest message in the conversation. */
  var preview: String = js.native
  /** Gets the subject of the latest message in the conversation. */
  var subject: String = js.native
  /** Gets the number of unread messages in the conversation. */
  var unreadMessageCount: Double = js.native
  /**
    * Asynchronously gets a batch of messages in the conversation.
    * @return The batch of messages.
    */
  def findMessagesAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously gets a batch of messages in the conversation.
    * @param count The size of the batch of messages to retrieve.
    * @return The batch of messages.
    */
  def findMessagesAsync(count: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

