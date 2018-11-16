package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.BackgroundTransfer.DownloadOperation")
@js.native
class DownloadOperation () extends IDownloadOperation {
  /* CompleteClass */
  override var costPolicy: BackgroundTransferCostPolicy = js.native
  /* CompleteClass */
  override var group: java.lang.String = js.native
  /* CompleteClass */
  override var guid: java.lang.String = js.native
  /* CompleteClass */
  override var method: java.lang.String = js.native
  /* CompleteClass */
  override var progress: BackgroundDownloadProgress = js.native
  /* CompleteClass */
  override var requestedUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var resultFile: winrtLib.WindowsNs.StorageNs.IStorageFile = js.native
  /* CompleteClass */
  override def attachAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[DownloadOperation, DownloadOperation] = js.native
  /* CompleteClass */
  override def getResponseInformation(): ResponseInformation = js.native
  /* CompleteClass */
  override def getResultStreamAt(position: scala.Double): winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream = js.native
  /* CompleteClass */
  override def pause(): scala.Unit = js.native
  /* CompleteClass */
  override def resume(): scala.Unit = js.native
  /* CompleteClass */
  override def startAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[DownloadOperation, DownloadOperation] = js.native
}

