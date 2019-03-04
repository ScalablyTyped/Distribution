package typings
package winrtLib.WindowsNs.StorageNs

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
    val __obj = js.Dynamic.literal(documentsLibrary = documentsLibrary, homeGroup = homeGroup, mediaServerDevices = mediaServerDevices, musicLibrary = musicLibrary, picturesLibrary = picturesLibrary, removableDevices = removableDevices, videosLibrary = videosLibrary)
  
    __obj.asInstanceOf[IKnownFoldersStatics]
  }
}

