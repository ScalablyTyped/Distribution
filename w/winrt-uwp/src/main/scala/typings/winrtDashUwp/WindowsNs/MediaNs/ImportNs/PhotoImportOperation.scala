package typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an in-progress photo import operation. */
@JSGlobal("Windows.Media.Import.PhotoImportOperation")
@js.native
abstract class PhotoImportOperation () extends js.Object {
  /** Causes in-progress delete from source operations to continue. */
  var continueDeletingImportedItemsFromSourceAsync: IAsyncOperationWithProgress[PhotoImportDeleteImportedItemsFromSourceResult, Double] = js.native
  /** Causes in-progress find operations to continue. */
  var continueFindingItemsAsync: IAsyncOperationWithProgress[PhotoImportFindItemsResult, Double] = js.native
  /** Causes in-progress import items operations to continue. */
  var continueImportingItemsAsync: IAsyncOperationWithProgress[PhotoImportImportItemsResult, PhotoImportProgress] = js.native
  /** Gets the photo import session associated with the operation. */
  var session: PhotoImportSession = js.native
  /** Gets the current stage of the in-progress operation. */
  var stage: PhotoImportStage = js.native
}

