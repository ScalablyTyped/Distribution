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
    val __obj = js.Dynamic.literal(conditionType = conditionType, field = field, value = value)
  
    __obj.asInstanceOf[RuleConditionModel]
  }
}

