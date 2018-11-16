package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.DownloadsFolder")
@js.native
class DownloadsFolder () extends js.Object

@JSGlobal("Windows.Storage.DownloadsFolder")
@js.native
object DownloadsFolder extends js.Object {
  def createFileAsync(desiredName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
  def createFileAsync(desiredName: java.lang.String, option: winrtLib.WindowsNs.StorageNs.CreationCollisionOption): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
  def createFolderAsync(desiredName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFolder] = js.native
  def createFolderAsync(desiredName: java.lang.String, option: winrtLib.WindowsNs.StorageNs.CreationCollisionOption): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFolder] = js.native
}

