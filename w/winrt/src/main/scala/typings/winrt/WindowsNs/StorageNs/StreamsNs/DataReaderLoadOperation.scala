package typings.winrt.WindowsNs.StorageNs.StreamsNs

import typings.winrt.Anon_CompletedGetResultsAsyncOperationCompletedHandlerNumber
import typings.winrt.WindowsNs.FoundationNs.AsyncOperationCompletedHandler
import typings.winrt.WindowsNs.FoundationNs.AsyncStatus
import typings.winrt.WindowsNs.FoundationNs.IAsyncInfo
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.DataReaderLoadOperation")
@js.native
class DataReaderLoadOperation ()
  extends IAsyncOperation[Double]
     with IAsyncInfo {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[Double] = js.native
  /* CompleteClass */
  override var errorCode: Double = js.native
  /* CompleteClass */
  override var id: Double = js.native
  @JSName("operation")
  var operation_DataReaderLoadOperation: Anon_CompletedGetResultsAsyncOperationCompletedHandlerNumber = js.native
  /* CompleteClass */
  override var status: AsyncStatus = js.native
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  def completed(asyncInfo: IAsyncOperation[Double], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): Double = js.native
}

