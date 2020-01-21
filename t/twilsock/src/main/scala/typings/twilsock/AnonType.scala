package typings.twilsock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: String
  var ver: String
}

object AnonType {
  @scala.inline
  def apply(`type`: String, ver: String): AnonType = {
    val __obj = js.Dynamic.literal(ver = ver.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

