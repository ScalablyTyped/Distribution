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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[InputValidationItem]
  }
}

