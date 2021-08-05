package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindOneAndDeleteOptions extends StObject {
  
  /**
    * The maximum amount of time to allow the query to run.
    */
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Limits the fields to return for all matching documents.
    */
  var projection: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Determines which document the operation modifies if the query selects multiple documents.
    */
  var sort: js.UndefOr[js.Object] = js.undefined
}
object FindOneAndDeleteOptions {
  
  inline def apply(): FindOneAndDeleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneAndDeleteOptions]
  }
  
  extension [Self <: FindOneAndDeleteOptions](x: Self) {
    
    inline def setMaxTimeMS(value: scala.Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    inline def setProjection(value: js.Object): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setSort(value: js.Object): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
