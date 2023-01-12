package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.AsyncActionCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncStatus
import typings.winrtUwp.Windows.Foundation.IAsyncAction
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables the sending of a message. */
trait SendSmsMessageOperation extends StObject {
  
  /** Cancels the asynchronous operation. */
  def cancel(): Unit
  
  /** Closes the asynchronous operation. */
  def close(): Unit
  
  /** A handler for the completed event of an asynchronous action. */
  def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit
  /** A handler for the completed event of an asynchronous action. */
  @JSName("completed")
  var completed_Original: AsyncActionCompletedHandler
  
  /** Specifies the error code for the asynchronous message operation. */
  var errorCode: WinRTError
  
  /** Retrieves the result of the asynchronous operation. */
  def getResults(): Unit
  
  /** Indicates the ID of the asynchronous message operation. */
  var id: Double
  
  /** Specifies the status of the asynchronous message operation. */
  var status: AsyncStatus
}
object SendSmsMessageOperation {
  
  inline def apply(
    cancel: () => Unit,
    close: () => Unit,
    completed: (/* asyncInfo */ IAsyncAction, /* asyncStatus */ AsyncStatus) => Unit,
    errorCode: WinRTError,
    getResults: () => Unit,
    id: Double,
    status: AsyncStatus
  ): SendSmsMessageOperation = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), completed = js.Any.fromFunction2(completed), errorCode = errorCode.asInstanceOf[js.Any], getResults = js.Any.fromFunction0(getResults), id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendSmsMessageOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendSmsMessageOperation] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncAction, /* asyncStatus */ AsyncStatus) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    inline def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setGetResults(value: () => Unit): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
