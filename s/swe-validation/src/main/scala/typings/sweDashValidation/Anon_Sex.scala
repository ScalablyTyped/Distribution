package typings.sweDashValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sex extends js.Object {
  var sex: String
  var ssn: String
  var `type`: String
}

object Anon_Sex {
  @scala.inline
  def apply(sex: String, ssn: String, `type`: String): Anon_Sex = {
    val __obj = js.Dynamic.literal(sex = sex, ssn = ssn)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Sex]
  }
}

