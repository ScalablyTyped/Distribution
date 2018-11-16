package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.StreamedFileDataRequest")
@js.native
class StreamedFileDataRequest ()
  extends winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream
     with IStreamedFileDataRequest {
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def failAndClose(failureMode: StreamedFileFailureMode): scala.Unit = js.native
  /* CompleteClass */
  override def flushAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  /* CompleteClass */
  override def writeAsync(buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
}

