package typings
package subsumeLib.subsumeMod.SubsumeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResult extends js.Object {
  var data: js.UndefOr[java.lang.String] = js.undefined
  var rest: java.lang.String
}

object ParseResult {
  @scala.inline
  def apply(rest: java.lang.String, data: java.lang.String = null): ParseResult = {
    val __obj = js.Dynamic.literal(rest = rest)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ParseResult]
  }
}

