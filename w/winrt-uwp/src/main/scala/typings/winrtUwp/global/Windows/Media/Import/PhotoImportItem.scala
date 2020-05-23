package typings.winrtUwp.global.Windows.Media.Import

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an media item that has been imported from a source. */
@JSGlobal("Windows.Media.Import.PhotoImportItem")
@js.native
abstract class PhotoImportItem ()
  extends typings.winrtUwp.Windows.Media.Import.PhotoImportItem {
  /** Gets the content type of the imported item. */
  /* CompleteClass */
  override var contentType: typings.winrtUwp.Windows.Media.Import.PhotoImportContentType = js.native
  /** Gets the creation date of the imported item. */
  /* CompleteClass */
  override var date: Date = js.native
  /** Gets a list of the names of files associated with this item that were deleted. */
  /* CompleteClass */
  override var deletedFileNames: IVectorView[String] = js.native
  /** Gets a list of the names of files associated with this item that were imported. */
  /* CompleteClass */
  override var importedFileNames: IVectorView[String] = js.native
  /** Gets a value indicating whether the item is currently selected for import. */
  /* CompleteClass */
  override var isSelected: Boolean = js.native
  /** Gets the key used to identify the item. */
  /* CompleteClass */
  override var itemKey: Double = js.native
  /** Gets the name of the item. */
  /* CompleteClass */
  override var name: String = js.native
  /** Gets the sibling file associated with the item, if one exists. */
  /* CompleteClass */
  override var sibling: typings.winrtUwp.Windows.Media.Import.PhotoImportSidecar = js.native
  /** Gets the list of sidecar files associated with the item, if any exists. */
  /* CompleteClass */
  override var sidecars: IVectorView[typings.winrtUwp.Windows.Media.Import.PhotoImportSidecar] = js.native
  /** Gets the size of the item, in bytes. */
  /* CompleteClass */
  override var sizeInBytes: Double = js.native
  /** Gets a random access stream containing the thumbnail image associated with the item. */
  /* CompleteClass */
  override var thumbnail: IRandomAccessStreamReference = js.native
  /** Gets the list of video segments associated with the item. */
  /* CompleteClass */
  override var videoSegments: IVectorView[typings.winrtUwp.Windows.Media.Import.PhotoImportVideoSegment] = js.native
}

