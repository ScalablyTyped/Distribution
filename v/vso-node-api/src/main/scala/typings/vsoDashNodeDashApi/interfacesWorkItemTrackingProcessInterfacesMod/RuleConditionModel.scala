package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleConditionModel extends js.Object {
  var conditionType: String
  var field: String
  var value: String
}

object RuleConditionModel {
  @scala.inline
  def apply(conditionType: String, field: String, value: String): RuleConditionModel = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RuleConditionModel]
  }
}

