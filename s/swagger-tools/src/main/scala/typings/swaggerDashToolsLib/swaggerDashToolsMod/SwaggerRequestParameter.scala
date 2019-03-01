package typings
package swaggerDashToolsLib.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerRequestParameter[T] extends js.Object {
  var originalValue: js.Any
  var path: js.Array[java.lang.String]
  var schema: SwaggerParameterSchema
  var value: T
}

object SwaggerRequestParameter {
  @scala.inline
  def apply[T](originalValue: js.Any, path: js.Array[java.lang.String], schema: SwaggerParameterSchema, value: T): SwaggerRequestParameter[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("originalValue")(originalValue)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("schema")(schema)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerRequestParameter[T]]
  }
}

