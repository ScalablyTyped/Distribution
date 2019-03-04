package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleTrigger extends BuildTrigger {
  var schedules: js.Array[Schedule]
}

object ScheduleTrigger {
  @scala.inline
  def apply(schedules: js.Array[Schedule], triggerType: DefinitionTriggerType): ScheduleTrigger = {
    val __obj = js.Dynamic.literal(schedules = schedules, triggerType = triggerType)
  
    __obj.asInstanceOf[ScheduleTrigger]
  }
}

