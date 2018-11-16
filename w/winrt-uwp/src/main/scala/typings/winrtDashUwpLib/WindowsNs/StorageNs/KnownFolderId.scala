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
  
  val appCaptures: appCaptures with java.lang.String = js.native
  val cameraRoll: cameraRoll with java.lang.String = js.native
  val documentsLibrary: documentsLibrary with java.lang.String = js.native
  val homeGroup: homeGroup with java.lang.String = js.native
  val mediaServerDevices: mediaServerDevices with java.lang.String = js.native
  val musicLibrary: musicLibrary with java.lang.String = js.native
  val objects3D: objects3D with java.lang.String = js.native
  val picturesLibrary: picturesLibrary with java.lang.String = js.native
  val playlists: playlists with java.lang.String = js.native
  val recordedCalls: recordedCalls with java.lang.String = js.native
  val removableDevices: removableDevices with java.lang.String = js.native
  val savedPictures: savedPictures with java.lang.String = js.native
  val screenshots: screenshots with java.lang.String = js.native
  val videosLibrary: videosLibrary with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.KnownFolderId with java.lang.String] = js.native
}

