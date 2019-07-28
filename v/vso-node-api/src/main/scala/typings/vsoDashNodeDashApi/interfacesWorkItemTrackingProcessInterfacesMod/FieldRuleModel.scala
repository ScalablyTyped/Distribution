package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldRuleModel extends js.Object {
  var actions: js.Array[RuleActionModel]
  var conditions: js.Array[RuleConditionModel]
  var friendlyName: String
  var id: String
  var isDisabled: Boolean
  var isSystem: Boolean
}

object FieldRuleModel {
  @scala.inline
  def apply(
    actions: js.Array[RuleActionModel],
    conditions: js.Array[RuleConditionModel],
    friendlyName: String,
    id: String,
    isDisabled: Boolean,
    isSystem: Boolean
  ): FieldRuleModel = {
    val __obj = js.Dynamic.literal(actions = actions, conditions = conditions, friendlyName = friendlyName, id = id, isDisabled = isDisabled, isSystem = isSystem)
  
    __obj.asInstanceOf[FieldRuleModel]
  }
}

