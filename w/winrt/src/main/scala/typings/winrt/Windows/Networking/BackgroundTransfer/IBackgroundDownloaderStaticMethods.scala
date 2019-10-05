package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundDownloaderStaticMethods extends js.Object {
  def getCurrentDownloadsAsync(): IAsyncOperation[IVectorView[DownloadOperation]] = js.native
  def getCurrentDownloadsAsync(group: String): IAsyncOperation[IVectorView[DownloadOperation]] = js.native
}

