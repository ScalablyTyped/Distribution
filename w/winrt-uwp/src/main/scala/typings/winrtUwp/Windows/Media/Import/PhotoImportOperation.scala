package typings.winrtUwp.Windows.Media.Import

import typings.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an in-progress photo import operation. */
@js.native
trait PhotoImportOperation extends StObject {
  
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
  
  @scala.inline
  implicit class PhotoImportOperationMutableBuilder[Self <: PhotoImportOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinueDeletingImportedItemsFromSourceAsync(value: IAsyncOperationWithProgress[PhotoImportDeleteImportedItemsFromSourceResult, Double]): Self = StObject.set(x, "continueDeletingImportedItemsFromSourceAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueFindingItemsAsync(value: IAsyncOperationWithProgress[PhotoImportFindItemsResult, Double]): Self = StObject.set(x, "continueFindingItemsAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueImportingItemsAsync(value: IAsyncOperationWithProgress[PhotoImportImportItemsResult, PhotoImportProgress]): Self = StObject.set(x, "continueImportingItemsAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: PhotoImportSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: PhotoImportStage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
  }
}
