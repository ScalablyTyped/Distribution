package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseCondition extends Condition {
  var result: Boolean
}

object ReleaseCondition {
  @scala.inline
  def apply(conditionType: ConditionType, name: String, result: Boolean, value: String): ReleaseCondition = {
    val __obj = js.Dynamic.literal(conditionType = conditionType, name = name, result = result, value = value)
  
    __obj.asInstanceOf[ReleaseCondition]
  }
}

