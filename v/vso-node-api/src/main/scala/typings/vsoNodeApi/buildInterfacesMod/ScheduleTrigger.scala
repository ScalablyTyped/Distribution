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
  
  @scala.inline
  def apply(schedules: js.Array[Schedule], triggerType: DefinitionTriggerType): ScheduleTrigger = {
    val __obj = js.Dynamic.literal(schedules = schedules.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleTrigger]
  }
  
  @scala.inline
  implicit class ScheduleTriggerMutableBuilder[Self <: ScheduleTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchedules(value: js.Array[Schedule]): Self = StObject.set(x, "schedules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedulesVarargs(value: Schedule*): Self = StObject.set(x, "schedules", js.Array(value :_*))
  }
}
