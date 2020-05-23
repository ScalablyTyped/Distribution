package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAny extends js.Object {
  var key: String
  var value: js.Any
}

object ValueAny {
  @scala.inline
  def apply(key: String, value: js.Any): ValueAny = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAny]
  }
}

