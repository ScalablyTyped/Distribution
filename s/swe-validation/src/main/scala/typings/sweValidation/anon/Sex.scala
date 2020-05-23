package typings.sweValidation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sex extends js.Object {
  var sex: String
  var ssn: String
  var `type`: String
}

object Sex {
  @scala.inline
  def apply(sex: String, ssn: String, `type`: String): Sex = {
    val __obj = js.Dynamic.literal(sex = sex.asInstanceOf[js.Any], ssn = ssn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sex]
  }
}

