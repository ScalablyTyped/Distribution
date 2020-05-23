package typings.winrtUwp.global.Windows.Media.Import

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a operation that deletes imported media items from the source. */
@JSGlobal("Windows.Media.Import.PhotoImportDeleteImportedItemsFromSourceResult")
@js.native
abstract class PhotoImportDeleteImportedItemsFromSourceResult ()
  extends typings.winrtUwp.Windows.Media.Import.PhotoImportDeleteImportedItemsFromSourceResult {
  /** Gets a list of items that were deleted from the source. */
  /* CompleteClass */
  override var deletedItems: IVectorView[typings.winrtUwp.Windows.Media.Import.PhotoImportItem] = js.native
  /** Gets a value indicating whether the delete operation has succeeded. */
  /* CompleteClass */
  override var hasSucceeded: Boolean = js.native
  /** Gets the number of photos deleted in the operation. */
  /* CompleteClass */
  override var photosCount: Double = js.native
  /** Gets the size of the deleted photos, in bytes. */
  /* CompleteClass */
  override var photosSizeInBytes: Double = js.native
  /** Gets the photo import session associated with the delete operation. */
  /* CompleteClass */
  override var session: typings.winrtUwp.Windows.Media.Import.PhotoImportSession = js.native
  /** Gets the number of sibling files deleted in the operation. */
  /* CompleteClass */
  override var siblingsCount: Double = js.native
  /** Gets the size of the deleted sibling files, in bytes. */
  /* CompleteClass */
  override var siblingsSizeInBytes: Double = js.native
  /** Gets the number of sidecar files deleted in the operation. */
  /* CompleteClass */
  override var sidecarsCount: Double = js.native
  /** Gets the size of the deleted sidecar files, in bytes. */
  /* CompleteClass */
  override var sidecarsSizeInBytes: Double = js.native
  /** Gets the total number of items deleted in the operation. */
  /* CompleteClass */
  override var totalCount: Double = js.native
  /** Gets the total size of the all deleted items, in bytes. */
  /* CompleteClass */
  override var totalSizeInBytes: Double = js.native
  /** Gets the number of videos deleted in the operation. */
  /* CompleteClass */
  override var videosCount: Double = js.native
  /** Gets the size of the deleted videos, in bytes. */
  /* CompleteClass */
  override var videosSizeInBytes: Double = js.native
}

