package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionFilter
  extends StObject
     with BaseSubscriptionFilter {
  
  var criteria: ExpressionFilterModel
}
object ExpressionFilter {
  
  inline def apply(criteria: ExpressionFilterModel, eventType: String, `type`: String): ExpressionFilter = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionFilter]
  }
  
  extension [Self <: ExpressionFilter](x: Self) {
    
    inline def setCriteria(value: ExpressionFilterModel): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
  }
}
