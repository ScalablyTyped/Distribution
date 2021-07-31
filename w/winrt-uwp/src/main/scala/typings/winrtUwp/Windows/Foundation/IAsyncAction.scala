package typings.winrtUwp.Windows.Foundation

import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an asynchronous action. This is the return type for many Windows Runtime asynchronous methods that don't have a result object, and don't report ongoing progress. */
trait IAsyncAction
  extends StObject
     with IAsyncInfo {
  
  /** Gets or sets the method that handles the action completed notification. */
  def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit
  /** Gets or sets the method that handles the action completed notification. */
  @JSName("completed")
  var completed_Original: AsyncActionCompletedHandler
  
  /** Returns the results of the action. */
  def getResults(): Unit
}
object IAsyncAction {
  
  @scala.inline
  def apply(
    cancel: () => Unit,
    close: () => Unit,
    completed: (/* asyncInfo */ IAsyncAction, /* asyncStatus */ AsyncStatus) => Unit,
    errorCode: WinRTError,
    getResults: () => Unit,
    id: Double,
    status: AsyncStatus
  ): IAsyncAction = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), completed = js.Any.fromFunction2(completed), errorCode = errorCode.asInstanceOf[js.Any], getResults = js.Any.fromFunction0(getResults), id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncAction]
  }
  
  @scala.inline
  implicit class IAsyncActionMutableBuilder[Self <: IAsyncAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted(value: (/* asyncInfo */ IAsyncAction, /* asyncStatus */ AsyncStatus) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetResults(value: () => Unit): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
  }
}
