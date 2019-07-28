package typings.subsume.subsumeMod

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
    val __obj = js.Dynamic.literal(rest = rest)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ParseResult]
  }
}

