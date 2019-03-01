package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerParser extends js.Object {
  @JSName("$ref")
  var $ref: js.Any
  var api: js.Any
}

object SwaggerParser {
  @scala.inline
  def apply($ref: js.Any, api: js.Any): SwaggerParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$ref")($ref)
    __obj.updateDynamic("api")(api)
    __obj.asInstanceOf[SwaggerParser]
  }
}

