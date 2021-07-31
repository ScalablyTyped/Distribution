package typings.vsoNodeApi.notificationInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationStatistic extends StObject {
  
  var date: Date
  
  var hitCount: Double
  
  var path: String
  
  var `type`: NotificationStatisticType
  
  var user: IdentityRef
}
object NotificationStatistic {
  
  @scala.inline
  def apply(date: Date, hitCount: Double, path: String, `type`: NotificationStatisticType, user: IdentityRef): NotificationStatistic = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], hitCount = hitCount.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationStatistic]
  }
  
  @scala.inline
  implicit class NotificationStatisticMutableBuilder[Self <: NotificationStatistic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitCount(value: Double): Self = StObject.set(x, "hitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NotificationStatisticType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: IdentityRef): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
