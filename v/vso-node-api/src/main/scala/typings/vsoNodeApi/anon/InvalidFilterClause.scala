package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidFilterClause extends StObject {
  
  var invalidFilterClause: scala.Double
  
  var oK: scala.Double
  
  var unknown: scala.Double
}
object InvalidFilterClause {
  
  inline def apply(invalidFilterClause: scala.Double, oK: scala.Double, unknown: scala.Double): InvalidFilterClause = {
    val __obj = js.Dynamic.literal(invalidFilterClause = invalidFilterClause.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidFilterClause]
  }
  
  extension [Self <: InvalidFilterClause](x: Self) {
    
    inline def setInvalidFilterClause(value: scala.Double): Self = StObject.set(x, "invalidFilterClause", value.asInstanceOf[js.Any])
    
    inline def setOK(value: scala.Double): Self = StObject.set(x, "oK", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: scala.Double): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
  }
}
