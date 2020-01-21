package typings.winrtUwp.Windows.Storage

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.System.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to common locations that contain user content. This includes content from a user's local libraries (such as Documents, Pictures, Music, and Videos), HomeGroup, removable devices, and media server devices. */
@JSGlobal("Windows.Storage.KnownFolders")
@js.native
abstract class KnownFolders () extends js.Object

/* static members */
@JSGlobal("Windows.Storage.KnownFolders")
@js.native
object KnownFolders extends js.Object {
  /** Gets the App Captures folder. */
  var appCaptures: StorageFolder = js.native
  /** Gets the Camera Roll folder. */
  var cameraRoll: StorageFolder = js.native
  /** Gets the Documents library. The Documents library is not intended for general use. */
  var documentsLibrary: StorageFolder = js.native
  /** Gets the HomeGroup folder. */
  var homeGroup: StorageFolder = js.native
  /** Gets the folder of media server (DLNA) devices. */
  var mediaServerDevices: StorageFolder = js.native
  /** Gets the Music library. */
  var musicLibrary: StorageFolder = js.native
  /** Gets the Objects 3D folder. */
  var objects3D: StorageFolder = js.native
  /** Gets the Pictures library. */
  var picturesLibrary: StorageFolder = js.native
  /** Gets the play lists folder. */
  var playlists: StorageFolder = js.native
  /** Gets the recorded calls folder. */
  var recordedCalls: StorageFolder = js.native
  /** Gets the removable devices folder. */
  var removableDevices: StorageFolder = js.native
  /** Gets the Saved Pictures folder. */
  var savedPictures: StorageFolder = js.native
  /** Gets the Videos library. */
  var videosLibrary: StorageFolder = js.native
  /**
    * Static method that returns a specified known folder for a User .
    * @param user The User for which the folder is returned.
    * @param folderId The ID of the folder to be returned.
    * @return When this method completes, it returns the requested StorageFolder object.
    */
  def getFolderForUserAsync(user: User, folderId: KnownFolderId): IPromiseWithIAsyncOperation[StorageFolder] = js.native
}

