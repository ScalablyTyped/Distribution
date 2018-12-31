package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a operation that finds media items on a source. */
@JSGlobal("Windows.Media.Import.PhotoImportFindItemsResult")
@js.native
abstract class PhotoImportFindItemsResult () extends js.Object {
  /** Gets a list of items that were found on the source. */
  var foundItems: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PhotoImportItem] = js.native
  /** Gets a value indicating whether the find operation has succeeded. */
  var hasSucceeded: scala.Boolean = js.native
  /** Gets the photo import mode that determines which types of files are included in the ImportItemsAsync operation. */
  var importMode: PhotoImportImportMode = js.native
  /** Occurs when an item is imported. */
  @JSName("onitemimported")
  var onitemimported_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PhotoImportFindItemsResult, PhotoImportItemImportedEventArgs] = js.native
  /** Occurs when the set of items selected to be included in the ImportItemsAsync operation changes. */
  @JSName("onselectionchanged")
  var onselectionchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PhotoImportFindItemsResult, PhotoImportSelectionChangedEventArgs] = js.native
  /** Gets the number of photos found on the source. */
  var photosCount: scala.Double = js.native
  /** Gets the size of the photos found on the source, in bytes. */
  var photosSizeInBytes: scala.Double = js.native
  /** Gets the number of photos that are currently selected to be included in the ImportItemsAsync operation. */
  var selectedPhotosCount: scala.Double = js.native
  /** Gets the size of the photos that are currently selected to be included in the ImportItemsAsync operation, in bytes. */
  var selectedPhotosSizeInBytes: scala.Double = js.native
  /** Gets the number of sibling files that are currently selected to be included in the ImportItemsAsync operation. */
  var selectedSiblingsCount: scala.Double = js.native
  /** Gets the size of the sibling files that are currently selected to be included in the ImportItemsAsync operation, in bytes. */
  var selectedSiblingsSizeInBytes: scala.Double = js.native
  /** Gets the number of sidecar files that are currently selected to be included in the ImportItemsAsync operation. */
  var selectedSidecarsCount: scala.Double = js.native
  /** Gets the size of the sidecar files that are currently selected to be included in the ImportItemsAsync operation, in bytes. */
  var selectedSidecarsSizeInBytes: scala.Double = js.native
  /** Gets the total number of items that are currently selected to be included in the ImportItemsAsync operation. */
  var selectedTotalCount: scala.Double = js.native
  /** Gets the total size of the all items that are currently selected to be included in the ImportItemsAsync operation, in bytes. */
  var selectedTotalSizeInBytes: scala.Double = js.native
  /** Gets the number of videos that are currently selected to be included in the ImportItemsAsync operation. */
  var selectedVideosCount: scala.Double = js.native
  /** Gets the size of the videos that are currently selected to be included in the ImportItemsAsync operation, in bytes. */
  var selectedVideosSizeInBytes: scala.Double = js.native
  /** Gets the photo import session associated with the find operation. */
  var session: PhotoImportSession = js.native
  /** Gets the number of sibling files found on the source. */
  var siblingsCount: scala.Double = js.native
  /** Gets the size of the found sibling files, in bytes. */
  var siblingsSizeInBytes: scala.Double = js.native
  /** Gets the number of sidecar files found on the source. */
  var sidecarsCount: scala.Double = js.native
  /** Gets the size of the found sidecar files, in bytes. */
  var sidecarsSizeInBytes: scala.Double = js.native
  /** Gets the total number of items found on the source. */
  var totalCount: scala.Double = js.native
  /** Gets the total size of all items found on the source, in bytes. */
  var totalSizeInBytes: scala.Double = js.native
  /** Gets the number of videos found on the source. */
  var videosCount: scala.Double = js.native
  /** Gets the size of the videos found on the source, in bytes. */
  var videosSizeInBytes: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemimported(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.itemimported,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PhotoImportFindItemsResult, PhotoImportItemImportedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.selectionchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PhotoImportFindItemsResult, PhotoImportSelectionChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Asynchronously imports the selected items from the source.
    * @return An asynchronous operation that returns a PhotoImportImportItemsResult on successful completion.
    */
  def importItemsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[PhotoImportImportItemsResult, PhotoImportProgress] = js.native
  /** Occurs when an item is imported. */
  def onitemimported(
    ev: PhotoImportItemImportedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PhotoImportFindItemsResult]
  ): scala.Unit = js.native
  /** Occurs when the set of items selected to be included in the ImportItemsAsync operation changes. */
  def onselectionchanged(
    ev: PhotoImportSelectionChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PhotoImportFindItemsResult]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_itemimported(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.itemimported,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PhotoImportFindItemsResult, PhotoImportItemImportedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.selectionchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PhotoImportFindItemsResult, PhotoImportSelectionChangedEventArgs]
  ): scala.Unit = js.native
  /** Selects all items found on the source to be included in the ImportItemsAsync operation. */
  def selectAll(): scala.Unit = js.native
  /**
    * Selects all new items found on the source to be included in the ImportItemsAsync operation.
    * @return An asynchronous operation.
    */
  def selectNewAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Deselects all items found on the source, preventing them from being included in the ImportItemsAsync operation. */
  def selectNone(): scala.Unit = js.native
  /**
    * Sets the photo import mode that determines which types of files are included in the ImportItemsAsync operation.
    * @param value The photo import mode.
    */
  def setImportMode(value: PhotoImportImportMode): scala.Unit = js.native
}

