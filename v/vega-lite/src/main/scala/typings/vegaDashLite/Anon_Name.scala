package typings.vegaDashLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var role: String
  var title: Anon_Offset
  var `type`: String
}

object Anon_Name {
  @scala.inline
  def apply(name: String, role: String, title: Anon_Offset, `type`: String): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, role = role, title = title)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Name]
  }
}

