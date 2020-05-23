package typings.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Required extends js.Object {
  var additionalProperties: Boolean
  var properties: Name
  var required: js.Array[String]
  var `type`: String
}

object Required {
  @scala.inline
  def apply(additionalProperties: Boolean, properties: Name, required: js.Array[String], `type`: String): Required = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
}

