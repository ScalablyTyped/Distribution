package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseCondition extends Condition {
  var result: Boolean
}

object ReleaseCondition {
  @scala.inline
  def apply(conditionType: ConditionType, name: String, result: Boolean, value: String): ReleaseCondition = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseCondition]
  }
}

