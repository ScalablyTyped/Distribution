package typings
package winrtLib.WindowsNs.MediaNs.PlaylistsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlaylistStatics extends js.Object {
  def loadAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[Playlist]
}

object IPlaylistStatics {
  @scala.inline
  def apply(
    loadAsync: js.Function1[
      winrtLib.WindowsNs.StorageNs.IStorageFile, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[Playlist]
    ]
  ): IPlaylistStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadAsync")(loadAsync)
    __obj.asInstanceOf[IPlaylistStatics]
  }
}

