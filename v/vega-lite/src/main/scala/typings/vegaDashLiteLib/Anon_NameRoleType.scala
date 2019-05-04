package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameRoleType extends js.Object {
  var name: java.lang.String
  var role: java.lang.String
  var `type`: java.lang.String
}

object Anon_NameRoleType {
  @scala.inline
  def apply(name: java.lang.String, role: java.lang.String, `type`: java.lang.String): Anon_NameRoleType = {
    val __obj = js.Dynamic.literal(name = name, role = role)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_NameRoleType]
  }
}

