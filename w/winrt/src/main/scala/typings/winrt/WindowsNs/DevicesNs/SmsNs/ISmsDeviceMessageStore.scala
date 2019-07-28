package typings.winrt.WindowsNs.DevicesNs.SmsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsDeviceMessageStore extends js.Object {
  var maxMessages: Double
  def deleteMessageAsync(messageId: Double): IAsyncAction
  def deleteMessagesAsync(messageFilter: SmsMessageFilter): IAsyncAction
  def getMessageAsync(messageId: Double): IAsyncOperation[ISmsMessage]
  def getMessagesAsync(messageFilter: SmsMessageFilter): IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double]
}

object ISmsDeviceMessageStore {
  @scala.inline
  def apply(
    deleteMessageAsync: Double => IAsyncAction,
    deleteMessagesAsync: SmsMessageFilter => IAsyncAction,
    getMessageAsync: Double => IAsyncOperation[ISmsMessage],
    getMessagesAsync: SmsMessageFilter => IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double],
    maxMessages: Double
  ): ISmsDeviceMessageStore = {
    val __obj = js.Dynamic.literal(deleteMessageAsync = js.Any.fromFunction1(deleteMessageAsync), deleteMessagesAsync = js.Any.fromFunction1(deleteMessagesAsync), getMessageAsync = js.Any.fromFunction1(getMessageAsync), getMessagesAsync = js.Any.fromFunction1(getMessagesAsync), maxMessages = maxMessages)
  
    __obj.asInstanceOf[ISmsDeviceMessageStore]
  }
}

