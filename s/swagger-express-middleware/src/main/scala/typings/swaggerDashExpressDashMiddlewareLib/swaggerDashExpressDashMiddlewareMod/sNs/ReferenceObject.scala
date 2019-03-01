package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod.sNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceObject extends Response {
  @JSName("$ref")
  var $ref: java.lang.String
}

object ReferenceObject {
  @scala.inline
  def apply($ref: java.lang.String): ReferenceObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$ref")($ref)
    __obj.asInstanceOf[ReferenceObject]
  }
}

