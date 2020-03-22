package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyString extends js.Object {
  var key: String
  var value: js.Array[AnonKeyValue]
}

object AnonKeyString {
  @scala.inline
  def apply(key: String, value: js.Array[AnonKeyValue]): AnonKeyString = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeyString]
  }
}

