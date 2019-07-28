package typings.vegaDashLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameRoleType extends js.Object {
  var name: String
  var role: String
  var `type`: String
}

object Anon_NameRoleType {
  @scala.inline
  def apply(name: String, role: String, `type`: String): Anon_NameRoleType = {
    val __obj = js.Dynamic.literal(name = name, role = role)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_NameRoleType]
  }
}

