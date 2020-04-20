package typings.twilsock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var ver: String
}

object AnonName {
  @scala.inline
  def apply(name: String, ver: String): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

