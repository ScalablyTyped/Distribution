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
    deleteMessageAsync: js.Function1[scala.Double, winrtLib.WindowsNs.FoundationNs.IAsyncAction],
    deleteMessagesAsync: js.Function1[SmsMessageFilter, winrtLib.WindowsNs.FoundationNs.IAsyncAction],
    getMessageAsync: js.Function1[scala.Double, winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ISmsMessage]],
    getMessagesAsync: js.Function1[
      SmsMessageFilter, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
        winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ISmsMessage], 
        scala.Double
      ]
    ],
    maxMessages: scala.Double
  ): ISmsDeviceMessageStore = {
    val __obj = js.Dynamic.literal(deleteMessageAsync = deleteMessageAsync, deleteMessagesAsync = deleteMessagesAsync, getMessageAsync = getMessageAsync, getMessagesAsync = getMessagesAsync, maxMessages = maxMessages)
  
    __obj.asInstanceOf[ISmsDeviceMessageStore]
  }
}

