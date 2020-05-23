package typings.winrtUwp.Windows.Media.Import

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.itemimported
import typings.winrtUwp.winrtUwpStrings.selectionchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a operation that finds media items on a source. */
@js.native
trait PhotoImportFindItemsResult extends js.Object {
  /** Gets a list of items that were found on the source. */
  var foundItems: IVectorView[PhotoImportItem] = js.native
  /** Gets a value indicating whether the find operation has succeeded. */
  var hasSucceeded: Boolean = js.native
  /** Gets the photo import mode that determines which types of files are included in the ImportItemsAsync operation. */
  var importMode: PhotoImportImportMode = js.native
  /** Occurs when an item is imported. */
  @JSName("onitemimported")
  var onitemimported_Original: TypedEventHandler[PhotoImportFindItemsResult, PhotoImportItemImportedEventArgs] = js.native
  /** Occurs when the set of items selected to be included in the ImportItemsAsync operation changes. */
  @JSName("onselectionchanged")
  var onselectionchanged_Original: TypedEventHandler[PhotoImportFindItemsResult, PhotoImportSelectionChangedEventArgs] = js.native
  /** Gets the number of photos found on the source. */
  var photosCount: Double = js.native
  /** Gets the size of the photos found on the source, in bytes. */
  var photosSizeInBytes: Double = js.native
  /** Gets the number of photos that are currently selected to be included in the ImportItemsAsync operation. */
  var selectedPhotosCount: Double = js.native
  /** Gets the size of the photos that are currently selected to be included in the ImportItemsAsync operation, in bytes. */
  var selectedPhotosSizeInBytes: Double = js.native
  /** Gets the number of sibling files that are currently selected to be included in the ImportItemsAsync operation. */
  var selectedSiblingsCount: Double = js.native
  /** Gets the size of the sibling files that are currently selected to be included in the ImportItemsAsync operation, in bytes. */
  var selectedSiblingsSizeInBytes: Double = js.native
  /** Gets the number of sidecar files that are currently selected to be included in the ImportItemsAsync operation. */
  var selectedSidecarsCount: Double = js.native
  /** Gets the size of the sidecar files that are currently selected to be included in the ImportItemsAsync operation, in bytes. */
  var selectedSidecarsSizeInBytes: Double = js.native
  /** Gets the total number of items that are currently selected to be included in the ImportItemsAsync operation. */
  var selectedTotalCount: Double = js.native
  /** Gets the total size of the all items that are currently selected to be included in the ImportItemsAsync operation, in bytes. */
  var selectedTotalSizeInBytes: Double = js.native
  /** Gets the number of videos that are currently selected to be included in the ImportItemsAsync operation. */
  var selectedVideosCount: Double = js.native
  /** Gets the size of the videos that are currently selected to be included in the ImportItemsAsync operation, in bytes. */
  var selectedVideosSizeInBytes: Double = js.native
  /** Gets the photo import session associated with the find operation. */
  var session: PhotoImportSession = js.native
  /** Gets the number of sibling files found on the source. */
  var siblingsCount: Double = js.native
  /** Gets the size of the found sibling files, in bytes. */
  var siblingsSizeInBytes: Double = js.native
  /** Gets the number of sidecar files found on the source. */
  var sidecarsCount: Double = js.native
  /** Gets the size of the found sidecar files, in bytes. */
  var sidecarsSizeInBytes: Double = js.native
  /** Gets the total number of items found on the source. */
  var totalCount: Double = js.native
  /** Gets the total size of all items found on the source, in bytes. */
  var totalSizeInBytes: Double = js.native
  /** Gets the number of videos found on the source. */
  var videosCount: Double = js.native
  /** Gets the size of the videos found on the source, in bytes. */
  var videosSizeInBytes: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemimported(
    `type`: itemimported,
    listener: TypedEventHandler[PhotoImportFindItemsResult, PhotoImportItemImportedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchanged(
    `type`: selectionchanged,
    listener: TypedEventHandler[PhotoImportFindItemsResult, PhotoImportSelectionChangedEventArgs]
  ): Unit = js.native
  /**
    * Asynchronously imports the selected items from the source.
    * @return An asynchronous operation that returns a PhotoImportImportItemsResult on successful completion.
    */
  def importItemsAsync(): IPromiseWithIAsyncOperationWithProgress[PhotoImportImportItemsResult, PhotoImportProgress] = js.native
  /** Occurs when an item is imported. */
  def onitemimported(ev: PhotoImportItemImportedEventArgs with WinRTEvent[PhotoImportFindItemsResult]): Unit = js.native
  /** Occurs when the set of items selected to be included in the ImportItemsAsync operation changes. */
  def onselectionchanged(ev: PhotoImportSelectionChangedEventArgs with WinRTEvent[PhotoImportFindItemsResult]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_itemimported(
    `type`: itemimported,
    listener: TypedEventHandler[PhotoImportFindItemsResult, PhotoImportItemImportedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchanged(
    `type`: selectionchanged,
    listener: TypedEventHandler[PhotoImportFindItemsResult, PhotoImportSelectionChangedEventArgs]
  ): Unit = js.native
  /** Selects all items found on the source to be included in the ImportItemsAsync operation. */
  def selectAll(): Unit = js.native
  /**
    * Selects all new items found on the source to be included in the ImportItemsAsync operation.
    * @return An asynchronous operation.
    */
  def selectNewAsync(): IPromiseWithIAsyncAction = js.native
  /** Deselects all items found on the source, preventing them from being included in the ImportItemsAsync operation. */
  def selectNone(): Unit = js.native
  /**
    * Sets the photo import mode that determines which types of files are included in the ImportItemsAsync operation.
    * @param value The photo import mode.
    */
  def setImportMode(value: PhotoImportImportMode): Unit = js.native
}

