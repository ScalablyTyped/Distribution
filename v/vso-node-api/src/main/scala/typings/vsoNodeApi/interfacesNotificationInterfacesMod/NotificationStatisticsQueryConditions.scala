package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationStatisticsQueryConditions extends StObject {
  
  var endDate: js.Date
  
  var hitCountMinimum: Double
  
  var path: String
  
  var startDate: js.Date
  
  var `type`: NotificationStatisticType
  
  var user: IdentityRef
}
object NotificationStatisticsQueryConditions {
  
  inline def apply(
    endDate: js.Date,
    hitCountMinimum: Double,
    path: String,
    startDate: js.Date,
    `type`: NotificationStatisticType,
    user: IdentityRef
  ): NotificationStatisticsQueryConditions = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], hitCountMinimum = hitCountMinimum.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationStatisticsQueryConditions]
  }
  
  extension [Self <: NotificationStatisticsQueryConditions](x: Self) {
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setHitCountMinimum(value: Double): Self = StObject.set(x, "hitCountMinimum", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setType(value: NotificationStatisticType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser(value: IdentityRef): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
