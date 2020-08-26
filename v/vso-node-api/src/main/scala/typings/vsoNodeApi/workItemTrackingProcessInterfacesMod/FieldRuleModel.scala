package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldRuleModel extends js.Object {
  var actions: js.Array[RuleActionModel] = js.native
  var conditions: js.Array[RuleConditionModel] = js.native
  var friendlyName: String = js.native
  var id: String = js.native
  var isDisabled: Boolean = js.native
  var isSystem: Boolean = js.native
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
  @scala.inline
  implicit class FieldRuleModelOps[Self <: FieldRuleModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionsVarargs(value: RuleActionModel*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[RuleActionModel]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditionsVarargs(value: RuleConditionModel*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[RuleConditionModel]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSystem(value: Boolean): Self = this.set("isSystem", value.asInstanceOf[js.Any])
  }
  
}

