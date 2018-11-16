package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an in-progress photo import operation. */
@JSGlobal("Windows.Media.Import.PhotoImportOperation")
@js.native
abstract class PhotoImportOperation () extends js.Object {
  /** Causes in-progress delete from source operations to continue. */
  var continueDeletingImportedItemsFromSourceAsync: winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[PhotoImportDeleteImportedItemsFromSourceResult, scala.Double] = js.native
  /** Causes in-progress find operations to continue. */
  var continueFindingItemsAsync: winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[PhotoImportFindItemsResult, scala.Double] = js.native
  /** Causes in-progress import items operations to continue. */
  var continueImportingItemsAsync: winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[PhotoImportImportItemsResult, PhotoImportProgress] = js.native
  /** Gets the photo import session associated with the operation. */
  var session: PhotoImportSession = js.native
  /** Gets the current stage of the in-progress operation. */
  var stage: PhotoImportStage = js.native
}

