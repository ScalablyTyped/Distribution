package typings.winrt.WindowsNs.MediaNs.PlaylistsNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlaylistStatics extends js.Object {
  def loadAsync(file: IStorageFile): IAsyncOperation[Playlist]
}

object IPlaylistStatics {
  @scala.inline
  def apply(loadAsync: IStorageFile => IAsyncOperation[Playlist]): IPlaylistStatics = {
    val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction1(loadAsync))
  
    __obj.asInstanceOf[IPlaylistStatics]
  }
}

