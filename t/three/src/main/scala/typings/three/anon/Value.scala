package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var properties: ShadowBias
  var value: js.Array[_]
}

object Value {
  @scala.inline
  def apply(properties: ShadowBias, value: js.Array[_]): Value = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

