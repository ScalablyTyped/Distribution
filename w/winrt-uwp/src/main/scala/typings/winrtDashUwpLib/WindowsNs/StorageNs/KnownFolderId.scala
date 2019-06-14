package typings
package winrtDashUwpLib.WindowsNs.StorageNs

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
  sealed trait appCaptures
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId
  
  /** Camera Roll folder. */
  @js.native
  sealed trait cameraRoll
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId
  
  /** Documents library folder. */
  @js.native
  sealed trait documentsLibrary
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId
  
  /** HomeGroup folder. */
  @js.native
  sealed trait homeGroup
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId
  
  /** The folder of media server (DLNA) devices. */
  @js.native
  sealed trait mediaServerDevices
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId
  
  /** Music library folder. */
  @js.native
  sealed trait musicLibrary
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId
  
  /** Objects 3D folder. */
  @js.native
  sealed trait objects3D
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId
  
  /** Pictures library folder. */
  @js.native
  sealed trait picturesLibrary
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId
  
  /** Playlists folder. */
  @js.native
  sealed trait playlists
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId
  
  /** Recorded calls folder. */
  @js.native
  sealed trait recordedCalls
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId
  
  /** Removable devices folder. */
  @js.native
  sealed trait removableDevices
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId
  
  /** Saved pictures folder. */
  @js.native
  sealed trait savedPictures
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId
  
  /** Screenshots folder. */
  @js.native
  sealed trait screenshots
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId
  
  /** Videos library folder. */
  @js.native
  sealed trait videosLibrary
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId
  
  /* 0 */ val appCaptures: appCaptures with scala.Double = js.native
  /* 1 */ val cameraRoll: cameraRoll with scala.Double = js.native
  /* 2 */ val documentsLibrary: documentsLibrary with scala.Double = js.native
  /* 3 */ val homeGroup: homeGroup with scala.Double = js.native
  /* 4 */ val mediaServerDevices: mediaServerDevices with scala.Double = js.native
  /* 5 */ val musicLibrary: musicLibrary with scala.Double = js.native
  /* 6 */ val objects3D: objects3D with scala.Double = js.native
  /* 7 */ val picturesLibrary: picturesLibrary with scala.Double = js.native
  /* 8 */ val playlists: playlists with scala.Double = js.native
  /* 9 */ val recordedCalls: recordedCalls with scala.Double = js.native
  /* 10 */ val removableDevices: removableDevices with scala.Double = js.native
  /* 11 */ val savedPictures: savedPictures with scala.Double = js.native
  /* 12 */ val screenshots: screenshots with scala.Double = js.native
  /* 13 */ val videosLibrary: videosLibrary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId with scala.Double] = js.native
}

