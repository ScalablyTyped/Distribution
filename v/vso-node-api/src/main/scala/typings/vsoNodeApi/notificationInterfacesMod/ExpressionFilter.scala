package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressionFilter extends BaseSubscriptionFilter {
  
  var criteria: ExpressionFilterModel = js.native
}
object ExpressionFilter {
  
  @scala.inline
  def apply(criteria: ExpressionFilterModel, eventType: String, `type`: String): ExpressionFilter = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionFilter]
  }
  
  @scala.inline
  implicit class ExpressionFilterMutableBuilder[Self <: ExpressionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCriteria(value: ExpressionFilterModel): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
  }
}
