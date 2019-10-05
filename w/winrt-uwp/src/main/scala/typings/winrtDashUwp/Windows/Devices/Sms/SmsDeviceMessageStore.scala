package typings.winrtDashUwp.Windows.Devices.Sms

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the messages stored on an SMS Device and information about the message store. */
@JSGlobal("Windows.Devices.Sms.SmsDeviceMessageStore")
@js.native
abstract class SmsDeviceMessageStore () extends js.Object {
  /** Indicates the maximum number of messages that can be stored in the device store. The client can use this value to determine how to maintain enough space in the device store to receive new messages from the network. */
  var maxMessages: Double = js.native
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
}

