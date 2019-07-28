package typings.vegaDashLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameRole extends js.Object {
  var name: String
  var role: String
  var title: Anon_Encode | Anon_OffsetOrient
  var `type`: String
}

object Anon_NameRole {
  @scala.inline
  def apply(name: String, role: String, title: Anon_Encode | Anon_OffsetOrient, `type`: String): Anon_NameRole = {
    val __obj = js.Dynamic.literal(name = name, role = role, title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_NameRole]
  }
}

