package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(isValid = isValid, reason = reason, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InputValidationItem]
  }
}

