package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldRuleModel extends js.Object {
  var actions: js.Array[RuleActionModel]
  var conditions: js.Array[RuleConditionModel]
  var friendlyName: java.lang.String
  var id: java.lang.String
  var isDisabled: scala.Boolean
  var isSystem: scala.Boolean
}

object FieldRuleModel {
  @scala.inline
  def apply(
    actions: js.Array[RuleActionModel],
    conditions: js.Array[RuleConditionModel],
    friendlyName: java.lang.String,
    id: java.lang.String,
    isDisabled: scala.Boolean,
    isSystem: scala.Boolean
  ): FieldRuleModel = {
    val __obj = js.Dynamic.literal(actions = actions, conditions = conditions, friendlyName = friendlyName, id = id, isDisabled = isDisabled, isSystem = isSystem)
  
    __obj.asInstanceOf[FieldRuleModel]
  }
}

