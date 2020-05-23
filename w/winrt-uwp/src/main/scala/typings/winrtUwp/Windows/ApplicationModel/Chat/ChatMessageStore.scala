package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.messagechanged
import typings.winrtUwp.winrtUwpStrings.storechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the methods and properties to read, manage and send messages. An application gets access to the message store using the static ChatMessageManager class . */
@js.native
trait ChatMessageStore extends js.Object {
  /** Gets a ChatMessageChangeTracker class object for the message store. A message change tracker allows an application to monitor changes to messages in the message store. */
  var changeTracker: ChatMessageChangeTracker = js.native
  /** An event that occurs when a message in the message store is changed. */
  @JSName("onmessagechanged")
  var onmessagechanged_Original: TypedEventHandler[ChatMessageStore, ChatMessageChangedEventArgs] = js.native
  /** Occurs when something in the ChatMessageStore has changed. */
  @JSName("onstorechanged")
  var onstorechanged_Original: TypedEventHandler[ChatMessageStore, ChatMessageStoreChangedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagechanged(`type`: messagechanged, listener: TypedEventHandler[ChatMessageStore, ChatMessageChangedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storechanged(
    `type`: storechanged,
    listener: TypedEventHandler[ChatMessageStore, ChatMessageStoreChangedEventArgs]
  ): Unit = js.native
  /**
    * Deletes a message from the chat message store.
    * @param localMessageId The local ID of the message to be deleted.
    * @return An asynchronous action.
    */
  def deleteMessageAsync(localMessageId: String): IPromiseWithIAsyncAction = js.native
  /**
    * Downloads a message specified by the identifier to the message store.
    * @param localChatMessageId The local ID of the message to be downloaded.
    * @return An asynchronous action.
    */
  def downloadMessageAsync(localChatMessageId: String): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously forwards the specified message to new recipients.
    * @param localChatMessageId The ID of the message to forward.
    * @param addresses The addresses of the new recipients of the forwarded message.
    * @return A copy of the forwarded message.
    */
  def forwardMessageAsync(localChatMessageId: String, addresses: IIterable[String]): IPromiseWithIAsyncOperation[ChatMessage] = js.native
  /**
    * Asynchronously gets a ChatConversation by ID.
    * @param conversationId The ID of the conversation to retrieve.
    * @return The ChatConversation specified by the conversationId parameter.
    */
  def getConversationAsync(conversationId: String): IPromiseWithIAsyncOperation[ChatConversation] = js.native
  /**
    * Asynchronously gets a ChatConversation by ID using the specified transports.
    * @param conversationId The ID of the conversation to retrieve.
    * @param transportIds The IDs of the transports to use to retrieve the ChatConversation .
    * @return The ChatConversation specified by the conversationId parameter.
    */
  def getConversationAsync(conversationId: String, transportIds: IIterable[String]): IPromiseWithIAsyncOperation[ChatConversation] = js.native
  /**
    * Asynchronously gets a conversation based on a threading info object.
    * @param threadingInfo The threading info that identifies the conversation.
    * @return The conversation identified by the threadingInfo parameter.
    */
  def getConversationFromThreadingInfoAsync(threadingInfo: ChatConversationThreadingInfo): IPromiseWithIAsyncOperation[ChatConversation] = js.native
  /**
    * Gets a new or existing ChatConversationReader for the message store.
    * @return The new or existing ChatConversationReader .
    */
  def getConversationReader(): ChatConversationReader = js.native
  /**
    * Gets a new or existing ChatConversationReader for the message store using the specified transports.
    * @param transportIds The IDs for the transports to use to retrieve the ChatConversationReader .
    * @return The new or existing ChatConversationReader .
    */
  def getConversationReader(transportIds: IIterable[String]): ChatConversationReader = js.native
  /**
    * Retrieves a message specified by an identifier from the message store.
    * @param localChatMessageId The local ID of the chat message to be retrieved.
    * @return An asynchronous operation that returns a chat message upon successful completion.
    */
  def getMessageAsync(localChatMessageId: String): IPromiseWithIAsyncOperation[ChatMessage] = js.native
  /**
    * Gets a message by its remote ID.
    * @param transportId The TransportId to use to get the ChatMessage .
    * @param remoteId The RemoteId of the ChatMessage to retrieve.
    * @return The message.
    */
  def getMessageByRemoteIdAsync(transportId: String, remoteId: String): IPromiseWithIAsyncOperation[ChatMessage] = js.native
  /**
    * Gets a ChatMessageReader class object which provides a message collection from the message store.
    * @return The chat message reader.
    */
  def getMessageReader(): ChatMessageReader = js.native
  /**
    * Gets a ChatMessageReader class object which provides a message collection from the message store. The collection of messages is limited to the time span provided.
    * @param recentTimeLimit The time window for the retrieved reader.
    * @return The chat message reader.
    */
  def getMessageReader(recentTimeLimit: Double): ChatMessageReader = js.native
  /**
    * Gets a new or existing ChatSearchReader to be used to search for messages.
    * @param value The query options that the search reader will use when looking for matching messages.
    * @return The new or existing search reader.
    */
  def getSearchReader(value: ChatQueryOptions): ChatSearchReader = js.native
  /**
    * Asynchronously gets the number of unread chat messages.
    * @return The number of unread chat messages.
    */
  def getUnseenCountAsync(): IPromiseWithIAsyncOperation[Double] = js.native
  /**
    * Asynchronously gets the number of unread chat messages using the specified transports.
    * @param transportIds The IDs of the chat transports to use to get the unseen messages count.
    * @return The number of unread chat messages.
    */
  def getUnseenCountAsync(transportIds: IIterable[String]): IPromiseWithIAsyncOperation[Double] = js.native
  /**
    * Asynchronously marks all transport messages as seen.
    * @return An async action indicating that the operation has finished.
    */
  def markAsSeenAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously marks all transport messages as seen.
    * @param transportIds The IDs of the transports for which to mark all messages as seen.
    * @return An async action indicating that the operation has finished.
    */
  def markAsSeenAsync(transportIds: IIterable[String]): IPromiseWithIAsyncAction = js.native
  /**
    * Marks a specified message in the store as already read.
    * @param localChatMessageId The local ID of the message to be marked as read.
    * @return An asynchronous action.
    */
  def markMessageReadAsync(localChatMessageId: String): IPromiseWithIAsyncAction = js.native
  /** An event that occurs when a message in the message store is changed. */
  def onmessagechanged(ev: ChatMessageChangedEventArgs with WinRTEvent[ChatMessageStore]): Unit = js.native
  /** Occurs when something in the ChatMessageStore has changed. */
  def onstorechanged(ev: ChatMessageStoreChangedEventArgs with WinRTEvent[ChatMessageStore]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messagechanged(`type`: messagechanged, listener: TypedEventHandler[ChatMessageStore, ChatMessageChangedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storechanged(
    `type`: storechanged,
    listener: TypedEventHandler[ChatMessageStore, ChatMessageStoreChangedEventArgs]
  ): Unit = js.native
  /**
    * Attempts a retry of sending a specified message from the message store.
    * @param localChatMessageId The local ID of the message to be retried.
    * @return An asynchronous action.
    */
  def retrySendMessageAsync(localChatMessageId: String): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously saves a message to the ChatMessageStore .
    * @param chatMessage The message to save.
    * @return An async action indicating that the operation has finished.
    */
  def saveMessageAsync(chatMessage: ChatMessage): IPromiseWithIAsyncAction = js.native
  /**
    * Attempts to send a chat message. The message is saved to the message store as part of the send operation.
    * @param chatMessage The chat message to be sent.
    * @return An asynchronous action.
    */
  def sendMessageAsync(chatMessage: ChatMessage): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously attempts to cancel downloading the specified message.
    * @param localChatMessageId The ID of the message to stop downloading.
    * @return An async action indicating that the operation has completed.
    */
  def tryCancelDownloadMessageAsync(localChatMessageId: String): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Asynchronously attempts to cancel sending the specified message.
    * @param localChatMessageId The ID of the message to stop sending.
    * @return An async action indicating that the operation has completed.
    */
  def tryCancelSendMessageAsync(localChatMessageId: String): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Checks if a chat message is valid and returns the validation result.
    * @param chatMessage The chat message to validate.
    * @return The validation result.
    */
  def validateMessage(chatMessage: ChatMessage): ChatMessageValidationResult = js.native
}

