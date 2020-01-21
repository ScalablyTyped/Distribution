package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyValueString extends js.Object {
  var key: String
  var value: String
}

object AnonKeyValueString {
  @scala.inline
  def apply(key: String, value: String): AnonKeyValueString = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeyValueString]
  }
}

