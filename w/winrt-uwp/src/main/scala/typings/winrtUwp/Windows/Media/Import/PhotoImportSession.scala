package typings.winrtUwp.Windows.Media.Import

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.IStorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a photo import session with a photo import source. */
@js.native
trait PhotoImportSession extends js.Object {
  /** Gets or sets a value specifying whether the session date should be appended to the destination folder name. */
  var appendSessionDateToDestinationFolder: Boolean = js.native
  /** Gets or sets the prefix for the destination file name. */
  var destinationFileNamePrefix: String = js.native
  /** Gets or sets the destination folder for the photo import session. */
  var destinationFolder: IStorageFolder = js.native
  /** Gets a unique identifier for the import session. */
  var sessionId: String = js.native
  /** Gets an object representing the source device associated with the photo import session. */
  var source: PhotoImportSource = js.native
  /** Gets or sets a value indicating the method used for naming subfolders within the destination folder. */
  var subfolderCreationMode: PhotoImportSubfolderCreationMode = js.native
  /** Closes the photo import session and releases associated resources. */
  def close(): Unit = js.native
  /**
    * Asynchronously finds items on the source device that are available for import.
    * @param contentTypeFilter A value indicating whether the find operation includes images, videos, or both in the results.
    * @param itemSelectionMode A value indicating whether all items, no items, or only new items in the results are initially marked as selected.
    * @return An asynchronous operation that returns a PhotoImportFindItemsResult on successful completion.
    */
  def findItemsAsync(contentTypeFilter: PhotoImportContentTypeFilter, itemSelectionMode: PhotoImportItemSelectionMode): IPromiseWithIAsyncOperationWithProgress[PhotoImportFindItemsResult, Double] = js.native
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
  @scala.inline
  implicit class PhotoImportSessionOps[Self <: PhotoImportSession] (val x: Self) extends AnyVal {
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
    def setAppendSessionDateToDestinationFolder(value: Boolean): Self = this.set("appendSessionDateToDestinationFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setDestinationFileNamePrefix(value: String): Self = this.set("destinationFileNamePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationFolder(value: IStorageFolder): Self = this.set("destinationFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindItemsAsync(
      value: (PhotoImportContentTypeFilter, PhotoImportItemSelectionMode) => IPromiseWithIAsyncOperationWithProgress[PhotoImportFindItemsResult, Double]
    ): Self = this.set("findItemsAsync", js.Any.fromFunction2(value))
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: PhotoImportSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubfolderCreationMode(value: PhotoImportSubfolderCreationMode): Self = this.set("subfolderCreationMode", value.asInstanceOf[js.Any])
  }
  
}

