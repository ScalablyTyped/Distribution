package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesDirection extends js.Object {
  var properties: Direction
  var value: js.Array[_]
}

object PropertiesDirection {
  @scala.inline
  def apply(properties: Direction, value: js.Array[_]): PropertiesDirection = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesDirection]
  }
}

