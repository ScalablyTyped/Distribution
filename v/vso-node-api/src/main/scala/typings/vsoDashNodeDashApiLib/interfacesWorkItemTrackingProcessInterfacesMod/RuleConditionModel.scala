package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleConditionModel extends js.Object {
  var conditionType: java.lang.String
  var field: java.lang.String
  var value: java.lang.String
}

object RuleConditionModel {
  @scala.inline
  def apply(conditionType: java.lang.String, field: java.lang.String, value: java.lang.String): RuleConditionModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("conditionType")(conditionType)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RuleConditionModel]
  }
}

