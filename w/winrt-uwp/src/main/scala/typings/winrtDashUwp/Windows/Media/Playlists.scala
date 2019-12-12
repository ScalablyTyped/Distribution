package typings.winrtDashUwp.Windows.Media

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Media.Playlists.Playlist
import typings.winrtDashUwp.Windows.Media.Playlists.PlaylistFormat
import typings.winrtDashUwp.Windows.Media.Playlists.PlaylistFormat.m3u
import typings.winrtDashUwp.Windows.Media.Playlists.PlaylistFormat.windowsMedia
import typings.winrtDashUwp.Windows.Media.Playlists.PlaylistFormat.zune
import typings.winrtDashUwp.Windows.Storage.IStorageFile
import typings.winrtDashUwp.Windows.Storage.IStorageFolder
import typings.winrtDashUwp.Windows.Storage.NameCollisionOption
import typings.winrtDashUwp.Windows.Storage.StorageFile
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
  class Playlist () extends js.Object {
    /** The set of media files that make up the playlist. */
    var files: IVector[StorageFile] = js.native
    /**
      * Asynchronously saves the playlist to a specified file and folder.
      * @param saveLocation The folder in which to save the playlist.
      * @param desiredName The name of the playlist to save.
      * @param option The action to take if the playlist is saved to an existing file. One of the values of the NameCollisionOption enumeration.
      * @return Represents the asynchronous operation to save the playlist to a specified file and folder.
      */
    def saveAsAsync(saveLocation: IStorageFolder, desiredName: String, option: NameCollisionOption): IPromiseWithIAsyncOperation[StorageFile] = js.native
    /**
      * Asynchronously saves the playlist to a specified file and folder, in a specified format.
      * @param saveLocation The folder in which to save the playlist.
      * @param desiredName The name of the playlist to save.
      * @param option The action to take if the playlist is saved to an existing file. One of the values of the NameCollisionOption enumeration.
      * @param playlistFormat The playlist format. One of the values of the PlaylistFormat enumeration.
      * @return Represents the asynchronous operation to save the playlist to a specified file and folder.
      */
    def saveAsAsync(
      saveLocation: IStorageFolder,
      desiredName: String,
      option: NameCollisionOption,
      playlistFormat: PlaylistFormat
    ): IPromiseWithIAsyncOperation[StorageFile] = js.native
    /**
      * Asynchronously saves the playlist.
      * @return Represents the asynchronous action to save the playlist.
      */
    def saveAsync(): IPromiseWithIAsyncAction = js.native
  }
  
  @js.native
  sealed trait PlaylistFormat extends js.Object
  
  /* static members */
  @js.native
  object Playlist extends js.Object {
    /**
      * Asynchronously loads files into a playlist.
      * @param file Represents the files to load.
      * @return Represents the asynchronous operation for loading the playlist. The GetResults method of this IAsyncOperation object returns the playlist.
      */
    def loadAsync(file: IStorageFile): IPromiseWithIAsyncOperation[Playlist] = js.native
  }
  
  /** Indicates the format of a playlist file. */
  @js.native
  object PlaylistFormat extends js.Object {
    /** M3U playlist. */
    @js.native
    sealed trait m3u extends PlaylistFormat
    
    /** Windows Media playlist. */
    @js.native
    sealed trait windowsMedia extends PlaylistFormat
    
    /** Zune playlist. */
    @js.native
    sealed trait zune extends PlaylistFormat
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PlaylistFormat with Double] = js.native
    /* 2 */ @js.native
    object m3u extends TopLevel[m3u with Double]
    
    /* 0 */ @js.native
    object windowsMedia extends TopLevel[windowsMedia with Double]
    
    /* 1 */ @js.native
    object zune extends TopLevel[zune with Double]
    
  }
  
}

