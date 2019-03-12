package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsDeviceMessageStore extends js.Object {
  var maxMessages: scala.Double
  def deleteMessageAsync(messageId: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncAction
  def deleteMessagesAsync(messageFilter: SmsMessageFilter): winrtLib.WindowsNs.FoundationNs.IAsyncAction
  def getMessageAsync(messageId: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ISmsMessage]
  def getMessagesAsync(messageFilter: SmsMessageFilter): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ISmsMessage], 
    scala.Double
  ]
}

object ISmsDeviceMessageStore {
  @scala.inline
  def apply(
    deleteMessageAsync: scala.Double => winrtLib.WindowsNs.FoundationNs.IAsyncAction,
    deleteMessagesAsync: SmsMessageFilter => winrtLib.WindowsNs.FoundationNs.IAsyncAction,
    getMessageAsync: scala.Double => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ISmsMessage],
    getMessagesAsync: SmsMessageFilter => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ISmsMessage], 
      scala.Double
    ],
    maxMessages: scala.Double
  ): ISmsDeviceMessageStore = {
    val __obj = js.Dynamic.literal(deleteMessageAsync = js.Any.fromFunction1(deleteMessageAsync), deleteMessagesAsync = js.Any.fromFunction1(deleteMessagesAsync), getMessageAsync = js.Any.fromFunction1(getMessageAsync), getMessagesAsync = js.Any.fromFunction1(getMessagesAsync), maxMessages = maxMessages)
  
    __obj.asInstanceOf[ISmsDeviceMessageStore]
  }
}

