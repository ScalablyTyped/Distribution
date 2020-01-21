package typings.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdditionalProperties extends js.Object {
  var additionalProperties: Boolean
  var properties: AnonAttrs
  var required: js.Array[String]
  var `type`: String
}

object AnonAdditionalProperties {
  @scala.inline
  def apply(additionalProperties: Boolean, properties: AnonAttrs, required: js.Array[String], `type`: String): AnonAdditionalProperties = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdditionalProperties]
  }
}

