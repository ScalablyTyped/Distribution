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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actionType")(actionType)
    __obj.updateDynamic("targetField")(targetField)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RuleActionModel]
  }
}

