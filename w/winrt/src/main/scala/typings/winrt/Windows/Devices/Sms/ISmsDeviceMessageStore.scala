package typings.winrt.Windows.Devices.Sms

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISmsDeviceMessageStore extends StObject {
  
  def deleteMessageAsync(messageId: Double): IAsyncAction = js.native
  
  def deleteMessagesAsync(messageFilter: SmsMessageFilter): IAsyncAction = js.native
  
  def getMessageAsync(messageId: Double): IAsyncOperation[ISmsMessage] = js.native
  
  def getMessagesAsync(messageFilter: SmsMessageFilter): IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double] = js.native
  
  var maxMessages: Double = js.native
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
  implicit class ISmsDeviceMessageStoreMutableBuilder[Self <: ISmsDeviceMessageStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteMessageAsync(value: Double => IAsyncAction): Self = StObject.set(x, "deleteMessageAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteMessagesAsync(value: SmsMessageFilter => IAsyncAction): Self = StObject.set(x, "deleteMessagesAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMessageAsync(value: Double => IAsyncOperation[ISmsMessage]): Self = StObject.set(x, "getMessageAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMessagesAsync(value: SmsMessageFilter => IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double]): Self = StObject.set(x, "getMessagesAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
  }
}
