package typings.winrtUwp.Windows.Media.Import

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a operation that deletes imported media items from the source. */
trait PhotoImportDeleteImportedItemsFromSourceResult extends js.Object {
  /** Gets a list of items that were deleted from the source. */
  var deletedItems: IVectorView[PhotoImportItem]
  /** Gets a value indicating whether the delete operation has succeeded. */
  var hasSucceeded: Boolean
  /** Gets the number of photos deleted in the operation. */
  var photosCount: Double
  /** Gets the size of the deleted photos, in bytes. */
  var photosSizeInBytes: Double
  /** Gets the photo import session associated with the delete operation. */
  var session: PhotoImportSession
  /** Gets the number of sibling files deleted in the operation. */
  var siblingsCount: Double
  /** Gets the size of the deleted sibling files, in bytes. */
  var siblingsSizeInBytes: Double
  /** Gets the number of sidecar files deleted in the operation. */
  var sidecarsCount: Double
  /** Gets the size of the deleted sidecar files, in bytes. */
  var sidecarsSizeInBytes: Double
  /** Gets the total number of items deleted in the operation. */
  var totalCount: Double
  /** Gets the total size of the all deleted items, in bytes. */
  var totalSizeInBytes: Double
  /** Gets the number of videos deleted in the operation. */
  var videosCount: Double
  /** Gets the size of the deleted videos, in bytes. */
  var videosSizeInBytes: Double
}

object PhotoImportDeleteImportedItemsFromSourceResult {
  @scala.inline
  def apply(
    deletedItems: IVectorView[PhotoImportItem],
    hasSucceeded: Boolean,
    photosCount: Double,
    photosSizeInBytes: Double,
    session: PhotoImportSession,
    siblingsCount: Double,
    siblingsSizeInBytes: Double,
    sidecarsCount: Double,
    sidecarsSizeInBytes: Double,
    totalCount: Double,
    totalSizeInBytes: Double,
    videosCount: Double,
    videosSizeInBytes: Double
  ): PhotoImportDeleteImportedItemsFromSourceResult = {
    val __obj = js.Dynamic.literal(deletedItems = deletedItems.asInstanceOf[js.Any], hasSucceeded = hasSucceeded.asInstanceOf[js.Any], photosCount = photosCount.asInstanceOf[js.Any], photosSizeInBytes = photosSizeInBytes.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], siblingsCount = siblingsCount.asInstanceOf[js.Any], siblingsSizeInBytes = siblingsSizeInBytes.asInstanceOf[js.Any], sidecarsCount = sidecarsCount.asInstanceOf[js.Any], sidecarsSizeInBytes = sidecarsSizeInBytes.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any], totalSizeInBytes = totalSizeInBytes.asInstanceOf[js.Any], videosCount = videosCount.asInstanceOf[js.Any], videosSizeInBytes = videosSizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportDeleteImportedItemsFromSourceResult]
  }
}

