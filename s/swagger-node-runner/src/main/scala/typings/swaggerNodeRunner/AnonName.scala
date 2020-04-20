package typings.swaggerNodeRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  /**  Name of Plugin (e.g. `swagger-node-runner`) */
  var name: String
  /** Version of Plugin */
  var version: String
}

object AnonName {
  @scala.inline
  def apply(name: String, version: String): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

