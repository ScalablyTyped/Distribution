package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

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
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isSystem = isSystem.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldRuleModel]
  }
}

