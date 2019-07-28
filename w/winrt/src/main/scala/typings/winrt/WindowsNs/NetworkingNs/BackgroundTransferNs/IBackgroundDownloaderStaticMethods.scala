package typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundDownloaderStaticMethods extends js.Object {
  def getCurrentDownloadsAsync(): IAsyncOperation[IVectorView[DownloadOperation]] = js.native
  def getCurrentDownloadsAsync(group: String): IAsyncOperation[IVectorView[DownloadOperation]] = js.native
}

