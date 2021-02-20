package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapacityPatch extends StObject {
  
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
  implicit class CapacityPatchMutableBuilder[Self <: CapacityPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivities(value: js.Array[Activity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesVarargs(value: Activity*): Self = StObject.set(x, "activities", js.Array(value :_*))
    
    @scala.inline
    def setDaysOff(value: js.Array[DateRange]): Self = StObject.set(x, "daysOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysOffVarargs(value: DateRange*): Self = StObject.set(x, "daysOff", js.Array(value :_*))
  }
}
