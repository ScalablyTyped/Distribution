package typings.winrt.global.Windows.Networking

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundDownloadProgress
import typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy
import typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundUploadProgress
import typings.winrt.Windows.Security.Credentials.PasswordCredential
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Web.WebErrorStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.BackgroundTransfer")
@js.native
object BackgroundTransfer extends js.Object {
  @js.native
  class BackgroundDownloader ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundDownloader {
    /* CompleteClass */
    override var costPolicy: BackgroundTransferCostPolicy = js.native
    /* CompleteClass */
    override var group: String = js.native
    /* CompleteClass */
    override var method: String = js.native
    /* CompleteClass */
    override var proxyCredential: PasswordCredential = js.native
    /* CompleteClass */
    override var serverCredential: PasswordCredential = js.native
    /* CompleteClass */
    override def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
  }
  
  @js.native
  class BackgroundTransferContentPart ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart {
    def this(name: String) = this()
    def this(name: String, fileName: String) = this()
    /* CompleteClass */
    override def setFile(value: IStorageFile): Unit = js.native
    /* CompleteClass */
    override def setHeader(headerName: String, headerValue: String): Unit = js.native
    /* CompleteClass */
    override def setText(value: String): Unit = js.native
  }
  
  @js.native
  class BackgroundTransferError ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferError
  
  @js.native
  class BackgroundUploader ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundUploader {
    /* CompleteClass */
    override var costPolicy: BackgroundTransferCostPolicy = js.native
    /* CompleteClass */
    override var group: String = js.native
    /* CompleteClass */
    override var method: String = js.native
    /* CompleteClass */
    override var proxyCredential: PasswordCredential = js.native
    /* CompleteClass */
    override var serverCredential: PasswordCredential = js.native
    /* CompleteClass */
    override def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
  }
  
  @js.native
  class DownloadOperation ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation {
    /* CompleteClass */
    override var costPolicy: BackgroundTransferCostPolicy = js.native
    /* CompleteClass */
    override var group: String = js.native
    /* CompleteClass */
    override var guid: String = js.native
    /* CompleteClass */
    override var method: String = js.native
    /* CompleteClass */
    override var progress: BackgroundDownloadProgress = js.native
    /* CompleteClass */
    override var requestedUri: Uri = js.native
    /* CompleteClass */
    override var resultFile: IStorageFile = js.native
    /* CompleteClass */
    override def attachAsync(): IAsyncOperationWithProgress[
        typings.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation, 
        typings.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation
      ] = js.native
    /* CompleteClass */
    override def getResponseInformation(): typings.winrt.Windows.Networking.BackgroundTransfer.ResponseInformation = js.native
    /* CompleteClass */
    override def getResultStreamAt(position: Double): IInputStream = js.native
    /* CompleteClass */
    override def pause(): Unit = js.native
    /* CompleteClass */
    override def resume(): Unit = js.native
    /* CompleteClass */
    override def startAsync(): IAsyncOperationWithProgress[
        typings.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation, 
        typings.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation
      ] = js.native
  }
  
  @js.native
  class ResponseInformation ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.ResponseInformation {
    /* CompleteClass */
    override var actualUri: Uri = js.native
    /* CompleteClass */
    override var headers: IMapView[String, String] = js.native
    /* CompleteClass */
    override var isResumable: Boolean = js.native
    /* CompleteClass */
    override var statusCode: Double = js.native
  }
  
  @js.native
  class UploadOperation ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.UploadOperation {
    /* CompleteClass */
    override var costPolicy: BackgroundTransferCostPolicy = js.native
    /* CompleteClass */
    override var group: String = js.native
    /* CompleteClass */
    override var guid: String = js.native
    /* CompleteClass */
    override var method: String = js.native
    /* CompleteClass */
    override var progress: BackgroundUploadProgress = js.native
    /* CompleteClass */
    override var requestedUri: Uri = js.native
    /* CompleteClass */
    override var sourceFile: IStorageFile = js.native
    /* CompleteClass */
    override def attachAsync(): IAsyncOperationWithProgress[
        typings.winrt.Windows.Networking.BackgroundTransfer.UploadOperation, 
        typings.winrt.Windows.Networking.BackgroundTransfer.UploadOperation
      ] = js.native
    /* CompleteClass */
    override def getResponseInformation(): typings.winrt.Windows.Networking.BackgroundTransfer.ResponseInformation = js.native
    /* CompleteClass */
    override def getResultStreamAt(position: Double): IInputStream = js.native
    /* CompleteClass */
    override def startAsync(): IAsyncOperationWithProgress[
        typings.winrt.Windows.Networking.BackgroundTransfer.UploadOperation, 
        typings.winrt.Windows.Networking.BackgroundTransfer.UploadOperation
      ] = js.native
  }
  
  /* static members */
  @js.native
  object BackgroundDownloader extends js.Object {
    def getCurrentDownloadsAsync(): IAsyncOperation[
        IVectorView[typings.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation]
      ] = js.native
    def getCurrentDownloadsAsync(group: String): IAsyncOperation[
        IVectorView[typings.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation]
      ] = js.native
  }
  
  @js.native
  object BackgroundTransferCostPolicy extends js.Object {
    /* 2 */ val always: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.always with Double = js.native
    /* 0 */ val default: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.default with Double = js.native
    /* 1 */ val unrestrictedOnly: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.unrestrictedOnly with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object BackgroundTransferError extends js.Object {
    def getStatus(hresult: Double): WebErrorStatus = js.native
  }
  
  @js.native
  object BackgroundTransferStatus extends js.Object {
    /* 6 */ val canceled: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.canceled with Double = js.native
    /* 5 */ val completed: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.completed with Double = js.native
    /* 7 */ val error: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.error with Double = js.native
    /* 0 */ val idle: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.idle with Double = js.native
    /* 2 */ val pausedByApplication: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedByApplication with Double = js.native
    /* 3 */ val pausedCostedNetwork: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedCostedNetwork with Double = js.native
    /* 4 */ val pausedNoNetwork: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedNoNetwork with Double = js.native
    /* 1 */ val running: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.running with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object BackgroundUploader extends js.Object {
    def getCurrentUploadsAsync(): IAsyncOperation[IVectorView[typings.winrt.Windows.Networking.BackgroundTransfer.UploadOperation]] = js.native
    def getCurrentUploadsAsync(group: String): IAsyncOperation[IVectorView[typings.winrt.Windows.Networking.BackgroundTransfer.UploadOperation]] = js.native
  }
  
}

