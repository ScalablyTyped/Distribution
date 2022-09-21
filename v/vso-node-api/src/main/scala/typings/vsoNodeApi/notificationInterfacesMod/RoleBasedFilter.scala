package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleBasedFilter
  extends StObject
     with ExpressionFilter {
  
  var exclusions: js.Array[String]
  
  var inclusions: js.Array[String]
}
object RoleBasedFilter {
  
  inline def apply(
    criteria: ExpressionFilterModel,
    eventType: String,
    exclusions: js.Array[String],
    inclusions: js.Array[String],
    `type`: String
  ): RoleBasedFilter = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], exclusions = exclusions.asInstanceOf[js.Any], inclusions = inclusions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleBasedFilter]
  }
  
  extension [Self <: RoleBasedFilter](x: Self) {
    
    inline def setExclusions(value: js.Array[String]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    inline def setExclusionsVarargs(value: String*): Self = StObject.set(x, "exclusions", js.Array(value*))
    
    inline def setInclusions(value: js.Array[String]): Self = StObject.set(x, "inclusions", value.asInstanceOf[js.Any])
    
    inline def setInclusionsVarargs(value: String*): Self = StObject.set(x, "inclusions", js.Array(value*))
  }
}
