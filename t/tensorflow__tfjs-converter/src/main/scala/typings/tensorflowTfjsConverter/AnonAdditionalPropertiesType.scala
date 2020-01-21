package typings.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdditionalPropertiesType extends js.Object {
  var additionalProperties: Boolean
  var `type`: String
}

object AnonAdditionalPropertiesType {
  @scala.inline
  def apply(additionalProperties: Boolean, `type`: String): AnonAdditionalPropertiesType = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdditionalPropertiesType]
  }
}

