package typings.vorpal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonString extends js.Object {
  var string: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonString {
  @scala.inline
  def apply(string: js.Array[String] = null): AnonString = {
    val __obj = js.Dynamic.literal()
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonString]
  }
}

