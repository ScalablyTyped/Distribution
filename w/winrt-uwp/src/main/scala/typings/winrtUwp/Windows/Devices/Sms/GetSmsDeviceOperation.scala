package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncStatus
import typings.winrtUwp.Windows.Foundation.IAsyncOperation
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Retrieves an SmsDevice object asynchronously. */
trait GetSmsDeviceOperation extends StObject {
  
  /** Cancels the asynchronous SmsDevice object retrieval. */
  def cancel(): Unit
  
  /** Closes the asynchronous SmsDevice object retrieval operation. */
  def close(): Unit
  
  /** Specifies whether the asynchronous SmsDevice object retrieval operation has completed or not. */
  def completed(asyncInfo: IAsyncOperation[SmsDevice], asyncStatus: AsyncStatus): Unit
  /** Specifies whether the asynchronous SmsDevice object retrieval operation has completed or not. */
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[SmsDevice]
  
  /** Specifies the error code for the asynchronous SmsDevice object retrieval operation */
  var errorCode: WinRTError
  
  /**
    * Gets the results of the asynchronous SmsDevice object retrieval operation.
    * @return A reference to an SmsDevice object.
    */
  def getResults(): SmsDevice
  
  /** Specifies the ID of the asynchronous SmsDevice object retrieval operation. */
  var id: Double
  
  /** Specifies the status of the asynchronous SmsDevice object retrieval operation. */
  var status: AsyncStatus
}
object GetSmsDeviceOperation {
  
  @scala.inline
  def apply(
    cancel: () => Unit,
    close: () => Unit,
    completed: (/* asyncInfo */ IAsyncOperation[SmsDevice], /* asyncStatus */ AsyncStatus) => Unit,
    errorCode: WinRTError,
    getResults: () => SmsDevice,
    id: Double,
    status: AsyncStatus
  ): GetSmsDeviceOperation = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), completed = js.Any.fromFunction2(completed), errorCode = errorCode.asInstanceOf[js.Any], getResults = js.Any.fromFunction0(getResults), id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSmsDeviceOperation]
  }
  
  @scala.inline
  implicit class GetSmsDeviceOperationMutableBuilder[Self <: GetSmsDeviceOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleted(value: (/* asyncInfo */ IAsyncOperation[SmsDevice], /* asyncStatus */ AsyncStatus) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetResults(value: () => SmsDevice): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
