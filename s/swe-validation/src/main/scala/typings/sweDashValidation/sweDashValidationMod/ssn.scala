package typings.sweDashValidation.sweDashValidationMod

import typings.sweDashValidation.Anon_Sex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ssn extends js.Object {
  var isValid: Boolean
  var person: js.UndefOr[Anon_Sex] = js.undefined
}

object ssn {
  @scala.inline
  def apply(isValid: Boolean, person: Anon_Sex = null): ssn = {
    val __obj = js.Dynamic.literal(isValid = isValid)
    if (person != null) __obj.updateDynamic("person")(person)
    __obj.asInstanceOf[ssn]
  }
}

