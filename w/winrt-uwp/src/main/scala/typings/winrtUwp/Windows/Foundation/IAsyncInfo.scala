package typings.winrtUwp.Windows.Foundation

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supports asynchronous actions and operations. IAsyncInfo is a base interface for IAsyncAction , IAsyncActionWithProgress<TProgress> , IAsyncOperation<TResult> and IAsyncOperationWithProgress<TResult,TProgress> , each of which support combinations of return type and progress for an asynchronous method. */
@js.native
trait IAsyncInfo extends js.Object {
  
  /** Cancels the asynchronous operation. */
  def cancel(): Unit = js.native
  
  /** Closes the asynchronous operation. */
  def close(): Unit = js.native
  
  /** Gets a string that describes an error condition of the asynchronous operation. */
  var errorCode: WinRTError = js.native
  
  /** Gets the handle of the asynchronous operation. */
  var id: Double = js.native
  
  /** Gets a value that indicates the status of the asynchronous operation. */
  var status: AsyncStatus = js.native
}
object IAsyncInfo {
  
  @scala.inline
  def apply(cancel: () => Unit, close: () => Unit, errorCode: WinRTError, id: Double, status: AsyncStatus): IAsyncInfo = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncInfo]
  }
  
  @scala.inline
  implicit class IAsyncInfoOps[Self <: IAsyncInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setErrorCode(value: WinRTError): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AsyncStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
