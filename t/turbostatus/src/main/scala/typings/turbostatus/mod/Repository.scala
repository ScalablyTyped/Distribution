package typings.turbostatus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repository extends js.Object {
  var name: String
  var path: String
}

object Repository {
  @scala.inline
  def apply(name: String, path: String): Repository = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repository]
  }
}

