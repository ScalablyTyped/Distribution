package typings
package winrtLib.WindowsNs.StorageNs.BulkAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageItemInformation extends js.Object {
  var basicProperties: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.BasicProperties
  var documentProperties: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.DocumentProperties
  var imageProperties: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ImageProperties
  var musicProperties: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.MusicProperties
  var onpropertiesupdated: js.Any
  var onthumbnailupdated: js.Any
  var thumbnail: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail
  var videoProperties: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.VideoProperties
}

object IStorageItemInformation {
  @scala.inline
  def apply(
    basicProperties: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.BasicProperties,
    documentProperties: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.DocumentProperties,
    imageProperties: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ImageProperties,
    musicProperties: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.MusicProperties,
    onpropertiesupdated: js.Any,
    onthumbnailupdated: js.Any,
    thumbnail: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail,
    videoProperties: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.VideoProperties
  ): IStorageItemInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("basicProperties")(basicProperties)
    __obj.updateDynamic("documentProperties")(documentProperties)
    __obj.updateDynamic("imageProperties")(imageProperties)
    __obj.updateDynamic("musicProperties")(musicProperties)
    __obj.updateDynamic("onpropertiesupdated")(onpropertiesupdated)
    __obj.updateDynamic("onthumbnailupdated")(onthumbnailupdated)
    __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.updateDynamic("videoProperties")(videoProperties)
    __obj.asInstanceOf[IStorageItemInformation]
  }
}

