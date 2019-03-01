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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachAsync")(attachAsync)
    __obj.updateDynamic("costPolicy")(costPolicy)
    __obj.updateDynamic("getResponseInformation")(getResponseInformation)
    __obj.updateDynamic("getResultStreamAt")(getResultStreamAt)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("guid")(guid)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("requestedUri")(requestedUri)
    __obj.updateDynamic("resultFile")(resultFile)
    __obj.updateDynamic("resume")(resume)
    __obj.updateDynamic("startAsync")(startAsync)
    __obj.asInstanceOf[IDownloadOperation]
  }
}

