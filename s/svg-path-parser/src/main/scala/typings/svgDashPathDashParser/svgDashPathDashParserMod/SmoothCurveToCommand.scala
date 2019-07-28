package typings.svgDashPathDashParser.svgDashPathDashParserMod

import typings.svgDashPathDashParser.svgDashPathDashParserStrings.S
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.`smooth curveto`
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.s
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmoothCurveToCommand extends js.Object {
  var code: s | S
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
    code: s | S,
    command: `smooth curveto`,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double,
    relative: js.UndefOr[Boolean] = js.undefined
  ): SmoothCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command, x = x, x2 = x2, y = y, y2 = y2)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[SmoothCurveToCommand]
  }
}

