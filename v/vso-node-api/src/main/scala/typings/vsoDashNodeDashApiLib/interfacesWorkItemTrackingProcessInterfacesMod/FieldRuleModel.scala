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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actions")(actions)
    __obj.updateDynamic("conditions")(conditions)
    __obj.updateDynamic("friendlyName")(friendlyName)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isDisabled")(isDisabled)
    __obj.updateDynamic("isSystem")(isSystem)
    __obj.asInstanceOf[FieldRuleModel]
  }
}

