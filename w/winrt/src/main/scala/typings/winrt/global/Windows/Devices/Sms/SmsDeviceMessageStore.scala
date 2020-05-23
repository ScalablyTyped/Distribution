package typings.winrt.global.Windows.Devices.Sms

import typings.winrt.Windows.Devices.Sms.ISmsMessage
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsDeviceMessageStore")
@js.native
class SmsDeviceMessageStore ()
  extends typings.winrt.Windows.Devices.Sms.SmsDeviceMessageStore {
  /* CompleteClass */
  override var maxMessages: Double = js.native
  /* CompleteClass */
  override def deleteMessageAsync(messageId: Double): IAsyncAction = js.native
  /* CompleteClass */
  override def deleteMessagesAsync(messageFilter: typings.winrt.Windows.Devices.Sms.SmsMessageFilter): IAsyncAction = js.native
  /* CompleteClass */
  override def getMessageAsync(messageId: Double): IAsyncOperation[ISmsMessage] = js.native
  /* CompleteClass */
  override def getMessagesAsync(messageFilter: typings.winrt.Windows.Devices.Sms.SmsMessageFilter): IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double] = js.native
}

