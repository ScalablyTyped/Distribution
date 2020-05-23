package typings.winrtUwp.global.Windows.Networking.BackgroundTransfer

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundUploadProgress
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Performs an asynchronous upload operation. For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
@JSGlobal("Windows.Networking.BackgroundTransfer.UploadOperation")
@js.native
abstract class UploadOperation ()
  extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.UploadOperation {
  /** Gets and sets the cost policy for the upload. */
  /* CompleteClass */
  override var costPolicy: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy = js.native
  /** Gets a string value indicating the group the upload belongs to. */
  /* CompleteClass */
  override var group: String = js.native
  /** This is a unique identifier for a specific upload operation. A GUID associated to a upload operation will not change for the duration of the upload. */
  /* CompleteClass */
  override var guid: String = js.native
  /** Gets the method to use for the upload. */
  /* CompleteClass */
  override var method: String = js.native
  /** Gets or sets the transfer priority of this upload operation when within a BackgroundTransferGroup . Possible values are defined by BackgroundTransferPriority . */
  /* CompleteClass */
  override var priority: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferPriority = js.native
  /** Gets the current progress of the upload operation. */
  /* CompleteClass */
  override var progress: BackgroundUploadProgress = js.native
  /** Gets the URI to upload from. */
  /* CompleteClass */
  override var requestedUri: Uri = js.native
  /** Specifies the IStorageFile to upload. */
  /* CompleteClass */
  override var sourceFile: IStorageFile = js.native
  /** Gets the group that this upload operation belongs to. */
  /* CompleteClass */
  override var transferGroup: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup = js.native
  /**
    * Returns an asynchronous operation that can be used to monitor progress and completion of the attached upload. Calling this method allows an app to attach upload operations that were started in a previous app instance.
    * @return Upload operation with callback.
    */
  /* CompleteClass */
  override def attachAsync(): IPromiseWithIAsyncOperationWithProgress[
    typings.winrtUwp.Windows.Networking.BackgroundTransfer.UploadOperation, 
    typings.winrtUwp.Windows.Networking.BackgroundTransfer.UploadOperation
  ] = js.native
  /**
    * Gets the response information.
    * @return Contains the data returned by a server response.
    */
  /* CompleteClass */
  override def getResponseInformation(): typings.winrtUwp.Windows.Networking.BackgroundTransfer.ResponseInformation = js.native
  /**
    * Gets the partially uploaded response at the specified location.
    * @param position The position at which to start reading.
    * @return The result stream.
    */
  /* CompleteClass */
  override def getResultStreamAt(position: Double): IInputStream = js.native
  /**
    * Starts an asynchronous upload operation.
    * @return An asynchronous upload operation that includes progress updates.
    */
  /* CompleteClass */
  override def startAsync(): IPromiseWithIAsyncOperationWithProgress[
    typings.winrtUwp.Windows.Networking.BackgroundTransfer.UploadOperation, 
    typings.winrtUwp.Windows.Networking.BackgroundTransfer.UploadOperation
  ] = js.native
}

