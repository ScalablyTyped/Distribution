package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapacityPatch extends js.Object {
  var activities: js.Array[Activity]
  var daysOff: js.Array[DateRange]
}

object CapacityPatch {
  @scala.inline
  def apply(activities: js.Array[Activity], daysOff: js.Array[DateRange]): CapacityPatch = {
    val __obj = js.Dynamic.literal(activities = activities.asInstanceOf[js.Any], daysOff = daysOff.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CapacityPatch]
  }
}

