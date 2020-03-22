package typings.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProperties extends js.Object {
  var additionalProperties: Boolean
  var properties: AnonDefaultValue
  var required: js.Array[String]
  var `type`: String
}

object AnonProperties {
  @scala.inline
  def apply(
    additionalProperties: Boolean,
    properties: AnonDefaultValue,
    required: js.Array[String],
    `type`: String
  ): AnonProperties = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProperties]
  }
}

