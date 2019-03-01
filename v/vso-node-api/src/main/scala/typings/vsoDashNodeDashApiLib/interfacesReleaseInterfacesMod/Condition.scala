package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  /**
    * Gets or sets the condition type.
    */
  var conditionType: ConditionType
  /**
    * Gets or sets the name of the condition. e.g. 'ReleaseStarted'.
    */
  var name: java.lang.String
  /**
    * Gets or set value of the condition.
    */
  var value: java.lang.String
}

object Condition {
  @scala.inline
  def apply(conditionType: ConditionType, name: java.lang.String, value: java.lang.String): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("conditionType")(conditionType)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Condition]
  }
}

