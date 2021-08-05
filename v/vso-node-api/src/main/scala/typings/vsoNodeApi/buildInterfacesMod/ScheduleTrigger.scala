package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleTrigger
  extends StObject
     with BuildTrigger {
  
  var schedules: js.Array[Schedule]
}
object ScheduleTrigger {
  
  inline def apply(schedules: js.Array[Schedule], triggerType: DefinitionTriggerType): ScheduleTrigger = {
    val __obj = js.Dynamic.literal(schedules = schedules.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleTrigger]
  }
  
  extension [Self <: ScheduleTrigger](x: Self) {
    
    inline def setSchedules(value: js.Array[Schedule]): Self = StObject.set(x, "schedules", value.asInstanceOf[js.Any])
    
    inline def setSchedulesVarargs(value: Schedule*): Self = StObject.set(x, "schedules", js.Array(value :_*))
  }
}
