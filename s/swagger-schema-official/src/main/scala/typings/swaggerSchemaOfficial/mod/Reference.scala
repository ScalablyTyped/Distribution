package typings.swaggerSchemaOfficial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  @JSName("$ref")
  var $ref: String
}

object Reference {
  @scala.inline
  def apply($ref: String): Reference = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
}

