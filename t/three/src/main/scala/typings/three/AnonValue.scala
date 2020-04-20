package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var properties: AnonShadowBias
  var value: js.Array[_]
}

object AnonValue {
  @scala.inline
  def apply(properties: AnonShadowBias, value: js.Array[_]): AnonValue = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

