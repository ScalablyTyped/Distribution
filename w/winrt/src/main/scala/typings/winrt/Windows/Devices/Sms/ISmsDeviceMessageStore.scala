package typings.winrt.Windows.Devices.Sms

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISmsDeviceMessageStore extends js.Object {
  var maxMessages: Double = js.native
  def deleteMessageAsync(messageId: Double): IAsyncAction = js.native
  def deleteMessagesAsync(messageFilter: SmsMessageFilter): IAsyncAction = js.native
  def getMessageAsync(messageId: Double): IAsyncOperation[ISmsMessage] = js.native
  def getMessagesAsync(messageFilter: SmsMessageFilter): IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double] = js.native
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
    val __obj = js.Dynamic.literal(deleteMessageAsync = js.Any.fromFunction1(deleteMessageAsync), deleteMessagesAsync = js.Any.fromFunction1(deleteMessagesAsync), getMessageAsync = js.Any.fromFunction1(getMessageAsync), getMessagesAsync = js.Any.fromFunction1(getMessagesAsync), maxMessages = maxMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISmsDeviceMessageStore]
  }
  @scala.inline
  implicit class ISmsDeviceMessageStoreOps[Self <: ISmsDeviceMessageStore] (val x: Self) extends AnyVal {
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
    def setDeleteMessageAsync(value: Double => IAsyncAction): Self = this.set("deleteMessageAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteMessagesAsync(value: SmsMessageFilter => IAsyncAction): Self = this.set("deleteMessagesAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setGetMessageAsync(value: Double => IAsyncOperation[ISmsMessage]): Self = this.set("getMessageAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setGetMessagesAsync(value: SmsMessageFilter => IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double]): Self = this.set("getMessagesAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setMaxMessages(value: Double): Self = this.set("maxMessages", value.asInstanceOf[js.Any])
  }
  
}

