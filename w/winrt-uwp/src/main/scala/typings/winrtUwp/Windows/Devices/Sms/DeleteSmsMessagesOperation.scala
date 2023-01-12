package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.AsyncActionCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncStatus
import typings.winrtUwp.Windows.Foundation.IAsyncAction
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables start, track, and end asynchronous SMS message delete operations for multiple messages. */
trait DeleteSmsMessagesOperation extends StObject {
  
  /** Cancels the asynchronous SMS message delete operations. */
  def cancel(): Unit
  
  /** Closes the asynchronous SMS message delete operations. */
  def close(): Unit
  
  /** Specifies whether the asynchronous SMS message delete operations have completed or not. */
  def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit
  /** Specifies whether the asynchronous SMS message delete operations have completed or not. */
  @JSName("completed")
  var completed_Original: AsyncActionCompletedHandler
  
  /** Specifies the error code for the asynchronous SMS message delete operations. */
  var errorCode: WinRTError
  
  /** Retrieves the result of the asynchronous message operations. */
  def getResults(): Unit
  
  /** Specifies the ID of the asynchronous SMS message delete operations. */
  var id: Double
  
  /** Specifies the status of the asynchronous SMS message delete operations. */
  var status: AsyncStatus
}
object DeleteSmsMessagesOperation {
  
  inline def apply(
    cancel: () => Unit,
    close: () => Unit,
    completed: (/* asyncInfo */ IAsyncAction, /* asyncStatus */ AsyncStatus) => Unit,
    errorCode: WinRTError,
    getResults: () => Unit,
    id: Double,
    status: AsyncStatus
  ): DeleteSmsMessagesOperation = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), completed = js.Any.fromFunction2(completed), errorCode = errorCode.asInstanceOf[js.Any], getResults = js.Any.fromFunction0(getResults), id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSmsMessagesOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSmsMessagesOperation] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncAction, /* asyncStatus */ AsyncStatus) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    inline def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setGetResults(value: () => Unit): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
