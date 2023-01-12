package typings.winrtUwp.Windows.Media.Import

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.IStorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a photo import session with a photo import source. */
trait PhotoImportSession extends StObject {
  
  /** Gets or sets a value specifying whether the session date should be appended to the destination folder name. */
  var appendSessionDateToDestinationFolder: Boolean
  
  /** Closes the photo import session and releases associated resources. */
  def close(): Unit
  
  /** Gets or sets the prefix for the destination file name. */
  var destinationFileNamePrefix: String
  
  /** Gets or sets the destination folder for the photo import session. */
  var destinationFolder: IStorageFolder
  
  /**
    * Asynchronously finds items on the source device that are available for import.
    * @param contentTypeFilter A value indicating whether the find operation includes images, videos, or both in the results.
    * @param itemSelectionMode A value indicating whether all items, no items, or only new items in the results are initially marked as selected.
    * @return An asynchronous operation that returns a PhotoImportFindItemsResult on successful completion.
    */
  def findItemsAsync(contentTypeFilter: PhotoImportContentTypeFilter, itemSelectionMode: PhotoImportItemSelectionMode): IPromiseWithIAsyncOperationWithProgress[PhotoImportFindItemsResult, Double]
  
  /** Gets a unique identifier for the import session. */
  var sessionId: String
  
  /** Gets an object representing the source device associated with the photo import session. */
  var source: PhotoImportSource
  
  /** Gets or sets a value indicating the method used for naming subfolders within the destination folder. */
  var subfolderCreationMode: PhotoImportSubfolderCreationMode
}
object PhotoImportSession {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: PhotoImportSession] (val x: Self) extends AnyVal {
    
    inline def setAppendSessionDateToDestinationFolder(value: Boolean): Self = StObject.set(x, "appendSessionDateToDestinationFolder", value.asInstanceOf[js.Any])
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setDestinationFileNamePrefix(value: String): Self = StObject.set(x, "destinationFileNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setDestinationFolder(value: IStorageFolder): Self = StObject.set(x, "destinationFolder", value.asInstanceOf[js.Any])
    
    inline def setFindItemsAsync(
      value: (PhotoImportContentTypeFilter, PhotoImportItemSelectionMode) => IPromiseWithIAsyncOperationWithProgress[PhotoImportFindItemsResult, Double]
    ): Self = StObject.set(x, "findItemsAsync", js.Any.fromFunction2(value))
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSource(value: PhotoImportSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSubfolderCreationMode(value: PhotoImportSubfolderCreationMode): Self = StObject.set(x, "subfolderCreationMode", value.asInstanceOf[js.Any])
  }
}
