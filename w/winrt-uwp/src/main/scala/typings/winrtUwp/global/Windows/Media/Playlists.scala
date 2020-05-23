package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides classes for creating and saving media playlists for playback. */
@JSGlobal("Windows.Media.Playlists")
@js.native
object Playlists extends js.Object {
  /** Provides access to a media playlist. */
  @js.native
  /** Creates a new instance of a Playlist object. */
  class Playlist ()
    extends typings.winrtUwp.Windows.Media.Playlists.Playlist
  
  /* static members */
  @js.native
  object Playlist extends js.Object {
    /**
      * Asynchronously loads files into a playlist.
      * @param file Represents the files to load.
      * @return Represents the asynchronous operation for loading the playlist. The GetResults method of this IAsyncOperation object returns the playlist.
      */
    def loadAsync(file: IStorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Playlists.Playlist] = js.native
  }
  
  /** Indicates the format of a playlist file. */
  @js.native
  object PlaylistFormat extends js.Object {
    /* 2 */ val m3u: typings.winrtUwp.Windows.Media.Playlists.PlaylistFormat.m3u with Double = js.native
    /* 0 */ val windowsMedia: typings.winrtUwp.Windows.Media.Playlists.PlaylistFormat.windowsMedia with Double = js.native
    /* 1 */ val zune: typings.winrtUwp.Windows.Media.Playlists.PlaylistFormat.zune with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Playlists.PlaylistFormat with Double] = js.native
  }
  
}

