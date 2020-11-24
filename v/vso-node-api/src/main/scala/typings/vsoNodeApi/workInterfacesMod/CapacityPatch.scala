package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapacityPatch extends js.Object {
  
  var activities: js.Array[Activity] = js.native
  
  var daysOff: js.Array[DateRange] = js.native
}
object CapacityPatch {
  
  @scala.inline
  def apply(activities: js.Array[Activity], daysOff: js.Array[DateRange]): CapacityPatch = {
    val __obj = js.Dynamic.literal(activities = activities.asInstanceOf[js.Any], daysOff = daysOff.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityPatch]
  }
  
  @scala.inline
  implicit class CapacityPatchOps[Self <: CapacityPatch] (val x: Self) extends AnyVal {
    
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
    def setActivitiesVarargs(value: Activity*): Self = this.set("activities", js.Array(value :_*))
    
    @scala.inline
    def setActivities(value: js.Array[Activity]): Self = this.set("activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysOffVarargs(value: DateRange*): Self = this.set("daysOff", js.Array(value :_*))
    
    @scala.inline
    def setDaysOff(value: js.Array[DateRange]): Self = this.set("daysOff", value.asInstanceOf[js.Any])
  }
}
