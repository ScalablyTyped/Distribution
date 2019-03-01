package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Properties extends js.Object {
  var properties: Anon_Color
  var value: js.Array[_]
}

object Anon_Properties {
  @scala.inline
  def apply(properties: Anon_Color, value: js.Array[_]): Anon_Properties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Properties]
  }
}

