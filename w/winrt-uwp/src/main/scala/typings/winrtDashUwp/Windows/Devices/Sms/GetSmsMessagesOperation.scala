package typings.winrtDashUwp.Windows.Devices.Sms

import typings.winrtDashUwp.Windows.Foundation.AsyncOperationProgressHandler
import typings.winrtDashUwp.Windows.Foundation.AsyncOperationWithProgressCompletedHandler
import typings.winrtDashUwp.Windows.Foundation.AsyncStatus
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrtDashUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the retrieval of messages. */
@JSGlobal("Windows.Devices.Sms.GetSmsMessagesOperation")
@js.native
abstract class GetSmsMessagesOperation () extends js.Object {
  /** Specifies whether the asynchronous message retrieval operation has completed or not. */
  @JSName("completed")
  var completed_Original: AsyncOperationWithProgressCompletedHandler[IVectorView[_], Double] = js.native
  /** Specifies the error code for the asynchronous message operation. */
  var errorCode: WinRTError = js.native
  /** Indicates the ID of the asynchronous message operation. */
  var id: Double = js.native
  /** Specifies the progress status of the asynchronous message operation. */
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[IVectorView[_], Double] = js.native
  /** Specifies the status of the asynchronous message operations. */
  var status: AsyncStatus = js.native
  /** Cancels the asynchronous operations. */
  def cancel(): Unit = js.native
  /** Closes the asynchronous operations. */
  def close(): Unit = js.native
  /** Specifies whether the asynchronous message retrieval operation has completed or not. */
  def completed(asyncInfo: IAsyncOperationWithProgress[IVectorView[_], Double], asyncStatus: AsyncStatus): Unit = js.native
  /**
    * Retrieves the result of the asynchronous message retrieval operation.
    * @return A reference to the SMS messages retrieved.
    */
  def getResults(): IVectorView[ISmsMessage] = js.native
  /** Specifies the progress status of the asynchronous message operation. */
  def progress(asyncInfo: IAsyncOperationWithProgress[IVectorView[_], Double], progressInfo: Double): Unit = js.native
}

