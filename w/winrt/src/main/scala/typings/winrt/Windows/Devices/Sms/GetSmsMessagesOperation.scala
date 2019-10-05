package typings.winrt.Windows.Devices.Sms

import typings.winrt.Anon_CompletedGetResultsProgress
import typings.winrt.Windows.Foundation.AsyncOperationProgressHandler
import typings.winrt.Windows.Foundation.AsyncOperationWithProgressCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncInfo
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.GetSmsMessagesOperation")
@js.native
class GetSmsMessagesOperation ()
  extends IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double]
     with IAsyncInfo {
  @JSName("completed")
  var completed_Original: AsyncOperationWithProgressCompletedHandler[IVectorView[ISmsMessage], Double] = js.native
  /* CompleteClass */
  override var errorCode: Double = js.native
  /* CompleteClass */
  override var id: Double = js.native
  @JSName("operation")
  var operation_GetSmsMessagesOperation: Anon_CompletedGetResultsProgress = js.native
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[IVectorView[ISmsMessage], Double] = js.native
  /* CompleteClass */
  override var status: AsyncStatus = js.native
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  def completed(asyncInfo: IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): IVectorView[ISmsMessage] = js.native
  def progress(asyncInfo: IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double], progressInfo: Double): Unit = js.native
}

