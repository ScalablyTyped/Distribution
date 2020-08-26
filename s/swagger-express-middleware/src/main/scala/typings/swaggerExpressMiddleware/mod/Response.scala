package typings.swaggerExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.swaggerExpressMiddleware.mod.ResponseObject
  - typings.swaggerExpressMiddleware.mod.ReferenceObject
*/
trait Response extends js.Object

object Response {
  @scala.inline
  def ResponseObject(description: String): Response = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  def ReferenceObject($ref: String): Response = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

