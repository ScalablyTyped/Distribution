package typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.StorageNs.IStorageFile
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundUploader extends IBackgroundTransferBase {
  def createUpload(uri: Uri, sourceFile: IStorageFile): UploadOperation = js.native
  def createUploadAsync(uri: Uri, parts: IIterable[BackgroundTransferContentPart]): IAsyncOperation[UploadOperation] = js.native
  def createUploadAsync(uri: Uri, parts: IIterable[BackgroundTransferContentPart], subType: String): IAsyncOperation[UploadOperation] = js.native
  def createUploadAsync(uri: Uri, parts: IIterable[BackgroundTransferContentPart], subType: String, boundary: String): IAsyncOperation[UploadOperation] = js.native
  def createUploadFromStreamAsync(uri: Uri, sourceStream: IInputStream): IAsyncOperation[UploadOperation] = js.native
}

