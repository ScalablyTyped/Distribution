package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contains extends StObject {
  
  var contains: scala.Double
  
  var exact: scala.Double
  
  var startsWith: scala.Double
}
object Contains {
  
  inline def apply(contains: scala.Double, exact: scala.Double, startsWith: scala.Double): Contains = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contains]
  }
  
  extension [Self <: Contains](x: Self) {
    
    inline def setContains(value: scala.Double): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setExact(value: scala.Double): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setStartsWith(value: scala.Double): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
  }
}
