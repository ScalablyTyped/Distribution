package typings.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalProperties extends js.Object {
  var additionalProperties: Boolean
  var properties: Attrs
  var required: js.Array[String]
  var `type`: String
}

object AdditionalProperties {
  @scala.inline
  def apply(additionalProperties: Boolean, properties: Attrs, required: js.Array[String], `type`: String): AdditionalProperties = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalProperties]
  }
}

