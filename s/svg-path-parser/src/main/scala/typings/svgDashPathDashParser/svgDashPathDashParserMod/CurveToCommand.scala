package typings.svgDashPathDashParser.svgDashPathDashParserMod

import typings.svgDashPathDashParser.svgDashPathDashParserStrings.C
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.c
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.curveto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurveToCommand extends js.Object {
  var code: c | C
  var command: curveto
  var relative: js.UndefOr[Boolean] = js.undefined
  var x: Double
  var x1: Double
  var x2: Double
  var y: Double
  var y1: Double
  var y2: Double
}

object CurveToCommand {
  @scala.inline
  def apply(
    code: c | C,
    command: curveto,
    x: Double,
    x1: Double,
    x2: Double,
    y: Double,
    y1: Double,
    y2: Double,
    relative: js.UndefOr[Boolean] = js.undefined
  ): CurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command, x = x, x1 = x1, x2 = x2, y = y, y1 = y1, y2 = y2)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[CurveToCommand]
  }
}

