package typings.umzug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Migration extends js.Object {
  var file: String
  var path: String
}

object Migration {
  @scala.inline
  def apply(file: String, path: String): Migration = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Migration]
  }
}

