package typings.winrtDashUwp.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Storage.KnownFolderId.appCaptures
import typings.winrtDashUwp.Windows.Storage.KnownFolderId.cameraRoll
import typings.winrtDashUwp.Windows.Storage.KnownFolderId.documentsLibrary
import typings.winrtDashUwp.Windows.Storage.KnownFolderId.homeGroup
import typings.winrtDashUwp.Windows.Storage.KnownFolderId.mediaServerDevices
import typings.winrtDashUwp.Windows.Storage.KnownFolderId.musicLibrary
import typings.winrtDashUwp.Windows.Storage.KnownFolderId.objects3D
import typings.winrtDashUwp.Windows.Storage.KnownFolderId.picturesLibrary
import typings.winrtDashUwp.Windows.Storage.KnownFolderId.playlists
import typings.winrtDashUwp.Windows.Storage.KnownFolderId.recordedCalls
import typings.winrtDashUwp.Windows.Storage.KnownFolderId.removableDevices
import typings.winrtDashUwp.Windows.Storage.KnownFolderId.savedPictures
import typings.winrtDashUwp.Windows.Storage.KnownFolderId.screenshots
import typings.winrtDashUwp.Windows.Storage.KnownFolderId.videosLibrary
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KnownFolderId with Double] = js.native
  /* 0 */ @js.native
  object appCaptures extends TopLevel[appCaptures with Double]
  
  /* 1 */ @js.native
  object cameraRoll extends TopLevel[cameraRoll with Double]
  
  /* 2 */ @js.native
  object documentsLibrary extends TopLevel[documentsLibrary with Double]
  
  /* 3 */ @js.native
  object homeGroup extends TopLevel[homeGroup with Double]
  
  /* 4 */ @js.native
  object mediaServerDevices extends TopLevel[mediaServerDevices with Double]
  
  /* 5 */ @js.native
  object musicLibrary extends TopLevel[musicLibrary with Double]
  
  /* 6 */ @js.native
  object objects3D extends TopLevel[objects3D with Double]
  
  /* 7 */ @js.native
  object picturesLibrary extends TopLevel[picturesLibrary with Double]
  
  /* 8 */ @js.native
  object playlists extends TopLevel[playlists with Double]
  
  /* 9 */ @js.native
  object recordedCalls extends TopLevel[recordedCalls with Double]
  
  /* 10 */ @js.native
  object removableDevices extends TopLevel[removableDevices with Double]
  
  /* 11 */ @js.native
  object savedPictures extends TopLevel[savedPictures with Double]
  
  /* 12 */ @js.native
  object screenshots extends TopLevel[screenshots with Double]
  
  /* 13 */ @js.native
  object videosLibrary extends TopLevel[videosLibrary with Double]
  
}

