package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncStatus
import typings.winrtUwp.Windows.Foundation.IAsyncOperation
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Retrieves an SmsDevice object asynchronously. */
@js.native
trait GetSmsDeviceOperation extends js.Object {
  /** Specifies whether the asynchronous SmsDevice object retrieval operation has completed or not. */
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[SmsDevice] = js.native
  /** Specifies the error code for the asynchronous SmsDevice object retrieval operation */
  var errorCode: WinRTError = js.native
  /** Specifies the ID of the asynchronous SmsDevice object retrieval operation. */
  var id: Double = js.native
  /** Specifies the status of the asynchronous SmsDevice object retrieval operation. */
  var status: AsyncStatus = js.native
  /** Cancels the asynchronous SmsDevice object retrieval. */
  def cancel(): Unit = js.native
  /** Closes the asynchronous SmsDevice object retrieval operation. */
  def close(): Unit = js.native
  /** Specifies whether the asynchronous SmsDevice object retrieval operation has completed or not. */
  def completed(asyncInfo: IAsyncOperation[SmsDevice], asyncStatus: AsyncStatus): Unit = js.native
  /**
    * Gets the results of the asynchronous SmsDevice object retrieval operation.
    * @return A reference to an SmsDevice object.
    */
  def getResults(): SmsDevice = js.native
}

