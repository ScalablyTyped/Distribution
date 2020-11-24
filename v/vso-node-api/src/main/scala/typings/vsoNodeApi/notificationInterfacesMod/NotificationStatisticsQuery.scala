package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationStatisticsQuery extends js.Object {
  
  var conditions: js.Array[NotificationStatisticsQueryConditions] = js.native
}
object NotificationStatisticsQuery {
  
  @scala.inline
  def apply(conditions: js.Array[NotificationStatisticsQueryConditions]): NotificationStatisticsQuery = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationStatisticsQuery]
  }
  
  @scala.inline
  implicit class NotificationStatisticsQueryOps[Self <: NotificationStatisticsQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConditionsVarargs(value: NotificationStatisticsQueryConditions*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[NotificationStatisticsQueryConditions]): Self = this.set("conditions", value.asInstanceOf[js.Any])
  }
}
