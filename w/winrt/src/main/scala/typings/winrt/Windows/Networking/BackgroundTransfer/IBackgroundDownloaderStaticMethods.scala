package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackgroundDownloaderStaticMethods extends StObject {
  
  def getCurrentDownloadsAsync(): IAsyncOperation[IVectorView[DownloadOperation]] = js.native
  def getCurrentDownloadsAsync(group: String): IAsyncOperation[IVectorView[DownloadOperation]] = js.native
}
