package typings.winrtDashUwp.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KnownFolderId extends js.Object

/** Provides values that identify storage folders. */
@JSGlobal("Windows.Storage.KnownFolderId")
@js.native
object KnownFolderId extends js.Object {
  /** App Captures folder. */
  @js.native
  sealed trait appCaptures extends KnownFolderId
  
  /** Camera Roll folder. */
  @js.native
  sealed trait cameraRoll extends KnownFolderId
  
  /** Documents library folder. */
  @js.native
  sealed trait documentsLibrary extends KnownFolderId
  
  /** HomeGroup folder. */
  @js.native
  sealed trait homeGroup extends KnownFolderId
  
  /** The folder of media server (DLNA) devices. */
  @js.native
  sealed trait mediaServerDevices extends KnownFolderId
  
  /** Music library folder. */
  @js.native
  sealed trait musicLibrary extends KnownFolderId
  
  /** Objects 3D folder. */
  @js.native
  sealed trait objects3D extends KnownFolderId
  
  /** Pictures library folder. */
  @js.native
  sealed trait picturesLibrary extends KnownFolderId
  
  /** Playlists folder. */
  @js.native
  sealed trait playlists extends KnownFolderId
  
  /** Recorded calls folder. */
  @js.native
  sealed trait recordedCalls extends KnownFolderId
  
  /** Removable devices folder. */
  @js.native
  sealed trait removableDevices extends KnownFolderId
  
  /** Saved pictures folder. */
  @js.native
  sealed trait savedPictures extends KnownFolderId
  
  /** Screenshots folder. */
  @js.native
  sealed trait screenshots extends KnownFolderId
  
  /** Videos library folder. */
  @js.native
  sealed trait videosLibrary extends KnownFolderId
  
  /* 0 */ val appCaptures: typings.winrtDashUwp.WindowsNs.StorageNs.KnownFolderId.appCaptures with Double = js.native
  /* 1 */ val cameraRoll: typings.winrtDashUwp.WindowsNs.StorageNs.KnownFolderId.cameraRoll with Double = js.native
  /* 2 */ val documentsLibrary: typings.winrtDashUwp.WindowsNs.StorageNs.KnownFolderId.documentsLibrary with Double = js.native
  /* 3 */ val homeGroup: typings.winrtDashUwp.WindowsNs.StorageNs.KnownFolderId.homeGroup with Double = js.native
  /* 4 */ val mediaServerDevices: typings.winrtDashUwp.WindowsNs.StorageNs.KnownFolderId.mediaServerDevices with Double = js.native
  /* 5 */ val musicLibrary: typings.winrtDashUwp.WindowsNs.StorageNs.KnownFolderId.musicLibrary with Double = js.native
  /* 6 */ val objects3D: typings.winrtDashUwp.WindowsNs.StorageNs.KnownFolderId.objects3D with Double = js.native
  /* 7 */ val picturesLibrary: typings.winrtDashUwp.WindowsNs.StorageNs.KnownFolderId.picturesLibrary with Double = js.native
  /* 8 */ val playlists: typings.winrtDashUwp.WindowsNs.StorageNs.KnownFolderId.playlists with Double = js.native
  /* 9 */ val recordedCalls: typings.winrtDashUwp.WindowsNs.StorageNs.KnownFolderId.recordedCalls with Double = js.native
  /* 10 */ val removableDevices: typings.winrtDashUwp.WindowsNs.StorageNs.KnownFolderId.removableDevices with Double = js.native
  /* 11 */ val savedPictures: typings.winrtDashUwp.WindowsNs.StorageNs.KnownFolderId.savedPictures with Double = js.native
  /* 12 */ val screenshots: typings.winrtDashUwp.WindowsNs.StorageNs.KnownFolderId.screenshots with Double = js.native
  /* 13 */ val videosLibrary: typings.winrtDashUwp.WindowsNs.StorageNs.KnownFolderId.videosLibrary with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KnownFolderId with Double] = js.native
}

