package typings.winrtUwp.Windows.Foundation

import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supports asynchronous actions and operations. IAsyncInfo is a base interface for IAsyncAction , IAsyncActionWithProgress<TProgress> , IAsyncOperation<TResult> and IAsyncOperationWithProgress<TResult,TProgress> , each of which support combinations of return type and progress for an asynchronous method. */
trait IAsyncInfo extends StObject {
  
  /** Cancels the asynchronous operation. */
  def cancel(): Unit
  
  /** Closes the asynchronous operation. */
  def close(): Unit
  
  /** Gets a string that describes an error condition of the asynchronous operation. */
  var errorCode: WinRTError
  
  /** Gets the handle of the asynchronous operation. */
  var id: Double
  
  /** Gets a value that indicates the status of the asynchronous operation. */
  var status: AsyncStatus
}
object IAsyncInfo {
  
  @scala.inline
  def apply(cancel: () => Unit, close: () => Unit, errorCode: WinRTError, id: Double, status: AsyncStatus): IAsyncInfo = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncInfo]
  }
  
  @scala.inline
  implicit class IAsyncInfoMutableBuilder[Self <: IAsyncInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
