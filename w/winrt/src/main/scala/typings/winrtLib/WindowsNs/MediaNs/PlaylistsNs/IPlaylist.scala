package typings
package winrtLib.WindowsNs.MediaNs.PlaylistsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlaylist extends js.Object {
  var files: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
  def saveAsAsync(
    saveLocation: winrtLib.WindowsNs.StorageNs.IStorageFolder,
    desiredName: java.lang.String,
    option: winrtLib.WindowsNs.StorageNs.NameCollisionOption
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
  def saveAsAsync(
    saveLocation: winrtLib.WindowsNs.StorageNs.IStorageFolder,
    desiredName: java.lang.String,
    option: winrtLib.WindowsNs.StorageNs.NameCollisionOption,
    playlistFormat: PlaylistFormat
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
  def saveAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

