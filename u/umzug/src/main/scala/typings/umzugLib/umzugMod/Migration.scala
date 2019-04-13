package typings
package umzugLib.umzugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Migration extends js.Object {
  var file: java.lang.String
  var path: java.lang.String
}

object Migration {
  @scala.inline
  def apply(file: java.lang.String, path: java.lang.String): Migration = {
    val __obj = js.Dynamic.literal(file = file, path = path)
  
    __obj.asInstanceOf[Migration]
  }
}

