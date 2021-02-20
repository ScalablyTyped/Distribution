package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for creating and saving media playlists for playback. */
object Playlists {
  
  /** Provides access to a media playlist. */
  @JSGlobal("Windows.Media.Playlists.Playlist")
  @js.native
  /** Creates a new instance of a Playlist object. */
  class Playlist ()
    extends typings.winrtUwp.Windows.Media.Playlists.Playlist
  object Playlist {
    
    /**
      * Asynchronously loads files into a playlist.
      * @param file Represents the files to load.
      * @return Represents the asynchronous operation for loading the playlist. The GetResults method of this IAsyncOperation object returns the playlist.
      */
    /* static member */
    @JSGlobal("Windows.Media.Playlists.Playlist.loadAsync")
    @js.native
    def loadAsync(file: IStorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Playlists.Playlist] = js.native
  }
  
  /** Indicates the format of a playlist file. */
  @JSGlobal("Windows.Media.Playlists.PlaylistFormat")
  @js.native
  object PlaylistFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Playlists.PlaylistFormat with Double] = js.native
    
    /* 2 */ val m3u: typings.winrtUwp.Windows.Media.Playlists.PlaylistFormat.m3u with Double = js.native
    
    /* 0 */ val windowsMedia: typings.winrtUwp.Windows.Media.Playlists.PlaylistFormat.windowsMedia with Double = js.native
    
    /* 1 */ val zune: typings.winrtUwp.Windows.Media.Playlists.PlaylistFormat.zune with Double = js.native
  }
}
