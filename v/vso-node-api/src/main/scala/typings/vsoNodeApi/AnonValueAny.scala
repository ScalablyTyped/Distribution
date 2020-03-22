package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueAny extends js.Object {
  var key: String
  var value: js.Any
}

object AnonValueAny {
  @scala.inline
  def apply(key: String, value: js.Any): AnonValueAny = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValueAny]
  }
}

