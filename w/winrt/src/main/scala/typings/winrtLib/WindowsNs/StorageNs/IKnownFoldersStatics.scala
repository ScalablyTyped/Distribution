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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("documentsLibrary")(documentsLibrary)
    __obj.updateDynamic("homeGroup")(homeGroup)
    __obj.updateDynamic("mediaServerDevices")(mediaServerDevices)
    __obj.updateDynamic("musicLibrary")(musicLibrary)
    __obj.updateDynamic("picturesLibrary")(picturesLibrary)
    __obj.updateDynamic("removableDevices")(removableDevices)
    __obj.updateDynamic("videosLibrary")(videosLibrary)
    __obj.asInstanceOf[IKnownFoldersStatics]
  }
}

