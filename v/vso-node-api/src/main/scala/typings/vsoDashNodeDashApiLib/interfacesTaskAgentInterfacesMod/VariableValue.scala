package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableValue extends js.Object {
  var isSecret: scala.Boolean
  var value: java.lang.String
}

object VariableValue {
  @scala.inline
  def apply(isSecret: scala.Boolean, value: java.lang.String): VariableValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isSecret")(isSecret)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[VariableValue]
  }
}

