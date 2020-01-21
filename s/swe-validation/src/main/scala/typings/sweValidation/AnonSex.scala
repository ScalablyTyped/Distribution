package typings.sweValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSex extends js.Object {
  var sex: String
  var ssn: String
  var `type`: String
}

object AnonSex {
  @scala.inline
  def apply(sex: String, ssn: String, `type`: String): AnonSex = {
    val __obj = js.Dynamic.literal(sex = sex.asInstanceOf[js.Any], ssn = ssn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSex]
  }
}

