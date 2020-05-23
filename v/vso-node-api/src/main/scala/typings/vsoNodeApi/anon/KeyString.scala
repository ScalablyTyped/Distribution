package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyString extends js.Object {
  var key: String
  var value: js.Array[KeyValue]
}

object KeyString {
  @scala.inline
  def apply(key: String, value: js.Array[KeyValue]): KeyString = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyString]
  }
}

