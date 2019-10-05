package typings.winrt.Windows.Media.Playlists

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.IStorageFolder
import typings.winrt.Windows.Storage.NameCollisionOption
import typings.winrt.Windows.Storage.StorageFile
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

