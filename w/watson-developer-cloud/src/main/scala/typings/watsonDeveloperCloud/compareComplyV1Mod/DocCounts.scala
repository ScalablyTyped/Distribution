package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Document counts. */
trait DocCounts extends StObject {
  
  /** Number of documents not successfully processed. */
  var failed: js.UndefOr[Double] = js.undefined
  
  /** Number of pending documents. */
  var pending: js.UndefOr[Double] = js.undefined
  
  /** Number of documents successfully processed. */
  var successful: js.UndefOr[Double] = js.undefined
  
  /** Total number of documents. */
  var total: js.UndefOr[Double] = js.undefined
}
object DocCounts {
  
  inline def apply(): DocCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocCounts]
  }
  
  extension [Self <: DocCounts](x: Self) {
    
    inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
    
    inline def setSuccessful(value: Double): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulUndefined: Self = StObject.set(x, "successful", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
