package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValidationItem extends js.Object {
  var isValid: scala.Boolean
  var reason: java.lang.String
  var `type`: java.lang.String
  var value: java.lang.String
}

object InputValidationItem {
  @scala.inline
  def apply(
    isValid: scala.Boolean,
    reason: java.lang.String,
    `type`: java.lang.String,
    value: java.lang.String
  ): InputValidationItem = {
    val __obj = js.Dynamic.literal(isValid = isValid, reason = reason, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InputValidationItem]
  }
}

