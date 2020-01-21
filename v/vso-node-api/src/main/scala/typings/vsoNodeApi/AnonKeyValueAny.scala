package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyValueAny extends js.Object {
  var key: String
  var value: js.Any
}

object AnonKeyValueAny {
  @scala.inline
  def apply(key: String, value: js.Any): AnonKeyValueAny = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeyValueAny]
  }
}

