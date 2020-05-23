package typings.sweValidation.mod

import typings.sweValidation.anon.Sex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ssn extends js.Object {
  var isValid: Boolean
  var person: js.UndefOr[Sex] = js.undefined
}

object ssn {
  @scala.inline
  def apply(isValid: Boolean, person: Sex = null): ssn = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
    if (person != null) __obj.updateDynamic("person")(person.asInstanceOf[js.Any])
    __obj.asInstanceOf[ssn]
  }
}

