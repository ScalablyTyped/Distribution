package typings.yelpFusionPlus.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessesSearchResponse
  extends StObject
     with _BusinessesSearchResponse {
  
  var businesses: js.UndefOr[js.Array[Business]] = js.undefined
}
object BusinessesSearchResponse {
  
  inline def apply(region: Region, total: Double): BusinessesSearchResponse = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessesSearchResponse]
  }
  
  extension [Self <: BusinessesSearchResponse](x: Self) {
    
    inline def setBusinesses(value: js.Array[Business]): Self = StObject.set(x, "businesses", value.asInstanceOf[js.Any])
    
    inline def setBusinessesUndefined: Self = StObject.set(x, "businesses", js.undefined)
    
    inline def setBusinessesVarargs(value: Business*): Self = StObject.set(x, "businesses", js.Array(value*))
  }
}
