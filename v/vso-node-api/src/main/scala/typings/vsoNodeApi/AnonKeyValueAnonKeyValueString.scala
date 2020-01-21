package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyValueAnonKeyValueString extends js.Object {
  var key: String
  var value: js.Array[AnonKeyValueString]
}

object AnonKeyValueAnonKeyValueString {
  @scala.inline
  def apply(key: String, value: js.Array[AnonKeyValueString]): AnonKeyValueAnonKeyValueString = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeyValueAnonKeyValueString]
  }
}

