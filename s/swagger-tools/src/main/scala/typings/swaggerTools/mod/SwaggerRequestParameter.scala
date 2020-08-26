package typings.swaggerTools.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwaggerRequestParameter[T] extends js.Object {
  var originalValue: js.Any = js.native
  var path: js.Array[String] = js.native
  var schema: SwaggerParameterSchema = js.native
  var value: T = js.native
}

object SwaggerRequestParameter {
  @scala.inline
  def apply[T](originalValue: js.Any, path: js.Array[String], schema: SwaggerParameterSchema, value: T): SwaggerRequestParameter[T] = {
    val __obj = js.Dynamic.literal(originalValue = originalValue.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerRequestParameter[T]]
  }
  @scala.inline
  implicit class SwaggerRequestParameterOps[Self <: SwaggerRequestParameter[_], T] (val x: Self with SwaggerRequestParameter[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOriginalValue(value: js.Any): Self = this.set("originalValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: SwaggerParameterSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

