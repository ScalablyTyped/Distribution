package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KnownFolderId extends StObject
/** Provides values that identify storage folders. */
@JSGlobal("Windows.Storage.KnownFolderId")
@js.native
object KnownFolderId extends StObject {
  
  /** App Captures folder. */
  @js.native
  sealed trait appCaptures
    extends StObject
       with KnownFolderId
  
  /** Camera Roll folder. */
  @js.native
  sealed trait cameraRoll
    extends StObject
       with KnownFolderId
  
  /** Documents library folder. */
  @js.native
  sealed trait documentsLibrary
    extends StObject
       with KnownFolderId
  
  /** HomeGroup folder. */
  @js.native
  sealed trait homeGroup
    extends StObject
       with KnownFolderId
  
  /** The folder of media server (DLNA) devices. */
  @js.native
  sealed trait mediaServerDevices
    extends StObject
       with KnownFolderId
  
  /** Music library folder. */
  @js.native
  sealed trait musicLibrary
    extends StObject
       with KnownFolderId
  
  /** Objects 3D folder. */
  @js.native
  sealed trait objects3D
    extends StObject
       with KnownFolderId
  
  /** Pictures library folder. */
  @js.native
  sealed trait picturesLibrary
    extends StObject
       with KnownFolderId
  
  /** Playlists folder. */
  @js.native
  sealed trait playlists
    extends StObject
       with KnownFolderId
  
  /** Recorded calls folder. */
  @js.native
  sealed trait recordedCalls
    extends StObject
       with KnownFolderId
  
  /** Removable devices folder. */
  @js.native
  sealed trait removableDevices
    extends StObject
       with KnownFolderId
  
  /** Saved pictures folder. */
  @js.native
  sealed trait savedPictures
    extends StObject
       with KnownFolderId
  
  /** Screenshots folder. */
  @js.native
  sealed trait screenshots
    extends StObject
       with KnownFolderId
  
  /** Videos library folder. */
  @js.native
  sealed trait videosLibrary
    extends StObject
       with KnownFolderId
}
