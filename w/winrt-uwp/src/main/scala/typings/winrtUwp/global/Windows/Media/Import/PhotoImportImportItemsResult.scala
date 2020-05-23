package typings.winrtUwp.global.Windows.Media.Import

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a operation that imports media items from the source. */
@JSGlobal("Windows.Media.Import.PhotoImportImportItemsResult")
@js.native
abstract class PhotoImportImportItemsResult ()
  extends typings.winrtUwp.Windows.Media.Import.PhotoImportImportItemsResult {
  /** Gets a value indicating whether the import operation has succeeded. */
  /* CompleteClass */
  override var hasSucceeded: Boolean = js.native
  /** Gets a list of items that were imported from the source. */
  /* CompleteClass */
  override var importedItems: IVectorView[typings.winrtUwp.Windows.Media.Import.PhotoImportItem] = js.native
  /** Gets the number of photos imported in the operation. */
  /* CompleteClass */
  override var photosCount: Double = js.native
  /** Gets the size of the imported photos, in bytes. */
  /* CompleteClass */
  override var photosSizeInBytes: Double = js.native
  /** Gets the photo import session associated with the import operation. */
  /* CompleteClass */
  override var session: typings.winrtUwp.Windows.Media.Import.PhotoImportSession = js.native
  /** Gets the number of sibling files imported in the operation. */
  /* CompleteClass */
  override var siblingsCount: Double = js.native
  /** Gets the size of the imported sidecar files, in bytes. */
  /* CompleteClass */
  override var siblingsSizeInBytes: Double = js.native
  /** Gets the number of sidecar files imported in the operation. */
  /* CompleteClass */
  override var sidecarsCount: Double = js.native
  /** Gets the size of the imported sidecar files, in bytes. */
  /* CompleteClass */
  override var sidecarsSizeInBytes: Double = js.native
  /** Gets the total number of items imported in the operation. */
  /* CompleteClass */
  override var totalCount: Double = js.native
  /** Gets the total size of the all imported items, in bytes. */
  /* CompleteClass */
  override var totalSizeInBytes: Double = js.native
  /** Gets the number of videos imported in the operation. */
  /* CompleteClass */
  override var videosCount: Double = js.native
  /** Gets the size of the imported videos, in bytes. */
  /* CompleteClass */
  override var videosSizeInBytes: Double = js.native
  /**
    * Asynchronously deletes the items that were imported from the source.
    * @return An asynchronous operation that returns a PhotoImportDeleteImportedItemsFromSourceResult on successful completion.
    */
  /* CompleteClass */
  override def deleteImportedItemsFromSourceAsync(): IPromiseWithIAsyncOperationWithProgress[
    typings.winrtUwp.Windows.Media.Import.PhotoImportDeleteImportedItemsFromSourceResult, 
    Double
  ] = js.native
}

