package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDownloadOperation extends IBackgroundTransferOperation {
  var progress: BackgroundDownloadProgress
  var resultFile: IStorageFile
  def attachAsync(): IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
  def pause(): Unit
  def resume(): Unit
  def startAsync(): IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
}

object IDownloadOperation {
  @scala.inline
  def apply(
    attachAsync: () => IAsyncOperationWithProgress[DownloadOperation, DownloadOperation],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: () => ResponseInformation,
    getResultStreamAt: Double => IInputStream,
    group: String,
    guid: String,
    method: String,
    pause: () => Unit,
    progress: BackgroundDownloadProgress,
    requestedUri: Uri,
    resultFile: IStorageFile,
    resume: () => Unit,
    startAsync: () => IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
  ): IDownloadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = js.Any.fromFunction0(attachAsync), costPolicy = costPolicy, getResponseInformation = js.Any.fromFunction0(getResponseInformation), getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group, guid = guid, method = method, pause = js.Any.fromFunction0(pause), progress = progress, requestedUri = requestedUri, resultFile = resultFile, resume = js.Any.fromFunction0(resume), startAsync = js.Any.fromFunction0(startAsync))
  
    __obj.asInstanceOf[IDownloadOperation]
  }
}

