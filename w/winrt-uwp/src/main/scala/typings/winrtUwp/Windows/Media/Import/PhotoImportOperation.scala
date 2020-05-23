package typings.winrtUwp.Windows.Media.Import

import typings.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an in-progress photo import operation. */
trait PhotoImportOperation extends js.Object {
  /** Causes in-progress delete from source operations to continue. */
  var continueDeletingImportedItemsFromSourceAsync: IAsyncOperationWithProgress[PhotoImportDeleteImportedItemsFromSourceResult, Double]
  /** Causes in-progress find operations to continue. */
  var continueFindingItemsAsync: IAsyncOperationWithProgress[PhotoImportFindItemsResult, Double]
  /** Causes in-progress import items operations to continue. */
  var continueImportingItemsAsync: IAsyncOperationWithProgress[PhotoImportImportItemsResult, PhotoImportProgress]
  /** Gets the photo import session associated with the operation. */
  var session: PhotoImportSession
  /** Gets the current stage of the in-progress operation. */
  var stage: PhotoImportStage
}

object PhotoImportOperation {
  @scala.inline
  def apply(
    continueDeletingImportedItemsFromSourceAsync: IAsyncOperationWithProgress[PhotoImportDeleteImportedItemsFromSourceResult, Double],
    continueFindingItemsAsync: IAsyncOperationWithProgress[PhotoImportFindItemsResult, Double],
    continueImportingItemsAsync: IAsyncOperationWithProgress[PhotoImportImportItemsResult, PhotoImportProgress],
    session: PhotoImportSession,
    stage: PhotoImportStage
  ): PhotoImportOperation = {
    val __obj = js.Dynamic.literal(continueDeletingImportedItemsFromSourceAsync = continueDeletingImportedItemsFromSourceAsync.asInstanceOf[js.Any], continueFindingItemsAsync = continueFindingItemsAsync.asInstanceOf[js.Any], continueImportingItemsAsync = continueImportingItemsAsync.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportOperation]
  }
}

