package typings.atTensorflowTfjsDashConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalProperties extends js.Object {
  var additionalProperties: Boolean
  var properties: Anon_Attrs
  var required: js.Array[String]
  var `type`: String
}

object Anon_AdditionalProperties {
  @scala.inline
  def apply(additionalProperties: Boolean, properties: Anon_Attrs, required: js.Array[String], `type`: String): Anon_AdditionalProperties = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdditionalProperties]
  }
}

