package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The progress data for an asynchronous photo import operation. */
trait PhotoImportProgress extends StObject {
  
  /** The number of bytes that have been imported. */
  var bytesImported: Double
  
  /** The current import progress, expressed as a floating point value from 0 to 1. */
  var importProgress: Double
  
  /** The number of items that have been imported. */
  var itemsImported: Double
  
  /** The total number of bytes to be imported. */
  var totalBytesToImport: Double
  
  /** The total number of items to be imported. */
  var totalItemsToImport: Double
}
object PhotoImportProgress {
  
  @scala.inline
  def apply(
    bytesImported: Double,
    importProgress: Double,
    itemsImported: Double,
    totalBytesToImport: Double,
    totalItemsToImport: Double
  ): PhotoImportProgress = {
    val __obj = js.Dynamic.literal(bytesImported = bytesImported.asInstanceOf[js.Any], importProgress = importProgress.asInstanceOf[js.Any], itemsImported = itemsImported.asInstanceOf[js.Any], totalBytesToImport = totalBytesToImport.asInstanceOf[js.Any], totalItemsToImport = totalItemsToImport.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportProgress]
  }
  
  @scala.inline
  implicit class PhotoImportProgressMutableBuilder[Self <: PhotoImportProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesImported(value: Double): Self = StObject.set(x, "bytesImported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportProgress(value: Double): Self = StObject.set(x, "importProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsImported(value: Double): Self = StObject.set(x, "itemsImported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesToImport(value: Double): Self = StObject.set(x, "totalBytesToImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemsToImport(value: Double): Self = StObject.set(x, "totalItemsToImport", value.asInstanceOf[js.Any])
  }
}
