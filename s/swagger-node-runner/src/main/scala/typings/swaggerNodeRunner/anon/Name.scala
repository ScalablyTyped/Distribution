package typings.swaggerNodeRunner.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  /**  Name of Plugin (e.g. `swagger-node-runner`) */
  var name: String
  /** Version of Plugin */
  var version: String
}

object Name {
  @scala.inline
  def apply(name: String, version: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

