package typings
package turbostatusLib.turbostatusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repository extends js.Object {
  var name: java.lang.String
  var path: java.lang.String
}

object Repository {
  @scala.inline
  def apply(name: java.lang.String, path: java.lang.String): Repository = {
    val __obj = js.Dynamic.literal(name = name, path = path)
  
    __obj.asInstanceOf[Repository]
  }
}

