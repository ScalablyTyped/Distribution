package typings.tinder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonString extends js.Object {
  var string: String
}

object AnonString {
  @scala.inline
  def apply(string: String): AnonString = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonString]
  }
}

