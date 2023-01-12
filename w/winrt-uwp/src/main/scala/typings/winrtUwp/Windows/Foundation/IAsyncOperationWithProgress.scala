package typings.winrtUwp.Windows.Foundation

import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an asynchronous operation that can report progress updates to callers. This is the return type for many Windows Runtime asynchronous methods that have results and also report progress. */
trait IAsyncOperationWithProgress[TResult, TProgress]
  extends StObject
     with IAsyncInfo {
  
  /** Gets or sets the method that handles the operation completed notification. */
  def completed(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], asyncStatus: AsyncStatus): Unit
  /** Gets or sets the method that handles the operation completed notification. */
  @JSName("completed")
  var completed_Original: AsyncOperationWithProgressCompletedHandler[TResult, TProgress]
  
  /**
    * Returns the results of the operation.
    * @return The results of the operation.
    */
  def getResults(): TResult
  
  /** Gets or sets the method that handles progress notifications. */
  def progress(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], progressInfo: TProgress): Unit
  /** Gets or sets the method that handles progress notifications. */
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[TResult, TProgress]
}
object IAsyncOperationWithProgress {
  
  inline def apply[TResult, TProgress](
    cancel: () => Unit,
    close: () => Unit,
    completed: (/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], /* asyncStatus */ AsyncStatus) => Unit,
    errorCode: WinRTError,
    getResults: () => TResult,
    id: Double,
    progress: (/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], TProgress) => Unit,
    status: AsyncStatus
  ): IAsyncOperationWithProgress[TResult, TProgress] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), completed = js.Any.fromFunction2(completed), errorCode = errorCode.asInstanceOf[js.Any], getResults = js.Any.fromFunction0(getResults), id = id.asInstanceOf[js.Any], progress = js.Any.fromFunction2(progress), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncOperationWithProgress[TResult, TProgress]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAsyncOperationWithProgress[?, ?], TResult, TProgress] (val x: Self & (IAsyncOperationWithProgress[TResult, TProgress])) extends AnyVal {
    
    inline def setCompleted(
      value: (/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], /* asyncStatus */ AsyncStatus) => Unit
    ): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    inline def setGetResults(value: () => TResult): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
    
    inline def setProgress(value: (/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], TProgress) => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
  }
}
