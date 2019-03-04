package typings
package svgDashPathDashParserLib.svgDashPathDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurveToCommand extends js.Object {
  var code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.c | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.C
  var command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.curveto
  var relative: js.UndefOr[scala.Boolean] = js.undefined
  var x: scala.Double
  var x1: scala.Double
  var x2: scala.Double
  var y: scala.Double
  var y1: scala.Double
  var y2: scala.Double
}

object CurveToCommand {
  @scala.inline
  def apply(
    code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.c | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.C,
    command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.curveto,
    x: scala.Double,
    x1: scala.Double,
    x2: scala.Double,
    y: scala.Double,
    y1: scala.Double,
    y2: scala.Double,
    relative: js.UndefOr[scala.Boolean] = js.undefined
  ): CurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command, x = x, x1 = x1, x2 = x2, y = y, y1 = y1, y2 = y2)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[CurveToCommand]
  }
}

