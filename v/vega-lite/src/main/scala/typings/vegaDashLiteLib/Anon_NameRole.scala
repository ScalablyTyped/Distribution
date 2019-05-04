package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameRole extends js.Object {
  var name: java.lang.String
  var role: java.lang.String
  var title: Anon_Encode | Anon_OffsetOrient
  var `type`: java.lang.String
}

object Anon_NameRole {
  @scala.inline
  def apply(
    name: java.lang.String,
    role: java.lang.String,
    title: Anon_Encode | Anon_OffsetOrient,
    `type`: java.lang.String
  ): Anon_NameRole = {
    val __obj = js.Dynamic.literal(name = name, role = role, title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_NameRole]
  }
}

