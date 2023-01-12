package typings.winrtUwp.Windows.Foundation

import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an asynchronous operation, which returns a result upon completion. This is the return type for many Windows Runtime asynchronous methods that have results but don't report progress. */
trait IAsyncOperation[TResult]
  extends StObject
     with IAsyncInfo {
  
  /** Gets or sets the method that handles the operation completed notification. */
  def completed(asyncInfo: IAsyncOperation[TResult], asyncStatus: AsyncStatus): Unit
  /** Gets or sets the method that handles the operation completed notification. */
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[TResult]
  
  /**
    * Returns the results of the operation.
    * @return The results of the operation.
    */
  def getResults(): TResult
}
object IAsyncOperation {
  
  inline def apply[TResult](
    cancel: () => Unit,
    close: () => Unit,
    completed: (/* asyncInfo */ IAsyncOperation[TResult], /* asyncStatus */ AsyncStatus) => Unit,
    errorCode: WinRTError,
    getResults: () => TResult,
    id: Double,
    status: AsyncStatus
  ): IAsyncOperation[TResult] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), completed = js.Any.fromFunction2(completed), errorCode = errorCode.asInstanceOf[js.Any], getResults = js.Any.fromFunction0(getResults), id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncOperation[TResult]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAsyncOperation[?], TResult] (val x: Self & IAsyncOperation[TResult]) extends AnyVal {
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncOperation[TResult], /* asyncStatus */ AsyncStatus) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    inline def setGetResults(value: () => TResult): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
  }
}
