package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProperties extends js.Object {
  var properties: AnonColor
  var value: js.Array[_]
}

object AnonProperties {
  @scala.inline
  def apply(properties: AnonColor, value: js.Array[_]): AnonProperties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProperties]
  }
}

