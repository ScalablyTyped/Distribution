package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUploadOperation extends IBackgroundTransferOperation {
  
  def attachAsync(): IAsyncOperationWithProgress[UploadOperation, UploadOperation] = js.native
  
  var progress: BackgroundUploadProgress = js.native
  
  var sourceFile: IStorageFile = js.native
  
  def startAsync(): IAsyncOperationWithProgress[UploadOperation, UploadOperation] = js.native
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
  implicit class IUploadOperationOps[Self <: IUploadOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachAsync(value: () => IAsyncOperationWithProgress[UploadOperation, UploadOperation]): Self = this.set("attachAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProgress(value: BackgroundUploadProgress): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFile(value: IStorageFile): Self = this.set("sourceFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAsync(value: () => IAsyncOperationWithProgress[UploadOperation, UploadOperation]): Self = this.set("startAsync", js.Any.fromFunction0(value))
  }
}
