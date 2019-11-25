package typings.svgDashPathDashParser.svgDashPathDashParserMod

import typings.svgDashPathDashParser.svgDashPathDashParserStrings.C
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.c_
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.curveto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurveToCommand extends js.Object {
  var code: c_ | C
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
    code: c_ | C,
    command: curveto,
    x: Double,
    x1: Double,
    x2: Double,
    y: Double,
    y1: Double,
    y2: Double,
    relative: js.UndefOr[Boolean] = js.undefined
  ): CurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurveToCommand]
  }
}

