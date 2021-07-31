package typings.winrt.anon

import typings.winrt.Windows.Devices.Sms.SmsDevice
import typings.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletedAsyncOperationCompletedHandlerGetResults extends StObject {
  
  def completed(asyncInfo: IAsyncOperation[SmsDevice], asyncStatus: AsyncStatus): Unit
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[SmsDevice]
  
  def getResults(): SmsDevice
}
object CompletedAsyncOperationCompletedHandlerGetResults {
  
  @scala.inline
  def apply(
    completed: (/* asyncInfo */ IAsyncOperation[SmsDevice], /* asyncStatus */ AsyncStatus) => Unit,
    getResults: () => SmsDevice
  ): CompletedAsyncOperationCompletedHandlerGetResults = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2(completed), getResults = js.Any.fromFunction0(getResults))
    __obj.asInstanceOf[CompletedAsyncOperationCompletedHandlerGetResults]
  }
  
  @scala.inline
  implicit class CompletedAsyncOperationCompletedHandlerGetResultsMutableBuilder[Self <: CompletedAsyncOperationCompletedHandlerGetResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted(value: (/* asyncInfo */ IAsyncOperation[SmsDevice], /* asyncStatus */ AsyncStatus) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetResults(value: () => SmsDevice): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
  }
}
