package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKnownFoldersStatics extends js.Object {
  var documentsLibrary: StorageFolder
  var homeGroup: StorageFolder
  var mediaServerDevices: StorageFolder
  var musicLibrary: StorageFolder
  var picturesLibrary: StorageFolder
  var removableDevices: StorageFolder
  var videosLibrary: StorageFolder
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
}

