package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUploadOperation extends IBackgroundTransferOperation {
  var progress: BackgroundUploadProgress
  var sourceFile: winrtLib.WindowsNs.StorageNs.IStorageFile
  def attachAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[UploadOperation, UploadOperation]
  def startAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[UploadOperation, UploadOperation]
}

object IUploadOperation {
  @scala.inline
  def apply(
    attachAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[UploadOperation, UploadOperation],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: () => ResponseInformation,
    getResultStreamAt: scala.Double => winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    group: java.lang.String,
    guid: java.lang.String,
    method: java.lang.String,
    progress: BackgroundUploadProgress,
    requestedUri: winrtLib.WindowsNs.FoundationNs.Uri,
    sourceFile: winrtLib.WindowsNs.StorageNs.IStorageFile,
    startAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[UploadOperation, UploadOperation]
  ): IUploadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = js.Any.fromFunction0(attachAsync), costPolicy = costPolicy, getResponseInformation = js.Any.fromFunction0(getResponseInformation), getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group, guid = guid, method = method, progress = progress, requestedUri = requestedUri, sourceFile = sourceFile, startAsync = js.Any.fromFunction0(startAsync))
  
    __obj.asInstanceOf[IUploadOperation]
  }
}

