package typings.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequired extends js.Object {
  var additionalProperties: Boolean
  var properties: AnonName
  var required: js.Array[String]
  var `type`: String
}

object AnonRequired {
  @scala.inline
  def apply(additionalProperties: Boolean, properties: AnonName, required: js.Array[String], `type`: String): AnonRequired = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequired]
  }
}

