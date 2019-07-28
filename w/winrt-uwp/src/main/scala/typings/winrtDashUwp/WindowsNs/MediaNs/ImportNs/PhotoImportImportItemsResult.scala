package typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a operation that imports media items from the source. */
@JSGlobal("Windows.Media.Import.PhotoImportImportItemsResult")
@js.native
abstract class PhotoImportImportItemsResult () extends js.Object {
  /** Gets a value indicating whether the import operation has succeeded. */
  var hasSucceeded: Boolean = js.native
  /** Gets a list of items that were imported from the source. */
  var importedItems: IVectorView[PhotoImportItem] = js.native
  /** Gets the number of photos imported in the operation. */
  var photosCount: Double = js.native
  /** Gets the size of the imported photos, in bytes. */
  var photosSizeInBytes: Double = js.native
  /** Gets the photo import session associated with the import operation. */
  var session: PhotoImportSession = js.native
  /** Gets the number of sibling files imported in the operation. */
  var siblingsCount: Double = js.native
  /** Gets the size of the imported sidecar files, in bytes. */
  var siblingsSizeInBytes: Double = js.native
  /** Gets the number of sidecar files imported in the operation. */
  var sidecarsCount: Double = js.native
  /** Gets the size of the imported sidecar files, in bytes. */
  var sidecarsSizeInBytes: Double = js.native
  /** Gets the total number of items imported in the operation. */
  var totalCount: Double = js.native
  /** Gets the total size of the all imported items, in bytes. */
  var totalSizeInBytes: Double = js.native
  /** Gets the number of videos imported in the operation. */
  var videosCount: Double = js.native
  /** Gets the size of the imported videos, in bytes. */
  var videosSizeInBytes: Double = js.native
  /**
    * Asynchronously deletes the items that were imported from the source.
    * @return An asynchronous operation that returns a PhotoImportDeleteImportedItemsFromSourceResult on successful completion.
    */
  def deleteImportedItemsFromSourceAsync(): IPromiseWithIAsyncOperationWithProgress[PhotoImportDeleteImportedItemsFromSourceResult, Double] = js.native
}

