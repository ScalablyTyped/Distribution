package typings.winrtUwp.Windows.Media.Import

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of a operation that imports media items from the source. */
@js.native
trait PhotoImportImportItemsResult extends StObject {
  
  /**
    * Asynchronously deletes the items that were imported from the source.
    * @return An asynchronous operation that returns a PhotoImportDeleteImportedItemsFromSourceResult on successful completion.
    */
  def deleteImportedItemsFromSourceAsync(): IPromiseWithIAsyncOperationWithProgress[PhotoImportDeleteImportedItemsFromSourceResult, Double] = js.native
  
  /** Gets a value indicating whether the import operation has succeeded. */
  var hasSucceeded: Boolean = js.native
  
  /** Gets a list of items that were imported from the source. */
  var importedItems: IVectorView[PhotoImportItem] = js.native
  
  /** Gets the number of photos imported in the operation. */
  var photosCount: Double = js.native
  
  /** Gets the size of the imported photos, in bytes. */
  var photosSizeInBytes: Double = js.native
  
  /** Gets the photo import session associated with the import operation. */
  var session: PhotoImportSession = js.native
  
  /** Gets the number of sibling files imported in the operation. */
  var siblingsCount: Double = js.native
  
  /** Gets the size of the imported sidecar files, in bytes. */
  var siblingsSizeInBytes: Double = js.native
  
  /** Gets the number of sidecar files imported in the operation. */
  var sidecarsCount: Double = js.native
  
  /** Gets the size of the imported sidecar files, in bytes. */
  var sidecarsSizeInBytes: Double = js.native
  
  /** Gets the total number of items imported in the operation. */
  var totalCount: Double = js.native
  
  /** Gets the total size of the all imported items, in bytes. */
  var totalSizeInBytes: Double = js.native
  
  /** Gets the number of videos imported in the operation. */
  var videosCount: Double = js.native
  
  /** Gets the size of the imported videos, in bytes. */
  var videosSizeInBytes: Double = js.native
}
object PhotoImportImportItemsResult {
  
  @scala.inline
  def apply(
    deleteImportedItemsFromSourceAsync: () => IPromiseWithIAsyncOperationWithProgress[PhotoImportDeleteImportedItemsFromSourceResult, Double],
    hasSucceeded: Boolean,
    importedItems: IVectorView[PhotoImportItem],
    photosCount: Double,
    photosSizeInBytes: Double,
    session: PhotoImportSession,
    siblingsCount: Double,
    siblingsSizeInBytes: Double,
    sidecarsCount: Double,
    sidecarsSizeInBytes: Double,
    totalCount: Double,
    totalSizeInBytes: Double,
    videosCount: Double,
    videosSizeInBytes: Double
  ): PhotoImportImportItemsResult = {
    val __obj = js.Dynamic.literal(deleteImportedItemsFromSourceAsync = js.Any.fromFunction0(deleteImportedItemsFromSourceAsync), hasSucceeded = hasSucceeded.asInstanceOf[js.Any], importedItems = importedItems.asInstanceOf[js.Any], photosCount = photosCount.asInstanceOf[js.Any], photosSizeInBytes = photosSizeInBytes.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], siblingsCount = siblingsCount.asInstanceOf[js.Any], siblingsSizeInBytes = siblingsSizeInBytes.asInstanceOf[js.Any], sidecarsCount = sidecarsCount.asInstanceOf[js.Any], sidecarsSizeInBytes = sidecarsSizeInBytes.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any], totalSizeInBytes = totalSizeInBytes.asInstanceOf[js.Any], videosCount = videosCount.asInstanceOf[js.Any], videosSizeInBytes = videosSizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportImportItemsResult]
  }
  
  @scala.inline
  implicit class PhotoImportImportItemsResultMutableBuilder[Self <: PhotoImportImportItemsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteImportedItemsFromSourceAsync(
      value: () => IPromiseWithIAsyncOperationWithProgress[PhotoImportDeleteImportedItemsFromSourceResult, Double]
    ): Self = StObject.set(x, "deleteImportedItemsFromSourceAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasSucceeded(value: Boolean): Self = StObject.set(x, "hasSucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportedItems(value: IVectorView[PhotoImportItem]): Self = StObject.set(x, "importedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosCount(value: Double): Self = StObject.set(x, "photosCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosSizeInBytes(value: Double): Self = StObject.set(x, "photosSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: PhotoImportSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiblingsCount(value: Double): Self = StObject.set(x, "siblingsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiblingsSizeInBytes(value: Double): Self = StObject.set(x, "siblingsSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidecarsCount(value: Double): Self = StObject.set(x, "sidecarsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidecarsSizeInBytes(value: Double): Self = StObject.set(x, "sidecarsSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeInBytes(value: Double): Self = StObject.set(x, "totalSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideosCount(value: Double): Self = StObject.set(x, "videosCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideosSizeInBytes(value: Double): Self = StObject.set(x, "videosSizeInBytes", value.asInstanceOf[js.Any])
  }
}
