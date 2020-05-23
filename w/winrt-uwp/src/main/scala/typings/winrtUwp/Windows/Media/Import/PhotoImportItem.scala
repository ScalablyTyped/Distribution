package typings.winrtUwp.Windows.Media.Import

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an media item that has been imported from a source. */
trait PhotoImportItem extends js.Object {
  /** Gets the content type of the imported item. */
  var contentType: PhotoImportContentType
  /** Gets the creation date of the imported item. */
  var date: Date
  /** Gets a list of the names of files associated with this item that were deleted. */
  var deletedFileNames: IVectorView[String]
  /** Gets a list of the names of files associated with this item that were imported. */
  var importedFileNames: IVectorView[String]
  /** Gets a value indicating whether the item is currently selected for import. */
  var isSelected: Boolean
  /** Gets the key used to identify the item. */
  var itemKey: Double
  /** Gets the name of the item. */
  var name: String
  /** Gets the sibling file associated with the item, if one exists. */
  var sibling: PhotoImportSidecar
  /** Gets the list of sidecar files associated with the item, if any exists. */
  var sidecars: IVectorView[PhotoImportSidecar]
  /** Gets the size of the item, in bytes. */
  var sizeInBytes: Double
  /** Gets a random access stream containing the thumbnail image associated with the item. */
  var thumbnail: IRandomAccessStreamReference
  /** Gets the list of video segments associated with the item. */
  var videoSegments: IVectorView[PhotoImportVideoSegment]
}

object PhotoImportItem {
  @scala.inline
  def apply(
    contentType: PhotoImportContentType,
    date: Date,
    deletedFileNames: IVectorView[String],
    importedFileNames: IVectorView[String],
    isSelected: Boolean,
    itemKey: Double,
    name: String,
    sibling: PhotoImportSidecar,
    sidecars: IVectorView[PhotoImportSidecar],
    sizeInBytes: Double,
    thumbnail: IRandomAccessStreamReference,
    videoSegments: IVectorView[PhotoImportVideoSegment]
  ): PhotoImportItem = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], deletedFileNames = deletedFileNames.asInstanceOf[js.Any], importedFileNames = importedFileNames.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], itemKey = itemKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sibling = sibling.asInstanceOf[js.Any], sidecars = sidecars.asInstanceOf[js.Any], sizeInBytes = sizeInBytes.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], videoSegments = videoSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportItem]
  }
}

