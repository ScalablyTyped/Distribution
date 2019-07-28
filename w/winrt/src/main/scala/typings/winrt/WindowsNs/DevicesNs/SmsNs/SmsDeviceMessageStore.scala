package typings.winrt.WindowsNs.DevicesNs.SmsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsDeviceMessageStore")
@js.native
class SmsDeviceMessageStore () extends ISmsDeviceMessageStore {
  /* CompleteClass */
  override var maxMessages: Double = js.native
  /* CompleteClass */
  override def deleteMessageAsync(messageId: Double): IAsyncAction = js.native
  /* CompleteClass */
  override def deleteMessagesAsync(messageFilter: SmsMessageFilter): IAsyncAction = js.native
  /* CompleteClass */
  override def getMessageAsync(messageId: Double): IAsyncOperation[ISmsMessage] = js.native
  /* CompleteClass */
  override def getMessagesAsync(messageFilter: SmsMessageFilter): IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double] = js.native
}

