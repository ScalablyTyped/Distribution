package typings.twilsock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var ver: String
}

object Name {
  @scala.inline
  def apply(name: String, ver: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

