package typings.winrt.global.Windows.Media

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Playlists {
  
  @JSGlobal("Windows.Media.Playlists.Playlist")
  @js.native
  class Playlist ()
    extends typings.winrt.Windows.Media.Playlists.Playlist
  /* static members */
  object Playlist {
    
    @JSGlobal("Windows.Media.Playlists.Playlist.loadAsync")
    @js.native
    def loadAsync(file: IStorageFile): IAsyncOperation[typings.winrt.Windows.Media.Playlists.Playlist] = js.native
  }
  
  @JSGlobal("Windows.Media.Playlists.PlaylistFormat")
  @js.native
  object PlaylistFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Playlists.PlaylistFormat with Double] = js.native
    
    /* 2 */ val m3u: typings.winrt.Windows.Media.Playlists.PlaylistFormat.m3u with Double = js.native
    
    /* 0 */ val windowsMedia: typings.winrt.Windows.Media.Playlists.PlaylistFormat.windowsMedia with Double = js.native
    
    /* 1 */ val zune: typings.winrt.Windows.Media.Playlists.PlaylistFormat.zune with Double = js.native
  }
}
