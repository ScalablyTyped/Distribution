package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityPatch extends StObject {
  
  var activities: js.Array[Activity]
  
  var daysOff: js.Array[DateRange]
}
object CapacityPatch {
  
  inline def apply(activities: js.Array[Activity], daysOff: js.Array[DateRange]): CapacityPatch = {
    val __obj = js.Dynamic.literal(activities = activities.asInstanceOf[js.Any], daysOff = daysOff.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityPatch]
  }
  
  extension [Self <: CapacityPatch](x: Self) {
    
    inline def setActivities(value: js.Array[Activity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesVarargs(value: Activity*): Self = StObject.set(x, "activities", js.Array(value :_*))
    
    inline def setDaysOff(value: js.Array[DateRange]): Self = StObject.set(x, "daysOff", value.asInstanceOf[js.Any])
    
    inline def setDaysOffVarargs(value: DateRange*): Self = StObject.set(x, "daysOff", js.Array(value :_*))
  }
}
