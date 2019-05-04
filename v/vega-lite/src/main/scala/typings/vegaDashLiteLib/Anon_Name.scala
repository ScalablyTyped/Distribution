package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var role: java.lang.String
  var title: Anon_Offset
  var `type`: java.lang.String
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, role: java.lang.String, title: Anon_Offset, `type`: java.lang.String): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, role = role, title = title)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Name]
  }
}

