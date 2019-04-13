package typings
package swaggerizeDashExpressLib.swaggerizeDashExpressMod.SwaggerNs

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
    val __obj = js.Dynamic.literal($ref = $ref)
  
    __obj.asInstanceOf[ReferenceObject]
  }
}

