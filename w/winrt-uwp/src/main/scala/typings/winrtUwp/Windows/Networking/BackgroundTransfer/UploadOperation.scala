package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Performs an asynchronous upload operation. For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
@js.native
trait UploadOperation extends StObject {
  
  /**
    * Returns an asynchronous operation that can be used to monitor progress and completion of the attached upload. Calling this method allows an app to attach upload operations that were started in a previous app instance.
    * @return Upload operation with callback.
    */
  def attachAsync(): IPromiseWithIAsyncOperationWithProgress[UploadOperation, UploadOperation] = js.native
  
  /** Gets and sets the cost policy for the upload. */
  var costPolicy: BackgroundTransferCostPolicy = js.native
  
  /**
    * Gets the response information.
    * @return Contains the data returned by a server response.
    */
  def getResponseInformation(): ResponseInformation = js.native
  
  /**
    * Gets the partially uploaded response at the specified location.
    * @param position The position at which to start reading.
    * @return The result stream.
    */
  def getResultStreamAt(position: Double): IInputStream = js.native
  
  /** Gets a string value indicating the group the upload belongs to. */
  var group: String = js.native
  
  /** This is a unique identifier for a specific upload operation. A GUID associated to a upload operation will not change for the duration of the upload. */
  var guid: String = js.native
  
  /** Gets the method to use for the upload. */
  var method: String = js.native
  
  /** Gets or sets the transfer priority of this upload operation when within a BackgroundTransferGroup . Possible values are defined by BackgroundTransferPriority . */
  var priority: BackgroundTransferPriority = js.native
  
  /** Gets the current progress of the upload operation. */
  var progress: BackgroundUploadProgress = js.native
  
  /** Gets the URI to upload from. */
  var requestedUri: Uri = js.native
  
  /** Specifies the IStorageFile to upload. */
  var sourceFile: IStorageFile = js.native
  
  /**
    * Starts an asynchronous upload operation.
    * @return An asynchronous upload operation that includes progress updates.
    */
  def startAsync(): IPromiseWithIAsyncOperationWithProgress[UploadOperation, UploadOperation] = js.native
  
  /** Gets the group that this upload operation belongs to. */
  var transferGroup: BackgroundTransferGroup = js.native
}
object UploadOperation {
  
  @scala.inline
  def apply(
    attachAsync: () => IPromiseWithIAsyncOperationWithProgress[UploadOperation, UploadOperation],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: () => ResponseInformation,
    getResultStreamAt: Double => IInputStream,
    group: String,
    guid: String,
    method: String,
    priority: BackgroundTransferPriority,
    progress: BackgroundUploadProgress,
    requestedUri: Uri,
    sourceFile: IStorageFile,
    startAsync: () => IPromiseWithIAsyncOperationWithProgress[UploadOperation, UploadOperation],
    transferGroup: BackgroundTransferGroup
  ): UploadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = js.Any.fromFunction0(attachAsync), costPolicy = costPolicy.asInstanceOf[js.Any], getResponseInformation = js.Any.fromFunction0(getResponseInformation), getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], startAsync = js.Any.fromFunction0(startAsync), transferGroup = transferGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOperation]
  }
  
  @scala.inline
  implicit class UploadOperationMutableBuilder[Self <: UploadOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachAsync(value: () => IPromiseWithIAsyncOperationWithProgress[UploadOperation, UploadOperation]): Self = StObject.set(x, "attachAsync", js.Any.fromFunction0(value))
    
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
    def setPriority(value: BackgroundTransferPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: BackgroundUploadProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedUri(value: Uri): Self = StObject.set(x, "requestedUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFile(value: IStorageFile): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAsync(value: () => IPromiseWithIAsyncOperationWithProgress[UploadOperation, UploadOperation]): Self = StObject.set(x, "startAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransferGroup(value: BackgroundTransferGroup): Self = StObject.set(x, "transferGroup", value.asInstanceOf[js.Any])
  }
}
