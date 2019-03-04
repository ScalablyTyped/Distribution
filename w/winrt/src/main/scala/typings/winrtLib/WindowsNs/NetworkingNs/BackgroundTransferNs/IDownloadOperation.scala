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
    attachAsync: js.Function0[
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
    ],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: js.Function0[ResponseInformation],
    getResultStreamAt: js.Function1[scala.Double, winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream],
    group: java.lang.String,
    guid: java.lang.String,
    method: java.lang.String,
    pause: js.Function0[scala.Unit],
    progress: BackgroundDownloadProgress,
    requestedUri: winrtLib.WindowsNs.FoundationNs.Uri,
    resultFile: winrtLib.WindowsNs.StorageNs.IStorageFile,
    resume: js.Function0[scala.Unit],
    startAsync: js.Function0[
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
    ]
  ): IDownloadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = attachAsync, costPolicy = costPolicy, getResponseInformation = getResponseInformation, getResultStreamAt = getResultStreamAt, group = group, guid = guid, method = method, pause = pause, progress = progress, requestedUri = requestedUri, resultFile = resultFile, resume = resume, startAsync = startAsync)
  
    __obj.asInstanceOf[IDownloadOperation]
  }
}

