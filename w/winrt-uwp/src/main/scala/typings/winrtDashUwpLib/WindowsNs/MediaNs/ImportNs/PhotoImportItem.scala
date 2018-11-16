package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an media item that has been imported from a source. */
@JSGlobal("Windows.Media.Import.PhotoImportItem")
@js.native
abstract class PhotoImportItem () extends js.Object {
  /** Gets the content type of the imported item. */
  var contentType: PhotoImportContentType = js.native
  /** Gets the creation date of the imported item. */
  var date: stdLib.Date = js.native
  /** Gets a list of the names of files associated with this item that were deleted. */
  var deletedFileNames: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets a list of the names of files associated with this item that were imported. */
  var importedFileNames: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets a value indicating whether the item is currently selected for import. */
  var isSelected: scala.Boolean = js.native
  /** Gets the key used to identify the item. */
  var itemKey: scala.Double = js.native
  /** Gets the name of the item. */
  var name: java.lang.String = js.native
  /** Gets the sibling file associated with the item, if one exists. */
  var sibling: PhotoImportSidecar = js.native
  /** Gets the list of sidecar files associated with the item, if any exists. */
  var sidecars: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PhotoImportSidecar] = js.native
  /** Gets the size of the item, in bytes. */
  var sizeInBytes: scala.Double = js.native
  /** Gets a random access stream containing the thumbnail image associated with the item. */
  var thumbnail: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets the list of video segments associated with the item. */
  var videoSegments: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PhotoImportVideoSegment] = js.native
}

