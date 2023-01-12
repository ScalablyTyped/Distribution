package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKnownFoldersStatics extends StObject {
  
  var documentsLibrary: StorageFolder
  
  var homeGroup: StorageFolder
  
  var mediaServerDevices: StorageFolder
  
  var musicLibrary: StorageFolder
  
  var picturesLibrary: StorageFolder
  
  var removableDevices: StorageFolder
  
  var videosLibrary: StorageFolder
}
object IKnownFoldersStatics {
  
  inline def apply(
    documentsLibrary: StorageFolder,
    homeGroup: StorageFolder,
    mediaServerDevices: StorageFolder,
    musicLibrary: StorageFolder,
    picturesLibrary: StorageFolder,
    removableDevices: StorageFolder,
    videosLibrary: StorageFolder
  ): IKnownFoldersStatics = {
    val __obj = js.Dynamic.literal(documentsLibrary = documentsLibrary.asInstanceOf[js.Any], homeGroup = homeGroup.asInstanceOf[js.Any], mediaServerDevices = mediaServerDevices.asInstanceOf[js.Any], musicLibrary = musicLibrary.asInstanceOf[js.Any], picturesLibrary = picturesLibrary.asInstanceOf[js.Any], removableDevices = removableDevices.asInstanceOf[js.Any], videosLibrary = videosLibrary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKnownFoldersStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IKnownFoldersStatics] (val x: Self) extends AnyVal {
    
    inline def setDocumentsLibrary(value: StorageFolder): Self = StObject.set(x, "documentsLibrary", value.asInstanceOf[js.Any])
    
    inline def setHomeGroup(value: StorageFolder): Self = StObject.set(x, "homeGroup", value.asInstanceOf[js.Any])
    
    inline def setMediaServerDevices(value: StorageFolder): Self = StObject.set(x, "mediaServerDevices", value.asInstanceOf[js.Any])
    
    inline def setMusicLibrary(value: StorageFolder): Self = StObject.set(x, "musicLibrary", value.asInstanceOf[js.Any])
    
    inline def setPicturesLibrary(value: StorageFolder): Self = StObject.set(x, "picturesLibrary", value.asInstanceOf[js.Any])
    
    inline def setRemovableDevices(value: StorageFolder): Self = StObject.set(x, "removableDevices", value.asInstanceOf[js.Any])
    
    inline def setVideosLibrary(value: StorageFolder): Self = StObject.set(x, "videosLibrary", value.asInstanceOf[js.Any])
  }
}
