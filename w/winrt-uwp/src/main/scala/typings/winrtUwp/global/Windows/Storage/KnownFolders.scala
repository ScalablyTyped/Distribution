package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.System.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to common locations that contain user content. This includes content from a user's local libraries (such as Documents, Pictures, Music, and Videos), HomeGroup, removable devices, and media server devices. */
@JSGlobal("Windows.Storage.KnownFolders")
@js.native
abstract class KnownFolders ()
  extends StObject
     with typings.winrtUwp.Windows.Storage.KnownFolders
object KnownFolders {
  
  @JSGlobal("Windows.Storage.KnownFolders")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets the App Captures folder. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.appCaptures")
  @js.native
  def appCaptures: typings.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def appCaptures_=(x: typings.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appCaptures")(x.asInstanceOf[js.Any])
  
  /** Gets the Camera Roll folder. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.cameraRoll")
  @js.native
  def cameraRoll: typings.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def cameraRoll_=(x: typings.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cameraRoll")(x.asInstanceOf[js.Any])
  
  /** Gets the Documents library. The Documents library is not intended for general use. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.documentsLibrary")
  @js.native
  def documentsLibrary: typings.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def documentsLibrary_=(x: typings.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("documentsLibrary")(x.asInstanceOf[js.Any])
  
  /**
    * Static method that returns a specified known folder for a User .
    * @param user The User for which the folder is returned.
    * @param folderId The ID of the folder to be returned.
    * @return When this method completes, it returns the requested StorageFolder object.
    */
  /* static member */
  @scala.inline
  def getFolderForUserAsync(user: User, folderId: typings.winrtUwp.Windows.Storage.KnownFolderId): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFolder] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFolderForUserAsync")(user.asInstanceOf[js.Any], folderId.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFolder]]
  
  /** Gets the HomeGroup folder. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.homeGroup")
  @js.native
  def homeGroup: typings.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def homeGroup_=(x: typings.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("homeGroup")(x.asInstanceOf[js.Any])
  
  /** Gets the folder of media server (DLNA) devices. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.mediaServerDevices")
  @js.native
  def mediaServerDevices: typings.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def mediaServerDevices_=(x: typings.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mediaServerDevices")(x.asInstanceOf[js.Any])
  
  /** Gets the Music library. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.musicLibrary")
  @js.native
  def musicLibrary: typings.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def musicLibrary_=(x: typings.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("musicLibrary")(x.asInstanceOf[js.Any])
  
  /** Gets the Objects 3D folder. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.objects3D")
  @js.native
  def objects3D: typings.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def objects3D_=(x: typings.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("objects3D")(x.asInstanceOf[js.Any])
  
  /** Gets the Pictures library. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.picturesLibrary")
  @js.native
  def picturesLibrary: typings.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def picturesLibrary_=(x: typings.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("picturesLibrary")(x.asInstanceOf[js.Any])
  
  /** Gets the play lists folder. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.playlists")
  @js.native
  def playlists: typings.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def playlists_=(x: typings.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("playlists")(x.asInstanceOf[js.Any])
  
  /** Gets the recorded calls folder. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.recordedCalls")
  @js.native
  def recordedCalls: typings.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def recordedCalls_=(x: typings.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recordedCalls")(x.asInstanceOf[js.Any])
  
  /** Gets the removable devices folder. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.removableDevices")
  @js.native
  def removableDevices: typings.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def removableDevices_=(x: typings.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removableDevices")(x.asInstanceOf[js.Any])
  
  /** Gets the Saved Pictures folder. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.savedPictures")
  @js.native
  def savedPictures: typings.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def savedPictures_=(x: typings.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("savedPictures")(x.asInstanceOf[js.Any])
  
  /** Gets the Videos library. */
  /* static member */
  @JSGlobal("Windows.Storage.KnownFolders.videosLibrary")
  @js.native
  def videosLibrary: typings.winrtUwp.Windows.Storage.StorageFolder = js.native
  @scala.inline
  def videosLibrary_=(x: typings.winrtUwp.Windows.Storage.StorageFolder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("videosLibrary")(x.asInstanceOf[js.Any])
}
