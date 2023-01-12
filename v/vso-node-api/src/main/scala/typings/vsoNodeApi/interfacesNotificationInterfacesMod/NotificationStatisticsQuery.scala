package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationStatisticsQuery extends StObject {
  
  var conditions: js.Array[NotificationStatisticsQueryConditions]
}
object NotificationStatisticsQuery {
  
  inline def apply(conditions: js.Array[NotificationStatisticsQueryConditions]): NotificationStatisticsQuery = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationStatisticsQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationStatisticsQuery] (val x: Self) extends AnyVal {
    
    inline def setConditions(value: js.Array[NotificationStatisticsQueryConditions]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: NotificationStatisticsQueryConditions*): Self = StObject.set(x, "conditions", js.Array(value*))
  }
}
