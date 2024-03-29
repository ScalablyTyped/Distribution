package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadOperation
  extends StObject
     with IDownloadOperation
object DownloadOperation {
  
  inline def apply(
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
  ): DownloadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = js.Any.fromFunction0(attachAsync), costPolicy = costPolicy.asInstanceOf[js.Any], getResponseInformation = js.Any.fromFunction0(getResponseInformation), getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), progress = progress.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], resultFile = resultFile.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), startAsync = js.Any.fromFunction0(startAsync))
    __obj.asInstanceOf[DownloadOperation]
  }
}
