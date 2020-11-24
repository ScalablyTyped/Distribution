package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKnownFoldersStatics extends js.Object {
  
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
  implicit class IKnownFoldersStaticsOps[Self <: IKnownFoldersStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocumentsLibrary(value: StorageFolder): Self = this.set("documentsLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeGroup(value: StorageFolder): Self = this.set("homeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaServerDevices(value: StorageFolder): Self = this.set("mediaServerDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMusicLibrary(value: StorageFolder): Self = this.set("musicLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicturesLibrary(value: StorageFolder): Self = this.set("picturesLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovableDevices(value: StorageFolder): Self = this.set("removableDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideosLibrary(value: StorageFolder): Self = this.set("videosLibrary", value.asInstanceOf[js.Any])
  }
}
