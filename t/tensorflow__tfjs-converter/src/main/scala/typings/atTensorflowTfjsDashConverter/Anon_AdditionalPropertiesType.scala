package typings.atTensorflowTfjsDashConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalPropertiesType extends js.Object {
  var additionalProperties: Boolean
  var `type`: String
}

object Anon_AdditionalPropertiesType {
  @scala.inline
  def apply(additionalProperties: Boolean, `type`: String): Anon_AdditionalPropertiesType = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdditionalPropertiesType]
  }
}

