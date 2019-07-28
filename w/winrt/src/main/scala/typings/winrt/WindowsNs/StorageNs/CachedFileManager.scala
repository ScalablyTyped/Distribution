package typings.winrt.WindowsNs.StorageNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
class CachedFileManager () extends js.Object

/* static members */
@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
object CachedFileManager extends js.Object {
  def completeUpdatesAsync(file: IStorageFile): IAsyncOperation[FileUpdateStatus] = js.native
  def deferUpdates(file: IStorageFile): Unit = js.native
}

