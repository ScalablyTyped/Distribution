package typings.winrt.anon

import typings.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletedGetResults extends StObject {
  
  def completed(asyncInfo: IAsyncOperation[js.Any], asyncStatus: AsyncStatus): Unit
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[js.Any]
  
  def getResults(): js.Any
}
object CompletedGetResults {
  
  @scala.inline
  def apply(
    completed: (/* asyncInfo */ IAsyncOperation[js.Any], /* asyncStatus */ AsyncStatus) => Unit,
    getResults: () => js.Any
  ): CompletedGetResults = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2(completed), getResults = js.Any.fromFunction0(getResults))
    __obj.asInstanceOf[CompletedGetResults]
  }
  
  @scala.inline
  implicit class CompletedGetResultsMutableBuilder[Self <: CompletedGetResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted(value: (/* asyncInfo */ IAsyncOperation[js.Any], /* asyncStatus */ AsyncStatus) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetResults(value: () => js.Any): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
  }
}
