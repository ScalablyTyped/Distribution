package typings.winrtUwp.Windows.Media.Import

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an media item that has been imported from a source. */
@js.native
trait PhotoImportItem extends js.Object {
  /** Gets the content type of the imported item. */
  var contentType: PhotoImportContentType = js.native
  /** Gets the creation date of the imported item. */
  var date: Date = js.native
  /** Gets a list of the names of files associated with this item that were deleted. */
  var deletedFileNames: IVectorView[String] = js.native
  /** Gets a list of the names of files associated with this item that were imported. */
  var importedFileNames: IVectorView[String] = js.native
  /** Gets a value indicating whether the item is currently selected for import. */
  var isSelected: Boolean = js.native
  /** Gets the key used to identify the item. */
  var itemKey: Double = js.native
  /** Gets the name of the item. */
  var name: String = js.native
  /** Gets the sibling file associated with the item, if one exists. */
  var sibling: PhotoImportSidecar = js.native
  /** Gets the list of sidecar files associated with the item, if any exists. */
  var sidecars: IVectorView[PhotoImportSidecar] = js.native
  /** Gets the size of the item, in bytes. */
  var sizeInBytes: Double = js.native
  /** Gets a random access stream containing the thumbnail image associated with the item. */
  var thumbnail: IRandomAccessStreamReference = js.native
  /** Gets the list of video segments associated with the item. */
  var videoSegments: IVectorView[PhotoImportVideoSegment] = js.native
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
  @scala.inline
  implicit class PhotoImportItemOps[Self <: PhotoImportItem] (val x: Self) extends AnyVal {
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
    def setContentType(value: PhotoImportContentType): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletedFileNames(value: IVectorView[String]): Self = this.set("deletedFileNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setImportedFileNames(value: IVectorView[String]): Self = this.set("importedFileNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemKey(value: Double): Self = this.set("itemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSibling(value: PhotoImportSidecar): Self = this.set("sibling", value.asInstanceOf[js.Any])
    @scala.inline
    def setSidecars(value: IVectorView[PhotoImportSidecar]): Self = this.set("sidecars", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeInBytes(value: Double): Self = this.set("sizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnail(value: IRandomAccessStreamReference): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoSegments(value: IVectorView[PhotoImportVideoSegment]): Self = this.set("videoSegments", value.asInstanceOf[js.Any])
  }
  
}

