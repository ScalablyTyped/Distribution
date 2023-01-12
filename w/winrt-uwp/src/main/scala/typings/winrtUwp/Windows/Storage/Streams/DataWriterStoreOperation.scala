package typings.winrtUwp.Windows.Storage.Streams

import typings.winrtUwp.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncStatus
import typings.winrtUwp.Windows.Foundation.IAsyncOperation
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Commits data in a buffer to a backing store. */
trait DataWriterStoreOperation extends StObject {
  
  /** Requests the cancellation of the data store operation. */
  def cancel(): Unit
  
  /** Requests that work associated with the data store operation should stop. */
  def close(): Unit
  
  /** Gets or sets the handler to call when the data store operation is complete. */
  def completed(asyncInfo: IAsyncOperation[Double], asyncStatus: AsyncStatus): Unit
  /** Gets or sets the handler to call when the data store operation is complete. */
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[Double]
  
  /** Gets the error code for the data store operation if it fails. */
  var errorCode: WinRTError
  
  /**
    * Returns the result of the data store operation.
    * @return The result of the operation.
    */
  def getResults(): Double
  
  /** Gets a unique identifier that represents the data store operation. */
  var id: Double
  
  /** Gets the current status of the data store operation. */
  var status: AsyncStatus
}
object DataWriterStoreOperation {
  
  inline def apply(
    cancel: () => Unit,
    close: () => Unit,
    completed: (/* asyncInfo */ IAsyncOperation[Double], /* asyncStatus */ AsyncStatus) => Unit,
    errorCode: WinRTError,
    getResults: () => Double,
    id: Double,
    status: AsyncStatus
  ): DataWriterStoreOperation = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), completed = js.Any.fromFunction2(completed), errorCode = errorCode.asInstanceOf[js.Any], getResults = js.Any.fromFunction0(getResults), id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataWriterStoreOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataWriterStoreOperation] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncOperation[Double], /* asyncStatus */ AsyncStatus) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    inline def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setGetResults(value: () => Double): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
