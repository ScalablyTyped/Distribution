package typings.winrtUwp.Windows.Media.Import

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.IStorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a photo import session with a photo import source. */
trait PhotoImportSession extends js.Object {
  /** Gets or sets a value specifying whether the session date should be appended to the destination folder name. */
  var appendSessionDateToDestinationFolder: Boolean
  /** Gets or sets the prefix for the destination file name. */
  var destinationFileNamePrefix: String
  /** Gets or sets the destination folder for the photo import session. */
  var destinationFolder: IStorageFolder
  /** Gets a unique identifier for the import session. */
  var sessionId: String
  /** Gets an object representing the source device associated with the photo import session. */
  var source: PhotoImportSource
  /** Gets or sets a value indicating the method used for naming subfolders within the destination folder. */
  var subfolderCreationMode: PhotoImportSubfolderCreationMode
  /** Closes the photo import session and releases associated resources. */
  def close(): Unit
  /**
    * Asynchronously finds items on the source device that are available for import.
    * @param contentTypeFilter A value indicating whether the find operation includes images, videos, or both in the results.
    * @param itemSelectionMode A value indicating whether all items, no items, or only new items in the results are initially marked as selected.
    * @return An asynchronous operation that returns a PhotoImportFindItemsResult on successful completion.
    */
  def findItemsAsync(contentTypeFilter: PhotoImportContentTypeFilter, itemSelectionMode: PhotoImportItemSelectionMode): IPromiseWithIAsyncOperationWithProgress[PhotoImportFindItemsResult, Double]
}

object PhotoImportSession {
  @scala.inline
  def apply(
    appendSessionDateToDestinationFolder: Boolean,
    close: () => Unit,
    destinationFileNamePrefix: String,
    destinationFolder: IStorageFolder,
    findItemsAsync: (PhotoImportContentTypeFilter, PhotoImportItemSelectionMode) => IPromiseWithIAsyncOperationWithProgress[PhotoImportFindItemsResult, Double],
    sessionId: String,
    source: PhotoImportSource,
    subfolderCreationMode: PhotoImportSubfolderCreationMode
  ): PhotoImportSession = {
    val __obj = js.Dynamic.literal(appendSessionDateToDestinationFolder = appendSessionDateToDestinationFolder.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), destinationFileNamePrefix = destinationFileNamePrefix.asInstanceOf[js.Any], destinationFolder = destinationFolder.asInstanceOf[js.Any], findItemsAsync = js.Any.fromFunction2(findItemsAsync), sessionId = sessionId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], subfolderCreationMode = subfolderCreationMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportSession]
  }
}

