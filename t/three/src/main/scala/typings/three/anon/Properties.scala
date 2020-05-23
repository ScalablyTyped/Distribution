package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Properties extends js.Object {
  var properties: Color
  var value: js.Array[_]
}

object Properties {
  @scala.inline
  def apply(properties: Color, value: js.Array[_]): Properties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
}

