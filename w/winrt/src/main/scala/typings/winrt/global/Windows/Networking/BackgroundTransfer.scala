package typings.winrt.global.Windows.Networking

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Web.WebErrorStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.BackgroundTransfer")
@js.native
object BackgroundTransfer extends js.Object {
  @js.native
  class BackgroundDownloader ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundDownloader
  
  @js.native
  class BackgroundTransferContentPart ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart {
    def this(name: String) = this()
    def this(name: String, fileName: String) = this()
  }
  
  @js.native
  class BackgroundTransferError ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferError
  
  @js.native
  class BackgroundUploader ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundUploader
  
  @js.native
  class DownloadOperation ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation
  
  @js.native
  class ResponseInformation ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.ResponseInformation
  
  @js.native
  class UploadOperation ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.UploadOperation
  
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

