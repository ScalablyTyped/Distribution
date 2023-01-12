package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeInheritedDefinitionsOnly extends StObject {
  
  var includeInheritedDefinitionsOnly: scala.Double
  
  var includeLastUserAccess: scala.Double
  
  var includeNonInheritedDefinitionsOnly: scala.Double
  
  var includeServices: scala.Double
  
  var none: scala.Double
}
object IncludeInheritedDefinitionsOnly {
  
  inline def apply(
    includeInheritedDefinitionsOnly: scala.Double,
    includeLastUserAccess: scala.Double,
    includeNonInheritedDefinitionsOnly: scala.Double,
    includeServices: scala.Double,
    none: scala.Double
  ): IncludeInheritedDefinitionsOnly = {
    val __obj = js.Dynamic.literal(includeInheritedDefinitionsOnly = includeInheritedDefinitionsOnly.asInstanceOf[js.Any], includeLastUserAccess = includeLastUserAccess.asInstanceOf[js.Any], includeNonInheritedDefinitionsOnly = includeNonInheritedDefinitionsOnly.asInstanceOf[js.Any], includeServices = includeServices.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeInheritedDefinitionsOnly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeInheritedDefinitionsOnly] (val x: Self) extends AnyVal {
    
    inline def setIncludeInheritedDefinitionsOnly(value: scala.Double): Self = StObject.set(x, "includeInheritedDefinitionsOnly", value.asInstanceOf[js.Any])
    
    inline def setIncludeLastUserAccess(value: scala.Double): Self = StObject.set(x, "includeLastUserAccess", value.asInstanceOf[js.Any])
    
    inline def setIncludeNonInheritedDefinitionsOnly(value: scala.Double): Self = StObject.set(x, "includeNonInheritedDefinitionsOnly", value.asInstanceOf[js.Any])
    
    inline def setIncludeServices(value: scala.Double): Self = StObject.set(x, "includeServices", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
