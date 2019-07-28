package typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.StorageNs.IStorageFile
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.BackgroundTransfer.UploadOperation")
@js.native
class UploadOperation () extends IUploadOperation {
  /* CompleteClass */
  override var costPolicy: BackgroundTransferCostPolicy = js.native
  /* CompleteClass */
  override var group: String = js.native
  /* CompleteClass */
  override var guid: String = js.native
  /* CompleteClass */
  override var method: String = js.native
  /* CompleteClass */
  override var progress: BackgroundUploadProgress = js.native
  /* CompleteClass */
  override var requestedUri: Uri = js.native
  /* CompleteClass */
  override var sourceFile: IStorageFile = js.native
  /* CompleteClass */
  override def attachAsync(): IAsyncOperationWithProgress[UploadOperation, UploadOperation] = js.native
  /* CompleteClass */
  override def getResponseInformation(): ResponseInformation = js.native
  /* CompleteClass */
  override def getResultStreamAt(position: Double): IInputStream = js.native
  /* CompleteClass */
  override def startAsync(): IAsyncOperationWithProgress[UploadOperation, UploadOperation] = js.native
}

