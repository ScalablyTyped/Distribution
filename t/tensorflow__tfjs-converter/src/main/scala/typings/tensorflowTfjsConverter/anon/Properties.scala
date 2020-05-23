package typings.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Properties extends js.Object {
  var additionalProperties: Boolean
  var properties: DefaultValue
  var required: js.Array[String]
  var `type`: String
}

object Properties {
  @scala.inline
  def apply(
    additionalProperties: Boolean,
    properties: DefaultValue,
    required: js.Array[String],
    `type`: String
  ): Properties = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
}

