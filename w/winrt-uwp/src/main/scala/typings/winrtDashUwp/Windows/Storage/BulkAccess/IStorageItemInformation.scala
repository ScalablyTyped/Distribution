package typings.winrtDashUwp.Windows.Storage.BulkAccess

import typings.winrtDashUwp.Windows.Storage.FileProperties.BasicProperties
import typings.winrtDashUwp.Windows.Storage.FileProperties.DocumentProperties
import typings.winrtDashUwp.Windows.Storage.FileProperties.ImageProperties
import typings.winrtDashUwp.Windows.Storage.FileProperties.MusicProperties
import typings.winrtDashUwp.Windows.Storage.FileProperties.StorageItemThumbnail
import typings.winrtDashUwp.Windows.Storage.FileProperties.VideoProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides synchronous access to the properties of a file or folder in the file system. */
trait IStorageItemInformation extends js.Object {
  /** Gets an object that contains the basic properties information of the item. */
  var basicProperties: BasicProperties
  /** Gets an object that provides access to the document properties of the item, such as the title, author name, and so on. */
  var documentProperties: DocumentProperties
  /** Gets an object that provides access to the image properties of the item, such as the title, rating, date that the image was taken, and so on. */
  var imageProperties: ImageProperties
  /** Gets an object that provides access to the music properties of the item, such as the album name, artist name, bit rate, and so on. */
  var musicProperties: MusicProperties
  /** Gets the thumbnail associated with the item. */
  var thumbnail: StorageItemThumbnail
  /** Gets an object that provides access to the video properties of the item, such as the duration, rating, date released, and so on. */
  var videoProperties: VideoProperties
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
    val __obj = js.Dynamic.literal(basicProperties = basicProperties, documentProperties = documentProperties, imageProperties = imageProperties, musicProperties = musicProperties, thumbnail = thumbnail, videoProperties = videoProperties)
  
    __obj.asInstanceOf[IStorageItemInformation]
  }
}

