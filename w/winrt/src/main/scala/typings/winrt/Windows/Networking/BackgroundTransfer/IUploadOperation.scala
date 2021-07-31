package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUploadOperation
  extends StObject
     with IBackgroundTransferOperation {
  
  def attachAsync(): IAsyncOperationWithProgress[UploadOperation, UploadOperation]
  
  var progress: BackgroundUploadProgress
  
  var sourceFile: IStorageFile
  
  def startAsync(): IAsyncOperationWithProgress[UploadOperation, UploadOperation]
}
object IUploadOperation {
  
  @scala.inline
  def apply(
    attachAsync: () => IAsyncOperationWithProgress[UploadOperation, UploadOperation],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: () => ResponseInformation,
    getResultStreamAt: Double => IInputStream,
    group: String,
    guid: String,
    method: String,
    progress: BackgroundUploadProgress,
    requestedUri: Uri,
    sourceFile: IStorageFile,
    startAsync: () => IAsyncOperationWithProgress[UploadOperation, UploadOperation]
  ): IUploadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = js.Any.fromFunction0(attachAsync), costPolicy = costPolicy.asInstanceOf[js.Any], getResponseInformation = js.Any.fromFunction0(getResponseInformation), getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], startAsync = js.Any.fromFunction0(startAsync))
    __obj.asInstanceOf[IUploadOperation]
  }
  
  @scala.inline
  implicit class IUploadOperationMutableBuilder[Self <: IUploadOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachAsync(value: () => IAsyncOperationWithProgress[UploadOperation, UploadOperation]): Self = StObject.set(x, "attachAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProgress(value: BackgroundUploadProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFile(value: IStorageFile): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAsync(value: () => IAsyncOperationWithProgress[UploadOperation, UploadOperation]): Self = StObject.set(x, "startAsync", js.Any.fromFunction0(value))
  }
}
