package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a system condition that must be in effect for a background task to run. */
trait SystemCondition extends js.Object {
  /** Gets the condition type of a system condition. */
  var conditionType: SystemConditionType
}

object SystemCondition {
  @scala.inline
  def apply(conditionType: SystemConditionType): SystemCondition = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemCondition]
  }
}

