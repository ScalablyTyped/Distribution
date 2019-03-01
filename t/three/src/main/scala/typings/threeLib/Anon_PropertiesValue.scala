package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PropertiesValue extends js.Object {
  var properties: Anon_ColorConeCos
  var value: js.Array[_]
}

object Anon_PropertiesValue {
  @scala.inline
  def apply(properties: Anon_ColorConeCos, value: js.Array[_]): Anon_PropertiesValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_PropertiesValue]
  }
}

