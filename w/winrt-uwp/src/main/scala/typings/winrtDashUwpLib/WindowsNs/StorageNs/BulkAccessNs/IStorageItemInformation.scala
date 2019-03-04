package typings
package winrtDashUwpLib.WindowsNs.StorageNs.BulkAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides synchronous access to the properties of a file or folder in the file system. */
trait IStorageItemInformation extends js.Object {
  /** Gets an object that contains the basic properties information of the item. */
  var basicProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.BasicProperties
  /** Gets an object that provides access to the document properties of the item, such as the title, author name, and so on. */
  var documentProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.DocumentProperties
  /** Gets an object that provides access to the image properties of the item, such as the title, rating, date that the image was taken, and so on. */
  var imageProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ImageProperties
  /** Gets an object that provides access to the music properties of the item, such as the album name, artist name, bit rate, and so on. */
  var musicProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.MusicProperties
  /** Gets the thumbnail associated with the item. */
  var thumbnail: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail
  /** Gets an object that provides access to the video properties of the item, such as the duration, rating, date released, and so on. */
  var videoProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.VideoProperties
}

object IStorageItemInformation {
  @scala.inline
  def apply(
    basicProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.BasicProperties,
    documentProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.DocumentProperties,
    imageProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ImageProperties,
    musicProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.MusicProperties,
    thumbnail: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail,
    videoProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.VideoProperties
  ): IStorageItemInformation = {
    val __obj = js.Dynamic.literal(basicProperties = basicProperties, documentProperties = documentProperties, imageProperties = imageProperties, musicProperties = musicProperties, thumbnail = thumbnail, videoProperties = videoProperties)
  
    __obj.asInstanceOf[IStorageItemInformation]
  }
}

