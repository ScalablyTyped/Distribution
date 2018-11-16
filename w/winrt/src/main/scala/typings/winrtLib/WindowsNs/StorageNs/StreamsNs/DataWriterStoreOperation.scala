package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.DataWriterStoreOperation")
@js.native
class DataWriterStoreOperation ()
  extends winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Double]
     with winrtLib.WindowsNs.FoundationNs.IAsyncInfo {
  @JSName("completed")
  var completed_Original: winrtLib.WindowsNs.FoundationNs.AsyncOperationCompletedHandler[scala.Double] = js.native
  /* CompleteClass */
  override var errorCode: scala.Double = js.native
  /* CompleteClass */
  override var id: scala.Double = js.native
  @JSName("operation")
  var operation_DataWriterStoreOperation: winrtLib.Anon_Completed = js.native
  /* CompleteClass */
  override var status: winrtLib.WindowsNs.FoundationNs.AsyncStatus = js.native
  /* InferMemberOverrides */
  override def cancel(): scala.Unit = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  def completed(
    asyncInfo: winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Double],
    asyncStatus: winrtLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  def getResults(): scala.Double = js.native
}

