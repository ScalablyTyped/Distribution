package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxTimeMS extends StObject {
  
  var maxTimeMS: js.UndefOr[Double] = js.undefined
  
  var projection: js.UndefOr[js.Object] = js.undefined
  
  var sort: js.UndefOr[js.Object] = js.undefined
}
object MaxTimeMS {
  
  inline def apply(): MaxTimeMS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxTimeMS]
  }
  
  extension [Self <: MaxTimeMS](x: Self) {
    
    inline def setMaxTimeMS(value: Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    inline def setProjection(value: js.Object): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setSort(value: js.Object): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
