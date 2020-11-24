package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDownloadOperation extends IBackgroundTransferOperation {
  
  def attachAsync(): IAsyncOperationWithProgress[DownloadOperation, DownloadOperation] = js.native
  
  def pause(): Unit = js.native
  
  var progress: BackgroundDownloadProgress = js.native
  
  var resultFile: IStorageFile = js.native
  
  def resume(): Unit = js.native
  
  def startAsync(): IAsyncOperationWithProgress[DownloadOperation, DownloadOperation] = js.native
}
object IDownloadOperation {
  
  @scala.inline
  def apply(
    attachAsync: () => IAsyncOperationWithProgress[DownloadOperation, DownloadOperation],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: () => ResponseInformation,
    getResultStreamAt: Double => IInputStream,
    group: String,
    guid: String,
    method: String,
    pause: () => Unit,
    progress: BackgroundDownloadProgress,
    requestedUri: Uri,
    resultFile: IStorageFile,
    resume: () => Unit,
    startAsync: () => IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
  ): IDownloadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = js.Any.fromFunction0(attachAsync), costPolicy = costPolicy.asInstanceOf[js.Any], getResponseInformation = js.Any.fromFunction0(getResponseInformation), getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), progress = progress.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], resultFile = resultFile.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), startAsync = js.Any.fromFunction0(startAsync))
    __obj.asInstanceOf[IDownloadOperation]
  }
  
  @scala.inline
  implicit class IDownloadOperationOps[Self <: IDownloadOperation] (val x: Self) extends AnyVal {
    
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
    def setAttachAsync(value: () => IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]): Self = this.set("attachAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProgress(value: BackgroundDownloadProgress): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultFile(value: IStorageFile): Self = this.set("resultFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(value: () => Unit): Self = this.set("resume", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartAsync(value: () => IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]): Self = this.set("startAsync", js.Any.fromFunction0(value))
  }
}
