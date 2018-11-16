package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
class CachedFileManager () extends js.Object

@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
object CachedFileManager extends js.Object {
  def completeUpdatesAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus] = js.native
  def deferUpdates(file: winrtLib.WindowsNs.StorageNs.IStorageFile): scala.Unit = js.native
}

