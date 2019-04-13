package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseObject extends Response {
  var description: java.lang.String
  var examples: js.UndefOr[ExampleObject] = js.undefined
  var headers: js.UndefOr[HeadersObject] = js.undefined
  var schema: js.UndefOr[SchemaObject] = js.undefined
}

object ResponseObject {
  @scala.inline
  def apply(
    description: java.lang.String,
    examples: ExampleObject = null,
    headers: HeadersObject = null,
    schema: SchemaObject = null
  ): ResponseObject = {
    val __obj = js.Dynamic.literal(description = description)
    if (examples != null) __obj.updateDynamic("examples")(examples)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[ResponseObject]
  }
}

