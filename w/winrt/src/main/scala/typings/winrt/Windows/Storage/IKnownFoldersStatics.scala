package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKnownFoldersStatics extends StObject {
  
  var documentsLibrary: StorageFolder = js.native
  
  var homeGroup: StorageFolder = js.native
  
  var mediaServerDevices: StorageFolder = js.native
  
  var musicLibrary: StorageFolder = js.native
  
  var picturesLibrary: StorageFolder = js.native
  
  var removableDevices: StorageFolder = js.native
  
  var videosLibrary: StorageFolder = js.native
}
object IKnownFoldersStatics {
  
  @scala.inline
  def apply(
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
  implicit class IKnownFoldersStaticsMutableBuilder[Self <: IKnownFoldersStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentsLibrary(value: StorageFolder): Self = StObject.set(x, "documentsLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeGroup(value: StorageFolder): Self = StObject.set(x, "homeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaServerDevices(value: StorageFolder): Self = StObject.set(x, "mediaServerDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMusicLibrary(value: StorageFolder): Self = StObject.set(x, "musicLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicturesLibrary(value: StorageFolder): Self = StObject.set(x, "picturesLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovableDevices(value: StorageFolder): Self = StObject.set(x, "removableDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideosLibrary(value: StorageFolder): Self = StObject.set(x, "videosLibrary", value.asInstanceOf[js.Any])
  }
}
