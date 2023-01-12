package typings.winrt.anon

import typings.winrt.Windows.Foundation.AsyncOperationProgressHandler
import typings.winrt.Windows.Foundation.AsyncOperationWithProgressCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Completed[TResult, TProgress] extends StObject {
  
  def completed(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], asyncStatus: AsyncStatus): Unit
  @JSName("completed")
  var completed_Original: AsyncOperationWithProgressCompletedHandler[TResult, TProgress]
  
  def getResults(): TResult
  
  def progress(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], progressInfo: TProgress): Unit
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[TResult, TProgress]
}
object Completed {
  
  inline def apply[TResult, TProgress](
    completed: (/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], /* asyncStatus */ AsyncStatus) => Unit,
    getResults: () => TResult,
    progress: (/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], TProgress) => Unit
  ): Completed[TResult, TProgress] = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2(completed), getResults = js.Any.fromFunction0(getResults), progress = js.Any.fromFunction2(progress))
    __obj.asInstanceOf[Completed[TResult, TProgress]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Completed[?, ?], TResult, TProgress] (val x: Self & (Completed[TResult, TProgress])) extends AnyVal {
    
    inline def setCompleted(
      value: (/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], /* asyncStatus */ AsyncStatus) => Unit
    ): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    inline def setGetResults(value: () => TResult): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
    
    inline def setProgress(value: (/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], TProgress) => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
  }
}
