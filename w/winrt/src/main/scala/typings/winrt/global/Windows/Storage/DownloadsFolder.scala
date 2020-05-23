package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.DownloadsFolder")
@js.native
class DownloadsFolder ()
  extends typings.winrt.Windows.Storage.DownloadsFolder

/* static members */
@JSGlobal("Windows.Storage.DownloadsFolder")
@js.native
object DownloadsFolder extends js.Object {
  def createFileAsync(desiredName: String): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
  def createFileAsync(desiredName: String, option: typings.winrt.Windows.Storage.CreationCollisionOption): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
  def createFolderAsync(desiredName: String): IAsyncOperation[typings.winrt.Windows.Storage.StorageFolder] = js.native
  def createFolderAsync(desiredName: String, option: typings.winrt.Windows.Storage.CreationCollisionOption): IAsyncOperation[typings.winrt.Windows.Storage.StorageFolder] = js.native
}

