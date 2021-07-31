package typings.winrt.anon

import typings.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResults[TResult] extends StObject {
  
  def completed(asyncInfo: IAsyncOperation[TResult], asyncStatus: AsyncStatus): Unit
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[TResult]
  
  def getResults(): TResult
}
object GetResults {
  
  @scala.inline
  def apply[TResult](
    completed: (/* asyncInfo */ IAsyncOperation[TResult], /* asyncStatus */ AsyncStatus) => Unit,
    getResults: () => TResult
  ): GetResults[TResult] = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2(completed), getResults = js.Any.fromFunction0(getResults))
    __obj.asInstanceOf[GetResults[TResult]]
  }
  
  @scala.inline
  implicit class GetResultsMutableBuilder[Self <: GetResults[?], TResult] (val x: Self & GetResults[TResult]) extends AnyVal {
    
    @scala.inline
    def setCompleted(value: (/* asyncInfo */ IAsyncOperation[TResult], /* asyncStatus */ AsyncStatus) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetResults(value: () => TResult): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
  }
}
