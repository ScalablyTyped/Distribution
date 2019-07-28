package typings.winrt.WindowsNs.MediaNs.PlaylistsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.IStorageFolder
import typings.winrt.WindowsNs.StorageNs.NameCollisionOption
import typings.winrt.WindowsNs.StorageNs.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlaylist extends js.Object {
  var files: IVector[StorageFile] = js.native
  def saveAsAsync(saveLocation: IStorageFolder, desiredName: String, option: NameCollisionOption): IAsyncOperation[StorageFile] = js.native
  def saveAsAsync(
    saveLocation: IStorageFolder,
    desiredName: String,
    option: NameCollisionOption,
    playlistFormat: PlaylistFormat
  ): IAsyncOperation[StorageFile] = js.native
  def saveAsync(): IAsyncAction = js.native
}

