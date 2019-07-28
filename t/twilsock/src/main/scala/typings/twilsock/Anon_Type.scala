package typings.twilsock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  var `type`: String
  var ver: String
}

object Anon_Type {
  @scala.inline
  def apply(`type`: String, ver: String): Anon_Type = {
    val __obj = js.Dynamic.literal(ver = ver)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Type]
  }
}

