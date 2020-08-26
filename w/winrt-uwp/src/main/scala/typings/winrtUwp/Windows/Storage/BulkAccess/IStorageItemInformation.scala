package typings.winrtUwp.Windows.Storage.BulkAccess

import typings.winrtUwp.Windows.Storage.FileProperties.BasicProperties
import typings.winrtUwp.Windows.Storage.FileProperties.DocumentProperties
import typings.winrtUwp.Windows.Storage.FileProperties.ImageProperties
import typings.winrtUwp.Windows.Storage.FileProperties.MusicProperties
import typings.winrtUwp.Windows.Storage.FileProperties.StorageItemThumbnail
import typings.winrtUwp.Windows.Storage.FileProperties.VideoProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides synchronous access to the properties of a file or folder in the file system. */
@js.native
trait IStorageItemInformation extends js.Object {
  /** Gets an object that contains the basic properties information of the item. */
  var basicProperties: BasicProperties = js.native
  /** Gets an object that provides access to the document properties of the item, such as the title, author name, and so on. */
  var documentProperties: DocumentProperties = js.native
  /** Gets an object that provides access to the image properties of the item, such as the title, rating, date that the image was taken, and so on. */
  var imageProperties: ImageProperties = js.native
  /** Gets an object that provides access to the music properties of the item, such as the album name, artist name, bit rate, and so on. */
  var musicProperties: MusicProperties = js.native
  /** Gets the thumbnail associated with the item. */
  var thumbnail: StorageItemThumbnail = js.native
  /** Gets an object that provides access to the video properties of the item, such as the duration, rating, date released, and so on. */
  var videoProperties: VideoProperties = js.native
}

object IStorageItemInformation {
  @scala.inline
  def apply(
    basicProperties: BasicProperties,
    documentProperties: DocumentProperties,
    imageProperties: ImageProperties,
    musicProperties: MusicProperties,
    thumbnail: StorageItemThumbnail,
    videoProperties: VideoProperties
  ): IStorageItemInformation = {
    val __obj = js.Dynamic.literal(basicProperties = basicProperties.asInstanceOf[js.Any], documentProperties = documentProperties.asInstanceOf[js.Any], imageProperties = imageProperties.asInstanceOf[js.Any], musicProperties = musicProperties.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], videoProperties = videoProperties.asInstanceOf[js.Any])
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
    def setThumbnail(value: StorageItemThumbnail): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoProperties(value: VideoProperties): Self = this.set("videoProperties", value.asInstanceOf[js.Any])
  }
  
}

