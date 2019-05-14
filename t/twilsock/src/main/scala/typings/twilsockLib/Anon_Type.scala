package typings
package twilsockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  var `type`: java.lang.String
  var ver: java.lang.String
}

object Anon_Type {
  @scala.inline
  def apply(`type`: java.lang.String, ver: java.lang.String): Anon_Type = {
    val __obj = js.Dynamic.literal(ver = ver)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Type]
  }
}

