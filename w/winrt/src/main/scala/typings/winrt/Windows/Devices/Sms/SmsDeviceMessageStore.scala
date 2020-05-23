package typings.winrt.Windows.Devices.Sms

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmsDeviceMessageStore extends ISmsDeviceMessageStore

object SmsDeviceMessageStore {
  @scala.inline
  def apply(
    deleteMessageAsync: Double => IAsyncAction,
    deleteMessagesAsync: SmsMessageFilter => IAsyncAction,
    getMessageAsync: Double => IAsyncOperation[ISmsMessage],
    getMessagesAsync: SmsMessageFilter => IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double],
    maxMessages: Double
  ): SmsDeviceMessageStore = {
    val __obj = js.Dynamic.literal(deleteMessageAsync = js.Any.fromFunction1(deleteMessageAsync), deleteMessagesAsync = js.Any.fromFunction1(deleteMessagesAsync), getMessageAsync = js.Any.fromFunction1(getMessageAsync), getMessagesAsync = js.Any.fromFunction1(getMessagesAsync), maxMessages = maxMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsDeviceMessageStore]
  }
}

