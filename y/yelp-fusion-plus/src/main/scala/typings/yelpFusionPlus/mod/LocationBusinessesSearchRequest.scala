package typings.yelpFusionPlus.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationBusinessesSearchRequest
  extends StObject
     with BusinessesSearchRequest {
  
  var location: String
}
object LocationBusinessesSearchRequest {
  
  inline def apply(location: String): LocationBusinessesSearchRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationBusinessesSearchRequest]
  }
  
  extension [Self <: LocationBusinessesSearchRequest](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
