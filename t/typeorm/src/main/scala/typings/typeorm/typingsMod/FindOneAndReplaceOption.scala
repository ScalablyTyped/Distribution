package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindOneAndReplaceOption extends StObject {
  
  /**
    * The maximum amount of time to allow the query to run.
    */
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Limits the fields to return for all matching documents.
    */
  var projection: js.UndefOr[js.Object] = js.undefined
  
  /**
    * When false, returns the updated document rather than the original. The default is true.
    */
  var returnOriginal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines which document the operation modifies if the query selects multiple documents.
    */
  var sort: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Upsert the document if it does not exist.
    */
  var upsert: js.UndefOr[Boolean] = js.undefined
}
object FindOneAndReplaceOption {
  
  inline def apply(): FindOneAndReplaceOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneAndReplaceOption]
  }
  
  extension [Self <: FindOneAndReplaceOption](x: Self) {
    
    inline def setMaxTimeMS(value: scala.Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    inline def setProjection(value: js.Object): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setReturnOriginal(value: Boolean): Self = StObject.set(x, "returnOriginal", value.asInstanceOf[js.Any])
    
    inline def setReturnOriginalUndefined: Self = StObject.set(x, "returnOriginal", js.undefined)
    
    inline def setSort(value: js.Object): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
