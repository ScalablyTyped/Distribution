package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  var hasAttachment: scala.Boolean = js.native
  /** Gets the unique identifier for the EmailConversation . */
  var id: java.lang.String = js.native
  /** Gets the value that specifies the importance of the conversation; normal, high or low. */
  var importance: EmailImportance = js.native
  /** Gets the last EmailMessageResponseKind for the conversation. */
  var lastEmailResponseKind: EmailMessageResponseKind = js.native
  /** Gets the latest sender in the conversation. */
  var latestSender: EmailRecipient = js.native
  /** Gets the ID for the mailbox. */
  var mailboxId: java.lang.String = js.native
  /** Gets the number of messages in the conversation. */
  var messageCount: scala.Double = js.native
  /** Gets the ID of the most recent message in the conversation. */
  var mostRecentMessageId: java.lang.String = js.native
  /** Gets the time of the most recent message in the conversation. */
  var mostRecentMessageTime: stdLib.Date = js.native
  /** Gets a preview of the latest message in the conversation. */
  var preview: java.lang.String = js.native
  /** Gets the subject of the latest message in the conversation. */
  var subject: java.lang.String = js.native
  /** Gets the number of unread messages in the conversation. */
  var unreadMessageCount: scala.Double = js.native
  /**
    * Asynchronously gets a batch of messages in the conversation.
    * @return The batch of messages.
    */
  def findMessagesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Asynchronously gets a batch of messages in the conversation.
    * @param count The size of the batch of messages to retrieve.
    * @return The batch of messages.
    */
  def findMessagesAsync(count: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
}

