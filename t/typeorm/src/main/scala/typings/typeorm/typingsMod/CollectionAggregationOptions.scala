package typings.typeorm.typingsMod

import typings.typeorm.anon.BatchSizeNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionAggregationOptions extends StObject {
  
  /**
    * allowDiskUse lets the server know if it can use disk to store temporary results for the aggregation (requires mongodb 2.6 >).
    */
  var allowDiskUse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow driver to bypass schema validation in MongoDB 3.2 or higher.
    */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Return the query as cursor, on 2.6 > it returns as a real cursor on pre 2.6 it returns as an emulated cursor.
    */
  var cursor: js.UndefOr[BatchSizeNumber] = js.undefined
  
  /**
    * Explain returns the aggregation execution plan (requires mongodb 2.6 >).
    */
  var explain: js.UndefOr[Boolean] = js.undefined
  
  /**
    * maxTimeMS specifies a cumulative time limit in milliseconds for processing operations on the cursor. MongoDB interrupts the operation at the earliest following interrupt point.
    */
  var maxTimeMS: js.UndefOr[Boolean] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreference | String] = js.undefined
}
object CollectionAggregationOptions {
  
  inline def apply(): CollectionAggregationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionAggregationOptions]
  }
  
  extension [Self <: CollectionAggregationOptions](x: Self) {
    
    inline def setAllowDiskUse(value: Boolean): Self = StObject.set(x, "allowDiskUse", value.asInstanceOf[js.Any])
    
    inline def setAllowDiskUseUndefined: Self = StObject.set(x, "allowDiskUse", js.undefined)
    
    inline def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    inline def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    inline def setCursor(value: BatchSizeNumber): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    inline def setMaxTimeMS(value: Boolean): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    inline def setReadPreference(value: ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
