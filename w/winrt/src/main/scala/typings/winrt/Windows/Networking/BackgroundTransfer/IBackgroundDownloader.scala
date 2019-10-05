package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundDownloader extends IBackgroundTransferBase {
  def createDownload(uri: Uri, resultFile: IStorageFile): DownloadOperation = js.native
  def createDownload(uri: Uri, resultFile: IStorageFile, requestBodyFile: IStorageFile): DownloadOperation = js.native
  def createDownloadAsync(uri: Uri, resultFile: IStorageFile, requestBodyStream: IInputStream): IAsyncOperation[DownloadOperation] = js.native
}

