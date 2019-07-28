package typings.turbostatus.turbostatusMod

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
    val __obj = js.Dynamic.literal(name = name, path = path)
  
    __obj.asInstanceOf[Repository]
  }
}

