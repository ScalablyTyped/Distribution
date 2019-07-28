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
    val __obj = js.Dynamic.literal(actionType = actionType, targetField = targetField, value = value)
  
    __obj.asInstanceOf[RuleActionModel]
  }
}

