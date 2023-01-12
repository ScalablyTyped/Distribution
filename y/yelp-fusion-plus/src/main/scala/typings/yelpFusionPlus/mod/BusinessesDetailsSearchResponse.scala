package typings.yelpFusionPlus.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessesDetailsSearchResponse
  extends StObject
     with _BusinessesSearchResponse {
  
  var businesses: js.UndefOr[js.Array[BusinessDetails]] = js.undefined
}
object BusinessesDetailsSearchResponse {
  
  inline def apply(region: Region, total: Double): BusinessesDetailsSearchResponse = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessesDetailsSearchResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BusinessesDetailsSearchResponse] (val x: Self) extends AnyVal {
    
    inline def setBusinesses(value: js.Array[BusinessDetails]): Self = StObject.set(x, "businesses", value.asInstanceOf[js.Any])
    
    inline def setBusinessesUndefined: Self = StObject.set(x, "businesses", js.undefined)
    
    inline def setBusinessesVarargs(value: BusinessDetails*): Self = StObject.set(x, "businesses", js.Array(value*))
  }
}
