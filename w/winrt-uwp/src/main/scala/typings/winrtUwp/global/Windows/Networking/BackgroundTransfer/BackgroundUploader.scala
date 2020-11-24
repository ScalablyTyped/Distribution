package typings.winrtUwp.global.Windows.Networking.BackgroundTransfer

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to configure upload prior to the actual creation of the upload operation using CreateUpload . For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader")
@js.native
/** Instantiates a new BackgroundUploader object. */
class BackgroundUploader ()
  extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundUploader {
  /**
    * Instantiates a new BackgroundUploader object as a member of a completion group.
    * @param completionGroup The completion group that the created BackgroundUploader instance is to be a member of.
    */
  def this(completionGroup: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroup) = this()
}
/* static members */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader")
@js.native
object BackgroundUploader extends js.Object {
  
  /**
    * Returns a collection of pending uploads that are not associated with a group.
    * @return A collection of pending uploads for the current application instance.
    */
  def getCurrentUploadsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Returns a collection of pending uploads for a specific Group .
    * @param group A string indicating a specific group of uploads.
    * @return A collection of pending uploads for the specific group.
    */
  def getCurrentUploadsAsync(group: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Gets all uploads associated with the provided BackgroundTransferGroup .
    * @param group Contains information used to identify a group of uploads.
    * @return A list of uploads currently associated with the specified group.
    */
  def getCurrentUploadsForTransferGroupAsync(group: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Used to request an unconstrained upload operation. When this method is called the user is provided with a UI prompt that they can use to indicate their consent for an unconstrained operation.
    * @param operations The upload operation to run unconstrained.
    * @return Indicates if the operations will run unconstrained.
    */
  def requestUnconstrainedUploadsAsync(operations: IIterable[typings.winrtUwp.Windows.Networking.BackgroundTransfer.UploadOperation]): IPromiseWithIAsyncOperation[
    typings.winrtUwp.Windows.Networking.BackgroundTransfer.UnconstrainedTransferRequestResult
  ] = js.native
}
