package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DocumentCounts. */
trait DocumentCounts extends StObject {
  
  /** The total number of available documents in the collection. */
  var available: js.UndefOr[Double] = js.undefined
  
  /** The number of documents in the collection that failed to be ingested. */
  var failed: js.UndefOr[Double] = js.undefined
  
  /** The number of documents that have been uploaded to the collection, but have not yet started processing. */
  var pending: js.UndefOr[Double] = js.undefined
  
  /** The number of documents in the collection that are currently being processed. */
  var processing: js.UndefOr[Double] = js.undefined
}
object DocumentCounts {
  
  @scala.inline
  def apply(): DocumentCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentCounts]
  }
  
  @scala.inline
  implicit class DocumentCountsMutableBuilder[Self <: DocumentCounts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Double): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    @scala.inline
    def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    @scala.inline
    def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
    
    @scala.inline
    def setProcessing(value: Double): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingUndefined: Self = StObject.set(x, "processing", js.undefined)
  }
}
