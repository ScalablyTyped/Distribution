package typings
package sweDashValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sex extends js.Object {
  var sex: java.lang.String
  var ssn: java.lang.String
  var `type`: java.lang.String
}

object Anon_Sex {
  @scala.inline
  def apply(sex: java.lang.String, ssn: java.lang.String, `type`: java.lang.String): Anon_Sex = {
    val __obj = js.Dynamic.literal(sex = sex, ssn = ssn)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Sex]
  }
}

