package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseCondition extends Condition {
  var result: scala.Boolean
}

object ReleaseCondition {
  @scala.inline
  def apply(
    conditionType: ConditionType,
    name: java.lang.String,
    result: scala.Boolean,
    value: java.lang.String
  ): ReleaseCondition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("conditionType")(conditionType)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ReleaseCondition]
  }
}

