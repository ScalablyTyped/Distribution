package typings.winrt.anon

import typings.winrt.Windows.Devices.Sms.ISmsMessage
import typings.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletedAsyncOperationCompletedHandler extends StObject {
  
  def completed(asyncInfo: IAsyncOperation[ISmsMessage], asyncStatus: AsyncStatus): Unit
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[ISmsMessage]
  
  def getResults(): ISmsMessage
}
object CompletedAsyncOperationCompletedHandler {
  
  @scala.inline
  def apply(
    completed: (/* asyncInfo */ IAsyncOperation[ISmsMessage], /* asyncStatus */ AsyncStatus) => Unit,
    getResults: () => ISmsMessage
  ): CompletedAsyncOperationCompletedHandler = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2(completed), getResults = js.Any.fromFunction0(getResults))
    __obj.asInstanceOf[CompletedAsyncOperationCompletedHandler]
  }
  
  @scala.inline
  implicit class CompletedAsyncOperationCompletedHandlerMutableBuilder[Self <: CompletedAsyncOperationCompletedHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted(value: (/* asyncInfo */ IAsyncOperation[ISmsMessage], /* asyncStatus */ AsyncStatus) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetResults(value: () => ISmsMessage): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
  }
}
