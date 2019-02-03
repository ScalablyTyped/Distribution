package typings
package winrtDashUwpLib.WindowsNs.StorageNs

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
  var appCaptures: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /** Gets the Camera Roll folder. */
  var cameraRoll: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /** Gets the Documents library. The Documents library is not intended for general use. */
  var documentsLibrary: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /** Gets the HomeGroup folder. */
  var homeGroup: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /** Gets the folder of media server (DLNA) devices. */
  var mediaServerDevices: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /** Gets the Music library. */
  var musicLibrary: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /** Gets the Objects 3D folder. */
  var objects3D: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /** Gets the Pictures library. */
  var picturesLibrary: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /** Gets the play lists folder. */
  var playlists: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /** Gets the recorded calls folder. */
  var recordedCalls: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /** Gets the removable devices folder. */
  var removableDevices: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /** Gets the Saved Pictures folder. */
  var savedPictures: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /** Gets the Videos library. */
  var videosLibrary: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /**
    * Static method that returns a specified known folder for a User .
    * @param user The User for which the folder is returned.
    * @param folderId The ID of the folder to be returned.
    * @return When this method completes, it returns the requested StorageFolder object.
    */
  def getFolderForUserAsync(
    user: winrtDashUwpLib.WindowsNs.SystemNs.User,
    folderId: winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder] = js.native
}

