package typings.yelpFusionPlus.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _BusinessesSearchResponse extends StObject {
  
  var region: Region
  
  var total: Double
}
object _BusinessesSearchResponse {
  
  inline def apply(region: Region, total: Double): _BusinessesSearchResponse = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[_BusinessesSearchResponse]
  }
  
  extension [Self <: _BusinessesSearchResponse](x: Self) {
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
