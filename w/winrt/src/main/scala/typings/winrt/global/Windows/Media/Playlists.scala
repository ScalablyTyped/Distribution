package typings.winrt.global.Windows.Media

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Playlists")
@js.native
object Playlists extends js.Object {
  @js.native
  class Playlist ()
    extends typings.winrt.Windows.Media.Playlists.Playlist
  
  /* static members */
  @js.native
  object Playlist extends js.Object {
    def loadAsync(file: IStorageFile): IAsyncOperation[typings.winrt.Windows.Media.Playlists.Playlist] = js.native
  }
  
  @js.native
  object PlaylistFormat extends js.Object {
    /* 2 */ val m3u: typings.winrt.Windows.Media.Playlists.PlaylistFormat.m3u with Double = js.native
    /* 0 */ val windowsMedia: typings.winrt.Windows.Media.Playlists.PlaylistFormat.windowsMedia with Double = js.native
    /* 1 */ val zune: typings.winrt.Windows.Media.Playlists.PlaylistFormat.zune with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Playlists.PlaylistFormat with Double] = js.native
  }
  
}

