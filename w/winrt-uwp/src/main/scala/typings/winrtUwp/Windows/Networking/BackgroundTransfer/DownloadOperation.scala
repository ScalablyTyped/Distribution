package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Performs an asynchronous download operation. The Background Transfer sample demonstrates this functionality. For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
@js.native
trait DownloadOperation extends StObject {
  
  /**
    * Returns an asynchronous operation that can be used to monitor progress and completion of the attached download. Calling this method allows an app to attach download operations that were started in a previous app instance.
    * @return Download operation with callback.
    */
  def attachAsync(): IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation] = js.native
  
  /** Gets and sets the cost policy for the download. */
  var costPolicy: BackgroundTransferCostPolicy = js.native
  
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
  
  /** Gets a string value indicating the group the transfer belongs to. */
  var group: String = js.native
  
  /** This is a unique identifier for a specific download operation. A GUID associated to a download operation will not change for the duration of the download. */
  var guid: String = js.native
  
  /** Gets the method to use for the download. */
  var method: String = js.native
  
  /** Pauses a download operation. */
  def pause(): Unit = js.native
  
  /** Gets or sets the transfer priority of this download operation when within a BackgroundTransferGroup . Possible values are defined by BackgroundTransferPriority . */
  var priority: BackgroundTransferPriority = js.native
  
  /** Gets the current progress of the upload operation. */
  var progress: BackgroundDownloadProgress = js.native
  
  /** Gets the URI from which to download the file. */
  var requestedUri: Uri = js.native
  
  /** Returns the IStorageFile object provided by the caller when creating the DownloadOperation object using CreateDownload . */
  var resultFile: IStorageFile = js.native
  
  /** Resumes a paused download operation. */
  def resume(): Unit = js.native
  
  /**
    * Starts an asynchronous download operation.
    * @return An asynchronous download operation that includes progress updates.
    */
  def startAsync(): IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation] = js.native
  
  /** Gets the group that this download operation belongs to. */
  var transferGroup: BackgroundTransferGroup = js.native
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
  
  @scala.inline
  implicit class DownloadOperationMutableBuilder[Self <: DownloadOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachAsync(value: () => IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation]): Self = StObject.set(x, "attachAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCostPolicy(value: BackgroundTransferCostPolicy): Self = StObject.set(x, "costPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetResponseInformation(value: () => ResponseInformation): Self = StObject.set(x, "getResponseInformation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResultStreamAt(value: Double => IInputStream): Self = StObject.set(x, "getResultStreamAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPriority(value: BackgroundTransferPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: BackgroundDownloadProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedUri(value: Uri): Self = StObject.set(x, "requestedUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultFile(value: IStorageFile): Self = StObject.set(x, "resultFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartAsync(value: () => IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation]): Self = StObject.set(x, "startAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransferGroup(value: BackgroundTransferGroup): Self = StObject.set(x, "transferGroup", value.asInstanceOf[js.Any])
  }
}
