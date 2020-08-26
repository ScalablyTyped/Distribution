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

@js.native
trait IStorageItemInformation extends js.Object {
  var basicProperties: BasicProperties = js.native
  var documentProperties: DocumentProperties = js.native
  var imageProperties: ImageProperties = js.native
  var musicProperties: MusicProperties = js.native
  var onpropertiesupdated: js.Any = js.native
  var onthumbnailupdated: js.Any = js.native
  var thumbnail: StorageItemThumbnail = js.native
  var videoProperties: VideoProperties = js.native
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
    val __obj = js.Dynamic.literal(basicProperties = basicProperties.asInstanceOf[js.Any], documentProperties = documentProperties.asInstanceOf[js.Any], imageProperties = imageProperties.asInstanceOf[js.Any], musicProperties = musicProperties.asInstanceOf[js.Any], onpropertiesupdated = onpropertiesupdated.asInstanceOf[js.Any], onthumbnailupdated = onthumbnailupdated.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], videoProperties = videoProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorageItemInformation]
  }
  @scala.inline
  implicit class IStorageItemInformationOps[Self <: IStorageItemInformation] (val x: Self) extends AnyVal {
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
    def setBasicProperties(value: BasicProperties): Self = this.set("basicProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentProperties(value: DocumentProperties): Self = this.set("documentProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageProperties(value: ImageProperties): Self = this.set("imageProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setMusicProperties(value: MusicProperties): Self = this.set("musicProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnpropertiesupdated(value: js.Any): Self = this.set("onpropertiesupdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnthumbnailupdated(value: js.Any): Self = this.set("onthumbnailupdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnail(value: StorageItemThumbnail): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoProperties(value: VideoProperties): Self = this.set("videoProperties", value.asInstanceOf[js.Any])
  }
  
}

