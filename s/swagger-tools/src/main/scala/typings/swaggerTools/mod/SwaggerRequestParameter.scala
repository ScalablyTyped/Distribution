package typings.swaggerTools.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerRequestParameter[T] extends js.Object {
  var originalValue: js.Any
  var path: js.Array[String]
  var schema: SwaggerParameterSchema
  var value: T
}

object SwaggerRequestParameter {
  @scala.inline
  def apply[T](originalValue: js.Any, path: js.Array[String], schema: SwaggerParameterSchema, value: T): SwaggerRequestParameter[T] = {
    val __obj = js.Dynamic.literal(originalValue = originalValue.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerRequestParameter[T]]
  }
}

