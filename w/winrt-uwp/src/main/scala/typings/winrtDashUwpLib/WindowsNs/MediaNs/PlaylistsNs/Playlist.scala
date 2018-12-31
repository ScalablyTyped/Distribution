package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaylistsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to a media playlist. */
@JSGlobal("Windows.Media.Playlists.Playlist")
@js.native
/** Creates a new instance of a Playlist object. */
class Playlist () extends js.Object {
  /** The set of media files that make up the playlist. */
  var files: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Asynchronously saves the playlist to a specified file and folder.
    * @param saveLocation The folder in which to save the playlist.
    * @param desiredName The name of the playlist to save.
    * @param option The action to take if the playlist is saved to an existing file. One of the values of the NameCollisionOption enumeration.
    * @return Represents the asynchronous operation to save the playlist to a specified file and folder.
    */
  def saveAsAsync(
    saveLocation: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFolder,
    desiredName: java.lang.String,
    option: winrtDashUwpLib.WindowsNs.StorageNs.NameCollisionOption
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Asynchronously saves the playlist to a specified file and folder, in a specified format.
    * @param saveLocation The folder in which to save the playlist.
    * @param desiredName The name of the playlist to save.
    * @param option The action to take if the playlist is saved to an existing file. One of the values of the NameCollisionOption enumeration.
    * @param playlistFormat The playlist format. One of the values of the PlaylistFormat enumeration.
    * @return Represents the asynchronous operation to save the playlist to a specified file and folder.
    */
  def saveAsAsync(
    saveLocation: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFolder,
    desiredName: java.lang.String,
    option: winrtDashUwpLib.WindowsNs.StorageNs.NameCollisionOption,
    playlistFormat: PlaylistFormat
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Asynchronously saves the playlist.
    * @return Represents the asynchronous action to save the playlist.
    */
  def saveAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

/** Provides access to a media playlist. */
@JSGlobal("Windows.Media.Playlists.Playlist")
@js.native
object Playlist extends js.Object {
  /**
    * Asynchronously loads files into a playlist.
    * @param file Represents the files to load.
    * @return Represents the asynchronous operation for loading the playlist. The GetResults method of this IAsyncOperation object returns the playlist.
    */
  def loadAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.PlaylistsNs.Playlist] = js.native
}

