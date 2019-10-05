package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISystemConditionFactory extends js.Object {
  def create(conditionType: SystemConditionType): SystemCondition
}

object ISystemConditionFactory {
  @scala.inline
  def apply(create: SystemConditionType => SystemCondition): ISystemConditionFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[ISystemConditionFactory]
  }
}

