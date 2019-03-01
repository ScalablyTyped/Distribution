package typings
package swaggerDashToolsLib.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var resourcePath: java.lang.String
}

object Resource {
  @scala.inline
  def apply(resourcePath: java.lang.String): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resourcePath")(resourcePath)
    __obj.asInstanceOf[Resource]
  }
}

