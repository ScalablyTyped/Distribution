package typings.winrtUwp.global.Windows.Media.Import

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.IStorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a photo import session with a photo import source. */
@JSGlobal("Windows.Media.Import.PhotoImportSession")
@js.native
abstract class PhotoImportSession ()
  extends typings.winrtUwp.Windows.Media.Import.PhotoImportSession {
  /** Gets or sets a value specifying whether the session date should be appended to the destination folder name. */
  /* CompleteClass */
  override var appendSessionDateToDestinationFolder: Boolean = js.native
  /** Gets or sets the prefix for the destination file name. */
  /* CompleteClass */
  override var destinationFileNamePrefix: String = js.native
  /** Gets or sets the destination folder for the photo import session. */
  /* CompleteClass */
  override var destinationFolder: IStorageFolder = js.native
  /** Gets a unique identifier for the import session. */
  /* CompleteClass */
  override var sessionId: String = js.native
  /** Gets an object representing the source device associated with the photo import session. */
  /* CompleteClass */
  override var source: typings.winrtUwp.Windows.Media.Import.PhotoImportSource = js.native
  /** Gets or sets a value indicating the method used for naming subfolders within the destination folder. */
  /* CompleteClass */
  override var subfolderCreationMode: typings.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode = js.native
  /** Closes the photo import session and releases associated resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Asynchronously finds items on the source device that are available for import.
    * @param contentTypeFilter A value indicating whether the find operation includes images, videos, or both in the results.
    * @param itemSelectionMode A value indicating whether all items, no items, or only new items in the results are initially marked as selected.
    * @return An asynchronous operation that returns a PhotoImportFindItemsResult on successful completion.
    */
  /* CompleteClass */
  override def findItemsAsync(
    contentTypeFilter: typings.winrtUwp.Windows.Media.Import.PhotoImportContentTypeFilter,
    itemSelectionMode: typings.winrtUwp.Windows.Media.Import.PhotoImportItemSelectionMode
  ): IPromiseWithIAsyncOperationWithProgress[typings.winrtUwp.Windows.Media.Import.PhotoImportFindItemsResult, Double] = js.native
}

