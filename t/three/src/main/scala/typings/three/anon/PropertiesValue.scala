package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesValue extends js.Object {
  var properties: ConeCos
  var value: js.Array[_]
}

object PropertiesValue {
  @scala.inline
  def apply(properties: ConeCos, value: js.Array[_]): PropertiesValue = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesValue]
  }
}

