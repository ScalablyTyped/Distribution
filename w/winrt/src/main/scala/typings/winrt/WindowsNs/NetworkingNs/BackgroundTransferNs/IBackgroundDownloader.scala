package typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.StorageNs.IStorageFile
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundDownloader extends IBackgroundTransferBase {
  def createDownload(uri: Uri, resultFile: IStorageFile): DownloadOperation = js.native
  def createDownload(uri: Uri, resultFile: IStorageFile, requestBodyFile: IStorageFile): DownloadOperation = js.native
  def createDownloadAsync(uri: Uri, resultFile: IStorageFile, requestBodyStream: IInputStream): IAsyncOperation[DownloadOperation] = js.native
}

