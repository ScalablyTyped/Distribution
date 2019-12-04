package typings.atTensorflowTfjsDashConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalPropertiesProperties extends js.Object {
  var additionalProperties: Boolean
  var properties: Anon_DefaultValue
  var required: js.Array[String]
  var `type`: String
}

object Anon_AdditionalPropertiesProperties {
  @scala.inline
  def apply(
    additionalProperties: Boolean,
    properties: Anon_DefaultValue,
    required: js.Array[String],
    `type`: String
  ): Anon_AdditionalPropertiesProperties = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdditionalPropertiesProperties]
  }
}

