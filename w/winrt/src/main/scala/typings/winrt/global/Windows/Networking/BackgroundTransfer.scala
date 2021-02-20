package typings.winrt.global.Windows.Networking

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Web.WebErrorStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BackgroundTransfer {
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader")
  @js.native
  class BackgroundDownloader ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundDownloader
  /* static members */
  object BackgroundDownloader {
    
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader.getCurrentDownloadsAsync")
    @js.native
    def getCurrentDownloadsAsync(): IAsyncOperation[
        IVectorView[typings.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation]
      ] = js.native
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader.getCurrentDownloadsAsync")
    @js.native
    def getCurrentDownloadsAsync(group: String): IAsyncOperation[
        IVectorView[typings.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation]
      ] = js.native
  }
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart")
  @js.native
  class BackgroundTransferContentPart ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart {
    def this(name: String) = this()
    def this(name: String, fileName: String) = this()
  }
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy")
  @js.native
  object BackgroundTransferCostPolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy with Double
      ] = js.native
    
    /* 0 */ val default: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.default with Double = js.native
    
    /* 2 */ val always: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.always with Double = js.native
    
    /* 1 */ val unrestrictedOnly: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.unrestrictedOnly with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferError")
  @js.native
  class BackgroundTransferError ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferError
  /* static members */
  object BackgroundTransferError {
    
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferError.getStatus")
    @js.native
    def getStatus(hresult: Double): WebErrorStatus = js.native
  }
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferStatus")
  @js.native
  object BackgroundTransferStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus with Double
      ] = js.native
    
    /* 6 */ val canceled: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.canceled with Double = js.native
    
    /* 5 */ val completed: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.completed with Double = js.native
    
    /* 7 */ val error: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.error with Double = js.native
    
    /* 0 */ val idle: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.idle with Double = js.native
    
    /* 2 */ val pausedByApplication: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedByApplication with Double = js.native
    
    /* 3 */ val pausedCostedNetwork: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedCostedNetwork with Double = js.native
    
    /* 4 */ val pausedNoNetwork: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedNoNetwork with Double = js.native
    
    /* 1 */ val running: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.running with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader")
  @js.native
  class BackgroundUploader ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundUploader
  /* static members */
  object BackgroundUploader {
    
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader.getCurrentUploadsAsync")
    @js.native
    def getCurrentUploadsAsync(): IAsyncOperation[IVectorView[typings.winrt.Windows.Networking.BackgroundTransfer.UploadOperation]] = js.native
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader.getCurrentUploadsAsync")
    @js.native
    def getCurrentUploadsAsync(group: String): IAsyncOperation[IVectorView[typings.winrt.Windows.Networking.BackgroundTransfer.UploadOperation]] = js.native
  }
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.DownloadOperation")
  @js.native
  class DownloadOperation ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.ResponseInformation")
  @js.native
  class ResponseInformation ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.ResponseInformation
  
  @JSGlobal("Windows.Networking.BackgroundTransfer.UploadOperation")
  @js.native
  class UploadOperation ()
    extends typings.winrt.Windows.Networking.BackgroundTransfer.UploadOperation
}
