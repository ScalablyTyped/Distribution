package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.AsyncOperationProgressHandler
import typings.winrtUwp.Windows.Foundation.AsyncOperationWithProgressCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncStatus
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supports the retrieval of messages. */
trait GetSmsMessagesOperation extends StObject {
  
  /** Cancels the asynchronous operations. */
  def cancel(): Unit
  
  /** Closes the asynchronous operations. */
  def close(): Unit
  
  /** Specifies whether the asynchronous message retrieval operation has completed or not. */
  def completed(asyncInfo: IAsyncOperationWithProgress[IVectorView[js.Any], Double], asyncStatus: AsyncStatus): Unit
  /** Specifies whether the asynchronous message retrieval operation has completed or not. */
  @JSName("completed")
  var completed_Original: AsyncOperationWithProgressCompletedHandler[IVectorView[js.Any], Double]
  
  /** Specifies the error code for the asynchronous message operation. */
  var errorCode: WinRTError
  
  /**
    * Retrieves the result of the asynchronous message retrieval operation.
    * @return A reference to the SMS messages retrieved.
    */
  def getResults(): IVectorView[ISmsMessage]
  
  /** Indicates the ID of the asynchronous message operation. */
  var id: Double
  
  /** Specifies the progress status of the asynchronous message operation. */
  def progress(asyncInfo: IAsyncOperationWithProgress[IVectorView[js.Any], Double], progressInfo: Double): Unit
  /** Specifies the progress status of the asynchronous message operation. */
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[IVectorView[js.Any], Double]
  
  /** Specifies the status of the asynchronous message operations. */
  var status: AsyncStatus
}
object GetSmsMessagesOperation {
  
  inline def apply(
    cancel: () => Unit,
    close: () => Unit,
    completed: (/* asyncInfo */ IAsyncOperationWithProgress[IVectorView[js.Any], Double], /* asyncStatus */ AsyncStatus) => Unit,
    errorCode: WinRTError,
    getResults: () => IVectorView[ISmsMessage],
    id: Double,
    progress: (/* asyncInfo */ IAsyncOperationWithProgress[IVectorView[js.Any], Double], Double) => Unit,
    status: AsyncStatus
  ): GetSmsMessagesOperation = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), completed = js.Any.fromFunction2(completed), errorCode = errorCode.asInstanceOf[js.Any], getResults = js.Any.fromFunction0(getResults), id = id.asInstanceOf[js.Any], progress = js.Any.fromFunction2(progress), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSmsMessagesOperation]
  }
  
  extension [Self <: GetSmsMessagesOperation](x: Self) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCompleted(
      value: (/* asyncInfo */ IAsyncOperationWithProgress[IVectorView[js.Any], Double], /* asyncStatus */ AsyncStatus) => Unit
    ): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    inline def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setGetResults(value: () => IVectorView[ISmsMessage]): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: (/* asyncInfo */ IAsyncOperationWithProgress[IVectorView[js.Any], Double], Double) => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
    
    inline def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
