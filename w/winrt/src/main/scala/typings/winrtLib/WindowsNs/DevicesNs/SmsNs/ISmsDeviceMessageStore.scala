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

