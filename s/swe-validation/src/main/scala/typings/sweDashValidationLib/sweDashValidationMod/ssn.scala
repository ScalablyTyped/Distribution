package typings
package sweDashValidationLib.sweDashValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ssn extends js.Object {
  var isValid: scala.Boolean
  var person: js.UndefOr[sweDashValidationLib.Anon_Sex] = js.undefined
}

object ssn {
  @scala.inline
  def apply(isValid: scala.Boolean, person: sweDashValidationLib.Anon_Sex = null): ssn = {
    val __obj = js.Dynamic.literal(isValid = isValid)
    if (person != null) __obj.updateDynamic("person")(person)
    __obj.asInstanceOf[ssn]
  }
}

