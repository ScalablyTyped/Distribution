package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemCondition extends ISystemCondition

object SystemCondition {
  @scala.inline
  def apply(conditionType: SystemConditionType): SystemCondition = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemCondition]
  }
}

