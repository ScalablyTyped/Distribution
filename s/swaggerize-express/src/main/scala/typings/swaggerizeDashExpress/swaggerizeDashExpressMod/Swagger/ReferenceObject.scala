package typings.swaggerizeDashExpress.swaggerizeDashExpressMod.Swagger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceObject extends Response {
  @JSName("$ref")
  var $ref: String
}

object ReferenceObject {
  @scala.inline
  def apply($ref: String): ReferenceObject = {
    val __obj = js.Dynamic.literal($ref = $ref)
  
    __obj.asInstanceOf[ReferenceObject]
  }
}

