package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISystemConditionFactory extends js.Object {
  def create(conditionType: SystemConditionType): SystemCondition
}

object ISystemConditionFactory {
  @scala.inline
  def apply(create: js.Function1[SystemConditionType, SystemCondition]): ISystemConditionFactory = {
    val __obj = js.Dynamic.literal(create = create)
  
    __obj.asInstanceOf[ISystemConditionFactory]
  }
}

