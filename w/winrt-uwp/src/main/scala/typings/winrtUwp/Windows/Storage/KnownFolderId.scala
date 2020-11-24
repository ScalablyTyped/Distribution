package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
