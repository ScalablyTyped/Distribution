package typings.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalPropertiesType extends js.Object {
  var additionalProperties: Boolean
  var `type`: String
}

object AdditionalPropertiesType {
  @scala.inline
  def apply(additionalProperties: Boolean, `type`: String): AdditionalPropertiesType = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalPropertiesType]
  }
}

