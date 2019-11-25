package typings.swaggerDashTools.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var resourcePath: String
}

object Resource {
  @scala.inline
  def apply(resourcePath: String): Resource = {
    val __obj = js.Dynamic.literal(resourcePath = resourcePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Resource]
  }
}

