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

object IDownloadOperation {
  @scala.inline
  def apply(
    attachAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[DownloadOperation, DownloadOperation],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: () => ResponseInformation,
    getResultStreamAt: scala.Double => winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    group: java.lang.String,
    guid: java.lang.String,
    method: java.lang.String,
    pause: () => scala.Unit,
    progress: BackgroundDownloadProgress,
    requestedUri: winrtLib.WindowsNs.FoundationNs.Uri,
    resultFile: winrtLib.WindowsNs.StorageNs.IStorageFile,
    resume: () => scala.Unit,
    startAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
  ): IDownloadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = js.Any.fromFunction0(attachAsync), costPolicy = costPolicy, getResponseInformation = js.Any.fromFunction0(getResponseInformation), getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group, guid = guid, method = method, pause = js.Any.fromFunction0(pause), progress = progress, requestedUri = requestedUri, resultFile = resultFile, resume = js.Any.fromFunction0(resume), startAsync = js.Any.fromFunction0(startAsync))
  
    __obj.asInstanceOf[IDownloadOperation]
  }
}

