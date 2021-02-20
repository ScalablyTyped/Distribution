package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationStatisticsQuery extends StObject {
  
  var conditions: js.Array[NotificationStatisticsQueryConditions] = js.native
}
object NotificationStatisticsQuery {
  
  @scala.inline
  def apply(conditions: js.Array[NotificationStatisticsQueryConditions]): NotificationStatisticsQuery = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationStatisticsQuery]
  }
  
  @scala.inline
  implicit class NotificationStatisticsQueryMutableBuilder[Self <: NotificationStatisticsQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditions(value: js.Array[NotificationStatisticsQueryConditions]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: NotificationStatisticsQueryConditions*): Self = StObject.set(x, "conditions", js.Array(value :_*))
  }
}
