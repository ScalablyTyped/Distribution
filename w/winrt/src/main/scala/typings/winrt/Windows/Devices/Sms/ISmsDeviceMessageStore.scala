package typings.winrt.Windows.Devices.Sms

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISmsDeviceMessageStore extends StObject {
  
  def deleteMessageAsync(messageId: Double): IAsyncAction
  
  def deleteMessagesAsync(messageFilter: SmsMessageFilter): IAsyncAction
  
  def getMessageAsync(messageId: Double): IAsyncOperation[ISmsMessage]
  
  def getMessagesAsync(messageFilter: SmsMessageFilter): IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double]
  
  var maxMessages: Double
}
object ISmsDeviceMessageStore {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ISmsDeviceMessageStore] (val x: Self) extends AnyVal {
    
    inline def setDeleteMessageAsync(value: Double => IAsyncAction): Self = StObject.set(x, "deleteMessageAsync", js.Any.fromFunction1(value))
    
    inline def setDeleteMessagesAsync(value: SmsMessageFilter => IAsyncAction): Self = StObject.set(x, "deleteMessagesAsync", js.Any.fromFunction1(value))
    
    inline def setGetMessageAsync(value: Double => IAsyncOperation[ISmsMessage]): Self = StObject.set(x, "getMessageAsync", js.Any.fromFunction1(value))
    
    inline def setGetMessagesAsync(value: SmsMessageFilter => IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double]): Self = StObject.set(x, "getMessagesAsync", js.Any.fromFunction1(value))
    
    inline def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
  }
}
