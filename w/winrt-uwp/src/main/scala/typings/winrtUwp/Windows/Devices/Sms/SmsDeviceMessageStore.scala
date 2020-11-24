package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the messages stored on an SMS Device and information about the message store. */
@js.native
trait SmsDeviceMessageStore extends js.Object {
  
  /**
    * Deletes the message with the specified ID. Because the device might be busy, the operation executes asynchronously. The asynchronous operation object returns immediately.
    * @param messageId Integer ID of the message to delete, which was previously read from an SmsTextMessage object obtained from the device message store.
    * @return A new message operation object that is used to start and track the asynchronous operation.
    */
  def deleteMessageAsync(messageId: Double): IPromiseWithIAsyncAction = js.native
  
  /**
    * Deletes the messages to which the filter applies. The filter can be used to delete all messages, or only messages that are read, unread, sent, or in a draft state. Because the operation might not be instantaneous, it executes asynchronously. The asynchronous operation object returns immediately.
    * @param messageFilter A search filter that specifies which messages to delete.
    * @return A new message operation object that is used to start and track the asynchronous operation.
    */
  def deleteMessagesAsync(messageFilter: SmsMessageFilter): IPromiseWithIAsyncAction = js.native
  
  /**
    * Retrieves the message with the specified ID. The device might be busy, so the method executes asynchronously. The asynchronous operation object returns immediately.
    * @param messageId ID of the message to retrieve.
    * @return Returns a new message operation object that is used to start and track the asynchronous operation.
    */
  def getMessageAsync(messageId: Double): IPromiseWithIAsyncOperation[ISmsMessage] = js.native
  
  /**
    * Retrieves a list of messages that match the conditions specified in a filter. The messages can be filtered as read, unread, sent, or in the draft state.
    * @param messageFilter ID of the message to retrieve.
    * @return Returns a new message operation object that is used to start and track the asynchronous operation.
    */
  def getMessagesAsync(messageFilter: SmsMessageFilter): IPromiseWithIAsyncOperationWithProgress[IVectorView[_], Double] = js.native
  
  /** Indicates the maximum number of messages that can be stored in the device store. The client can use this value to determine how to maintain enough space in the device store to receive new messages from the network. */
  var maxMessages: Double = js.native
}
object SmsDeviceMessageStore {
  
  @scala.inline
  def apply(
    deleteMessageAsync: Double => IPromiseWithIAsyncAction,
    deleteMessagesAsync: SmsMessageFilter => IPromiseWithIAsyncAction,
    getMessageAsync: Double => IPromiseWithIAsyncOperation[ISmsMessage],
    getMessagesAsync: SmsMessageFilter => IPromiseWithIAsyncOperationWithProgress[IVectorView[_], Double],
    maxMessages: Double
  ): SmsDeviceMessageStore = {
    val __obj = js.Dynamic.literal(deleteMessageAsync = js.Any.fromFunction1(deleteMessageAsync), deleteMessagesAsync = js.Any.fromFunction1(deleteMessagesAsync), getMessageAsync = js.Any.fromFunction1(getMessageAsync), getMessagesAsync = js.Any.fromFunction1(getMessagesAsync), maxMessages = maxMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsDeviceMessageStore]
  }
  
  @scala.inline
  implicit class SmsDeviceMessageStoreOps[Self <: SmsDeviceMessageStore] (val x: Self) extends AnyVal {
    
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
    def setDeleteMessageAsync(value: Double => IPromiseWithIAsyncAction): Self = this.set("deleteMessageAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteMessagesAsync(value: SmsMessageFilter => IPromiseWithIAsyncAction): Self = this.set("deleteMessagesAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMessageAsync(value: Double => IPromiseWithIAsyncOperation[ISmsMessage]): Self = this.set("getMessageAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMessagesAsync(value: SmsMessageFilter => IPromiseWithIAsyncOperationWithProgress[IVectorView[_], Double]): Self = this.set("getMessagesAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxMessages(value: Double): Self = this.set("maxMessages", value.asInstanceOf[js.Any])
  }
}
