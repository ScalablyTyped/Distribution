package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDownloadOperation extends IBackgroundTransferOperation {
  var progress: BackgroundDownloadProgress
  var resultFile: winrtLib.WindowsNs.StorageNs.IStorageFile
  def attachAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
  def pause(): scala.Unit
  def resume(): scala.Unit
  def startAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
}

