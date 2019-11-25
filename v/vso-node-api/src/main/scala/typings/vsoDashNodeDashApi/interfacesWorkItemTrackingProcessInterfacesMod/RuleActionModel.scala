package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleActionModel extends js.Object {
  var actionType: String
  var targetField: String
  var value: String
}

object RuleActionModel {
  @scala.inline
  def apply(actionType: String, targetField: String, value: String): RuleActionModel = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], targetField = targetField.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RuleActionModel]
  }
}

