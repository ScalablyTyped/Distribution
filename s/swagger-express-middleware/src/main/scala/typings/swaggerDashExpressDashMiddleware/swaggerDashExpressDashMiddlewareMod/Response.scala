package typings.swaggerDashExpressDashMiddleware.swaggerDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.swaggerDashExpressDashMiddleware.swaggerDashExpressDashMiddlewareMod.ResponseObject
  - typings.swaggerDashExpressDashMiddleware.swaggerDashExpressDashMiddlewareMod.ReferenceObject
*/
trait Response extends js.Object

object Response {
  @scala.inline
  def ResponseObject(
    description: String,
    examples: ExampleObject = null,
    headers: HeadersObject = null,
    schema: SchemaObject = null
  ): Response = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  def ReferenceObject($ref: String): Response = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Response]
  }
}

