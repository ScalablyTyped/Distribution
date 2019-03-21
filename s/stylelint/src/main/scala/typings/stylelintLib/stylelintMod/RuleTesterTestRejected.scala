package typings
package stylelintLib.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleTesterTestRejected extends RuleTesterTest {
  var column: js.UndefOr[scala.Double] = js.undefined
  var line: js.UndefOr[scala.Double] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var only: js.UndefOr[scala.Boolean] = js.undefined
}

object RuleTesterTestRejected {
  @scala.inline
  def apply(
    code: java.lang.String,
    column: scala.Int | scala.Double = null,
    description: java.lang.String = null,
    line: scala.Int | scala.Double = null,
    message: java.lang.String = null,
    only: js.UndefOr[scala.Boolean] = js.undefined
  ): RuleTesterTestRejected = {
    val __obj = js.Dynamic.literal(code = code)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only)
    __obj.asInstanceOf[RuleTesterTestRejected]
  }
}

