package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a operation that deletes imported media items from the source. */
@JSGlobal("Windows.Media.Import.PhotoImportDeleteImportedItemsFromSourceResult")
@js.native
abstract class PhotoImportDeleteImportedItemsFromSourceResult () extends js.Object {
  /** Gets a list of items that were deleted from the source. */
  var deletedItems: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PhotoImportItem] = js.native
  /** Gets a value indicating whether the delete operation has succeeded. */
  var hasSucceeded: scala.Boolean = js.native
  /** Gets the number of photos deleted in the operation. */
  var photosCount: scala.Double = js.native
  /** Gets the size of the deleted photos, in bytes. */
  var photosSizeInBytes: scala.Double = js.native
  /** Gets the photo import session associated with the delete operation. */
  var session: PhotoImportSession = js.native
  /** Gets the number of sibling files deleted in the operation. */
  var siblingsCount: scala.Double = js.native
  /** Gets the size of the deleted sibling files, in bytes. */
  var siblingsSizeInBytes: scala.Double = js.native
  /** Gets the number of sidecar files deleted in the operation. */
  var sidecarsCount: scala.Double = js.native
  /** Gets the size of the deleted sidecar files, in bytes. */
  var sidecarsSizeInBytes: scala.Double = js.native
  /** Gets the total number of items deleted in the operation. */
  var totalCount: scala.Double = js.native
  /** Gets the total size of the all deleted items, in bytes. */
  var totalSizeInBytes: scala.Double = js.native
  /** Gets the number of videos deleted in the operation. */
  var videosCount: scala.Double = js.native
  /** Gets the size of the deleted videos, in bytes. */
  var videosSizeInBytes: scala.Double = js.native
}

