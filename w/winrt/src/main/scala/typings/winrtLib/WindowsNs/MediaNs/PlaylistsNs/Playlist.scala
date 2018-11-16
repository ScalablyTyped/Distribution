package typings
package winrtLib.WindowsNs.MediaNs.PlaylistsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Playlists.Playlist")
@js.native
class Playlist () extends IPlaylist

@JSGlobal("Windows.Media.Playlists.Playlist")
@js.native
object Playlist extends js.Object {
  def loadAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.MediaNs.PlaylistsNs.Playlist] = js.native
}

