package typings.winrtUwp.global.Windows.Media.Import

import typings.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrtUwp.Windows.Media.Import.PhotoImportProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an in-progress photo import operation. */
@JSGlobal("Windows.Media.Import.PhotoImportOperation")
@js.native
abstract class PhotoImportOperation ()
  extends typings.winrtUwp.Windows.Media.Import.PhotoImportOperation {
  /** Causes in-progress delete from source operations to continue. */
  /* CompleteClass */
  override var continueDeletingImportedItemsFromSourceAsync: IAsyncOperationWithProgress[
    typings.winrtUwp.Windows.Media.Import.PhotoImportDeleteImportedItemsFromSourceResult, 
    Double
  ] = js.native
  /** Causes in-progress find operations to continue. */
  /* CompleteClass */
  override var continueFindingItemsAsync: IAsyncOperationWithProgress[typings.winrtUwp.Windows.Media.Import.PhotoImportFindItemsResult, Double] = js.native
  /** Causes in-progress import items operations to continue. */
  /* CompleteClass */
  override var continueImportingItemsAsync: IAsyncOperationWithProgress[
    typings.winrtUwp.Windows.Media.Import.PhotoImportImportItemsResult, 
    PhotoImportProgress
  ] = js.native
  /** Gets the photo import session associated with the operation. */
  /* CompleteClass */
  override var session: typings.winrtUwp.Windows.Media.Import.PhotoImportSession = js.native
  /** Gets the current stage of the in-progress operation. */
  /* CompleteClass */
  override var stage: typings.winrtUwp.Windows.Media.Import.PhotoImportStage = js.native
}

