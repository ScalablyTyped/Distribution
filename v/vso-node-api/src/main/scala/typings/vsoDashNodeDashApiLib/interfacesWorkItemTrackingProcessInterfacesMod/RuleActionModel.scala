package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleActionModel extends js.Object {
  var actionType: java.lang.String
  var targetField: java.lang.String
  var value: java.lang.String
}

object RuleActionModel {
  @scala.inline
  def apply(actionType: java.lang.String, targetField: java.lang.String, value: java.lang.String): RuleActionModel = {
    val __obj = js.Dynamic.literal(actionType = actionType, targetField = targetField, value = value)
  
    __obj.asInstanceOf[RuleActionModel]
  }
}

