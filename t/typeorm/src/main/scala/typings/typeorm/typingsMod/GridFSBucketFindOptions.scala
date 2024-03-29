package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFSBucketFindOptions extends StObject {
  
  /**
    * Optional batch size for cursor.
    */
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Optional limit for cursor.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Optional maxTimeMS for cursor.
    */
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Optionally set cursor's noCursorTimeout flag.
    */
  var noCursorTimeout: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional skip for cursor.
    */
  var skip: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Optional sort for cursor.
    */
  var sort: js.UndefOr[js.Object] = js.undefined
}
object GridFSBucketFindOptions {
  
  inline def apply(): GridFSBucketFindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketFindOptions]
  }
  
  extension [Self <: GridFSBucketFindOptions](x: Self) {
    
    inline def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMaxTimeMS(value: scala.Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    inline def setNoCursorTimeout(value: Boolean): Self = StObject.set(x, "noCursorTimeout", value.asInstanceOf[js.Any])
    
    inline def setNoCursorTimeoutUndefined: Self = StObject.set(x, "noCursorTimeout", js.undefined)
    
    inline def setSkip(value: scala.Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSort(value: js.Object): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
