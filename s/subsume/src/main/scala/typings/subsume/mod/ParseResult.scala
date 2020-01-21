package typings.subsume.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResult extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var rest: String
}

object ParseResult {
  @scala.inline
  def apply(rest: String, data: String = null): ParseResult = {
    val __obj = js.Dynamic.literal(rest = rest.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResult]
  }
}

