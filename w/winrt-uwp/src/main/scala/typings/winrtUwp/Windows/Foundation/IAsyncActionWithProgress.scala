package typings.winrtUwp.Windows.Foundation

import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an asynchronous action that can report progress updates to callers. This is the return type for all Windows Runtime asynchronous methods that don't have a result object, but do report progress to callback listeners. */
trait IAsyncActionWithProgress[TProgress]
  extends StObject
     with IAsyncInfo {
  
  /** Gets or sets the method that handles the action completed notification. */
  def completed(asyncInfo: IAsyncActionWithProgress[TProgress], asyncStatus: AsyncStatus): Unit
  /** Gets or sets the method that handles the action completed notification. */
  @JSName("completed")
  var completed_Original: AsyncActionWithProgressCompletedHandler[TProgress]
  
  /** Returns the results of the action. */
  def getResults(): Unit
  
  /** Gets or sets the callback method that receives progress notification. */
  def progress(asyncInfo: IAsyncActionWithProgress[TProgress], progressInfo: TProgress): Unit
  /** Gets or sets the callback method that receives progress notification. */
  @JSName("progress")
  var progress_Original: AsyncActionProgressHandler[TProgress]
}
object IAsyncActionWithProgress {
  
  inline def apply[TProgress](
    cancel: () => Unit,
    close: () => Unit,
    completed: (/* asyncInfo */ IAsyncActionWithProgress[TProgress], /* asyncStatus */ AsyncStatus) => Unit,
    errorCode: WinRTError,
    getResults: () => Unit,
    id: Double,
    progress: (/* asyncInfo */ IAsyncActionWithProgress[TProgress], TProgress) => Unit,
    status: AsyncStatus
  ): IAsyncActionWithProgress[TProgress] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), completed = js.Any.fromFunction2(completed), errorCode = errorCode.asInstanceOf[js.Any], getResults = js.Any.fromFunction0(getResults), id = id.asInstanceOf[js.Any], progress = js.Any.fromFunction2(progress), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncActionWithProgress[TProgress]]
  }
  
  extension [Self <: IAsyncActionWithProgress[?], TProgress](x: Self & IAsyncActionWithProgress[TProgress]) {
    
    inline def setCompleted(
      value: (/* asyncInfo */ IAsyncActionWithProgress[TProgress], /* asyncStatus */ AsyncStatus) => Unit
    ): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    inline def setGetResults(value: () => Unit): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
    
    inline def setProgress(value: (/* asyncInfo */ IAsyncActionWithProgress[TProgress], TProgress) => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
  }
}
