package typings.vsoNodeApi.notificationInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationStatisticsQueryConditions extends StObject {
  
  var endDate: Date
  
  var hitCountMinimum: Double
  
  var path: String
  
  var startDate: Date
  
  var `type`: NotificationStatisticType
  
  var user: IdentityRef
}
object NotificationStatisticsQueryConditions {
  
  @scala.inline
  def apply(
    endDate: Date,
    hitCountMinimum: Double,
    path: String,
    startDate: Date,
    `type`: NotificationStatisticType,
    user: IdentityRef
  ): NotificationStatisticsQueryConditions = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], hitCountMinimum = hitCountMinimum.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationStatisticsQueryConditions]
  }
  
  @scala.inline
  implicit class NotificationStatisticsQueryConditionsMutableBuilder[Self <: NotificationStatisticsQueryConditions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitCountMinimum(value: Double): Self = StObject.set(x, "hitCountMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NotificationStatisticType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: IdentityRef): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
