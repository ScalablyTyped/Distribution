package typings.winrt.anon

import typings.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletedGetResults extends StObject {
  
  def completed(asyncInfo: IAsyncOperation[Any], asyncStatus: AsyncStatus): Unit
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[Any]
  
  def getResults(): Any
}
object CompletedGetResults {
  
  inline def apply(
    completed: (/* asyncInfo */ IAsyncOperation[Any], /* asyncStatus */ AsyncStatus) => Unit,
    getResults: () => Any
  ): CompletedGetResults = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2(completed), getResults = js.Any.fromFunction0(getResults))
    __obj.asInstanceOf[CompletedGetResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompletedGetResults] (val x: Self) extends AnyVal {
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncOperation[Any], /* asyncStatus */ AsyncStatus) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    inline def setGetResults(value: () => Any): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
  }
}
