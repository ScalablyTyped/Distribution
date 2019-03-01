package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISystemCondition extends IBackgroundCondition {
  var conditionType: SystemConditionType
}

object ISystemCondition {
  @scala.inline
  def apply(conditionType: SystemConditionType): ISystemCondition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("conditionType")(conditionType)
    __obj.asInstanceOf[ISystemCondition]
  }
}

