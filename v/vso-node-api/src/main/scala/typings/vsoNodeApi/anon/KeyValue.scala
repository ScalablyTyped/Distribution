package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValue extends js.Object {
  var key: String
  var value: String
}

object KeyValue {
  @scala.inline
  def apply(key: String, value: String): KeyValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValue]
  }
}

