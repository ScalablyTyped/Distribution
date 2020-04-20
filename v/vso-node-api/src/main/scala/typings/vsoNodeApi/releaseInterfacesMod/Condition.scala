package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  /**
    * Gets or sets the condition type.
    */
  var conditionType: ConditionType
  /**
    * Gets or sets the name of the condition. e.g. 'ReleaseStarted'.
    */
  var name: String
  /**
    * Gets or set value of the condition.
    */
  var value: String
}

object Condition {
  @scala.inline
  def apply(conditionType: ConditionType, name: String, value: String): Condition = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

