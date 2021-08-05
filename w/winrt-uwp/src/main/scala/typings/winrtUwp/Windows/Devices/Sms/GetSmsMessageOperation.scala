package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncStatus
import typings.winrtUwp.Windows.Foundation.IAsyncOperation
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supports the retrieval of a message from the SMS message store. */
trait GetSmsMessageOperation extends StObject {
  
  /** Cancels the asynchronous SMS message retrieval operation. */
  def cancel(): Unit
  
  /** Closes the asynchronous SMS message retrieval operation. */
  def close(): Unit
  
  /** A handler for the completed event of an asynchronous SMS message retrieval operation. */
  def completed(asyncInfo: IAsyncOperation[ISmsMessage], asyncStatus: AsyncStatus): Unit
  /** A handler for the completed event of an asynchronous SMS message retrieval operation. */
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[ISmsMessage]
  
  /** Specifies the error code for the asynchronous SMS message retrieval operation. */
  var errorCode: WinRTError
  
  /**
    * Retrieves the result of the asynchronous SMS message retrieval operation.
    * @return An interface that accesses the retrieved message.
    */
  def getResults(): ISmsMessage
  
  /** Specifies the ID of the asynchronous SMS message retrieval operation. */
  var id: Double
  
  /** Specifies the status of the asynchronous SMS message retrieval operation. */
  var status: AsyncStatus
}
object GetSmsMessageOperation {
  
  inline def apply(
    cancel: () => Unit,
    close: () => Unit,
    completed: (/* asyncInfo */ IAsyncOperation[ISmsMessage], /* asyncStatus */ AsyncStatus) => Unit,
    errorCode: WinRTError,
    getResults: () => ISmsMessage,
    id: Double,
    status: AsyncStatus
  ): GetSmsMessageOperation = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), completed = js.Any.fromFunction2(completed), errorCode = errorCode.asInstanceOf[js.Any], getResults = js.Any.fromFunction0(getResults), id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSmsMessageOperation]
  }
  
  extension [Self <: GetSmsMessageOperation](x: Self) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncOperation[ISmsMessage], /* asyncStatus */ AsyncStatus) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    inline def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setGetResults(value: () => ISmsMessage): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
