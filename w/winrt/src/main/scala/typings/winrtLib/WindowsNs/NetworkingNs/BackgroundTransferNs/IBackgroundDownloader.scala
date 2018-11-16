package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundDownloader extends IBackgroundTransferBase {
  def createDownload(uri: winrtLib.WindowsNs.FoundationNs.Uri, resultFile: winrtLib.WindowsNs.StorageNs.IStorageFile): DownloadOperation = js.native
  def createDownload(
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    resultFile: winrtLib.WindowsNs.StorageNs.IStorageFile,
    requestBodyFile: winrtLib.WindowsNs.StorageNs.IStorageFile
  ): DownloadOperation = js.native
  def createDownloadAsync(
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    resultFile: winrtLib.WindowsNs.StorageNs.IStorageFile,
    requestBodyStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[DownloadOperation] = js.native
}

