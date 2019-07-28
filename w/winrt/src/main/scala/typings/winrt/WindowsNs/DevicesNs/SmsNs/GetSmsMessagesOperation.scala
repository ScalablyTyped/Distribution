package typings.winrt.WindowsNs.DevicesNs.SmsNs

import typings.winrt.Anon_CompletedGetResultsProgress
import typings.winrt.WindowsNs.FoundationNs.AsyncOperationProgressHandler
import typings.winrt.WindowsNs.FoundationNs.AsyncOperationWithProgressCompletedHandler
import typings.winrt.WindowsNs.FoundationNs.AsyncStatus
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncInfo
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
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

