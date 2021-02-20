package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeInheritedDefinitionsOnly extends StObject {
  
  var includeInheritedDefinitionsOnly: scala.Double = js.native
  
  var includeLastUserAccess: scala.Double = js.native
  
  var includeNonInheritedDefinitionsOnly: scala.Double = js.native
  
  var includeServices: scala.Double = js.native
  
  var none: scala.Double = js.native
}
object IncludeInheritedDefinitionsOnly {
  
  @scala.inline
  def apply(
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
  implicit class IncludeInheritedDefinitionsOnlyMutableBuilder[Self <: IncludeInheritedDefinitionsOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeInheritedDefinitionsOnly(value: scala.Double): Self = StObject.set(x, "includeInheritedDefinitionsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLastUserAccess(value: scala.Double): Self = StObject.set(x, "includeLastUserAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNonInheritedDefinitionsOnly(value: scala.Double): Self = StObject.set(x, "includeNonInheritedDefinitionsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeServices(value: scala.Double): Self = StObject.set(x, "includeServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
