package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableValue extends js.Object {
  var isSecret: Boolean
  var value: String
}

object VariableValue {
  @scala.inline
  def apply(isSecret: Boolean, value: String): VariableValue = {
    val __obj = js.Dynamic.literal(isSecret = isSecret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VariableValue]
  }
}

