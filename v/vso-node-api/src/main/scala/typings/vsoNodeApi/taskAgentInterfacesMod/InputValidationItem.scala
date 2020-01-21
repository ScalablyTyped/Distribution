package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValidationItem extends js.Object {
  var isValid: Boolean
  var reason: String
  var `type`: String
  var value: String
}

object InputValidationItem {
  @scala.inline
  def apply(isValid: Boolean, reason: String, `type`: String, value: String): InputValidationItem = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValidationItem]
  }
}

