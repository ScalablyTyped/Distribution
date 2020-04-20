package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPropertiesValue extends js.Object {
  var properties: AnonConeCos
  var value: js.Array[_]
}

object AnonPropertiesValue {
  @scala.inline
  def apply(properties: AnonConeCos, value: js.Array[_]): AnonPropertiesValue = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPropertiesValue]
  }
}

