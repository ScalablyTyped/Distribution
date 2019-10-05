package typings.winrt.Windows.Storage.BulkAccess

import typings.winrt.Windows.Storage.FileProperties.BasicProperties
import typings.winrt.Windows.Storage.FileProperties.DocumentProperties
import typings.winrt.Windows.Storage.FileProperties.ImageProperties
import typings.winrt.Windows.Storage.FileProperties.MusicProperties
import typings.winrt.Windows.Storage.FileProperties.StorageItemThumbnail
import typings.winrt.Windows.Storage.FileProperties.VideoProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageItemInformation extends js.Object {
  var basicProperties: BasicProperties
  var documentProperties: DocumentProperties
  var imageProperties: ImageProperties
  var musicProperties: MusicProperties
  var onpropertiesupdated: js.Any
  var onthumbnailupdated: js.Any
  var thumbnail: StorageItemThumbnail
  var videoProperties: VideoProperties
}

object IStorageItemInformation {
  @scala.inline
  def apply(
    basicProperties: BasicProperties,
    documentProperties: DocumentProperties,
    imageProperties: ImageProperties,
    musicProperties: MusicProperties,
    onpropertiesupdated: js.Any,
    onthumbnailupdated: js.Any,
    thumbnail: StorageItemThumbnail,
    videoProperties: VideoProperties
  ): IStorageItemInformation = {
    val __obj = js.Dynamic.literal(basicProperties = basicProperties, documentProperties = documentProperties, imageProperties = imageProperties, musicProperties = musicProperties, onpropertiesupdated = onpropertiesupdated, onthumbnailupdated = onthumbnailupdated, thumbnail = thumbnail, videoProperties = videoProperties)
  
    __obj.asInstanceOf[IStorageItemInformation]
  }
}

