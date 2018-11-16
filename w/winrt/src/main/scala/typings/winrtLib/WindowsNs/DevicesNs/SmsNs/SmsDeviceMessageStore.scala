package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsDeviceMessageStore")
@js.native
class SmsDeviceMessageStore () extends ISmsDeviceMessageStore {
  /* CompleteClass */
  override var maxMessages: scala.Double = js.native
  /* CompleteClass */
  override def deleteMessageAsync(messageId: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  /* CompleteClass */
  override def deleteMessagesAsync(messageFilter: SmsMessageFilter): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  /* CompleteClass */
  override def getMessageAsync(messageId: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ISmsMessage] = js.native
  /* CompleteClass */
  override def getMessagesAsync(messageFilter: SmsMessageFilter): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ISmsMessage], 
    scala.Double
  ] = js.native
}

