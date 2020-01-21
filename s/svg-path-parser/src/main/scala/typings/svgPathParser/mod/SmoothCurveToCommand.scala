package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.S
import typings.svgPathParser.svgPathParserStrings.`smooth curveto`
import typings.svgPathParser.svgPathParserStrings.s_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmoothCurveToCommand extends js.Object {
  var code: s_ | S
  var command: `smooth curveto`
  var relative: js.UndefOr[Boolean] = js.undefined
  var x: Double
  var x2: Double
  var y: Double
  var y2: Double
}

object SmoothCurveToCommand {
  @scala.inline
  def apply(
    code: s_ | S,
    command: `smooth curveto`,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double,
    relative: js.UndefOr[Boolean] = js.undefined
  ): SmoothCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmoothCurveToCommand]
  }
}

