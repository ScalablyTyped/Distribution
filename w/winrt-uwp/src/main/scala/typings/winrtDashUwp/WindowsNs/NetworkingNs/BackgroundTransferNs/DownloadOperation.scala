package typings.winrtDashUwp.WindowsNs.NetworkingNs.BackgroundTransferNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import typings.winrtDashUwp.WindowsNs.StorageNs.IStorageFile
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Performs an asynchronous download operation. The Background Transfer sample demonstrates this functionality. For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
@JSGlobal("Windows.Networking.BackgroundTransfer.DownloadOperation")
@js.native
abstract class DownloadOperation () extends js.Object {
  /** Gets and sets the cost policy for the download. */
  var costPolicy: BackgroundTransferCostPolicy = js.native
  /** Gets a string value indicating the group the transfer belongs to. */
  var group: String = js.native
  /** This is a unique identifier for a specific download operation. A GUID associated to a download operation will not change for the duration of the download. */
  var guid: String = js.native
  /** Gets the method to use for the download. */
  var method: String = js.native
  /** Gets or sets the transfer priority of this download operation when within a BackgroundTransferGroup . Possible values are defined by BackgroundTransferPriority . */
  var priority: BackgroundTransferPriority = js.native
  /** Gets the current progress of the upload operation. */
  var progress: BackgroundDownloadProgress = js.native
  /** Gets the URI from which to download the file. */
  var requestedUri: Uri = js.native
  /** Returns the IStorageFile object provided by the caller when creating the DownloadOperation object using CreateDownload . */
  var resultFile: IStorageFile = js.native
  /** Gets the group that this download operation belongs to. */
  var transferGroup: BackgroundTransferGroup = js.native
  /**
    * Returns an asynchronous operation that can be used to monitor progress and completion of the attached download. Calling this method allows an app to attach download operations that were started in a previous app instance.
    * @return Download operation with callback.
    */
  def attachAsync(): IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation] = js.native
  /**
    * Gets the response information.
    * @return Contains the data returned by a server response.
    */
  def getResponseInformation(): ResponseInformation = js.native
  /**
    * Gets the partially downloaded response at the specified position.
    * @param position The position at which to start reading.
    * @return The result stream.
    */
  def getResultStreamAt(position: Double): IInputStream = js.native
  /** Pauses a download operation. */
  def pause(): Unit = js.native
  /** Resumes a paused download operation. */
  def resume(): Unit = js.native
  /**
    * Starts an asynchronous download operation.
    * @return An asynchronous download operation that includes progress updates.
    */
  def startAsync(): IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation] = js.native
}

