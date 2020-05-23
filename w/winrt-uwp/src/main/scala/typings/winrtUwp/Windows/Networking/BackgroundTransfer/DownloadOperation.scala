package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Performs an asynchronous download operation. The Background Transfer sample demonstrates this functionality. For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
trait DownloadOperation extends js.Object {
  /** Gets and sets the cost policy for the download. */
  var costPolicy: BackgroundTransferCostPolicy
  /** Gets a string value indicating the group the transfer belongs to. */
  var group: String
  /** This is a unique identifier for a specific download operation. A GUID associated to a download operation will not change for the duration of the download. */
  var guid: String
  /** Gets the method to use for the download. */
  var method: String
  /** Gets or sets the transfer priority of this download operation when within a BackgroundTransferGroup . Possible values are defined by BackgroundTransferPriority . */
  var priority: BackgroundTransferPriority
  /** Gets the current progress of the upload operation. */
  var progress: BackgroundDownloadProgress
  /** Gets the URI from which to download the file. */
  var requestedUri: Uri
  /** Returns the IStorageFile object provided by the caller when creating the DownloadOperation object using CreateDownload . */
  var resultFile: IStorageFile
  /** Gets the group that this download operation belongs to. */
  var transferGroup: BackgroundTransferGroup
  /**
    * Returns an asynchronous operation that can be used to monitor progress and completion of the attached download. Calling this method allows an app to attach download operations that were started in a previous app instance.
    * @return Download operation with callback.
    */
  def attachAsync(): IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
  /**
    * Gets the response information.
    * @return Contains the data returned by a server response.
    */
  def getResponseInformation(): ResponseInformation
  /**
    * Gets the partially downloaded response at the specified position.
    * @param position The position at which to start reading.
    * @return The result stream.
    */
  def getResultStreamAt(position: Double): IInputStream
  /** Pauses a download operation. */
  def pause(): Unit
  /** Resumes a paused download operation. */
  def resume(): Unit
  /**
    * Starts an asynchronous download operation.
    * @return An asynchronous download operation that includes progress updates.
    */
  def startAsync(): IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
}

object DownloadOperation {
  @scala.inline
  def apply(
    attachAsync: () => IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: () => ResponseInformation,
    getResultStreamAt: Double => IInputStream,
    group: String,
    guid: String,
    method: String,
    pause: () => Unit,
    priority: BackgroundTransferPriority,
    progress: BackgroundDownloadProgress,
    requestedUri: Uri,
    resultFile: IStorageFile,
    resume: () => Unit,
    startAsync: () => IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation],
    transferGroup: BackgroundTransferGroup
  ): DownloadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = js.Any.fromFunction0(attachAsync), costPolicy = costPolicy.asInstanceOf[js.Any], getResponseInformation = js.Any.fromFunction0(getResponseInformation), getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), priority = priority.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], resultFile = resultFile.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), startAsync = js.Any.fromFunction0(startAsync), transferGroup = transferGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOperation]
  }
}

