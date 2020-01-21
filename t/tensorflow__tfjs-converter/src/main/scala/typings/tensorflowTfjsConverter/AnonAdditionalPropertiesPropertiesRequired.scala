package typings.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdditionalPropertiesPropertiesRequired extends js.Object {
  var additionalProperties: Boolean
  var properties: AnonDefaultValueName
  var required: js.Array[String]
  var `type`: String
}

object AnonAdditionalPropertiesPropertiesRequired {
  @scala.inline
  def apply(
    additionalProperties: Boolean,
    properties: AnonDefaultValueName,
    required: js.Array[String],
    `type`: String
  ): AnonAdditionalPropertiesPropertiesRequired = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdditionalPropertiesPropertiesRequired]
  }
}

