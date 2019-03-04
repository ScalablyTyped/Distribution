package typings
package svgDashPathDashParserLib.svgDashPathDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmoothCurveToCommand extends js.Object {
  var code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.s | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.S
  var command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`smooth curveto`
  var relative: js.UndefOr[scala.Boolean] = js.undefined
  var x: scala.Double
  var x2: scala.Double
  var y: scala.Double
  var y2: scala.Double
}

object SmoothCurveToCommand {
  @scala.inline
  def apply(
    code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.s | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.S,
    command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`smooth curveto`,
    x: scala.Double,
    x2: scala.Double,
    y: scala.Double,
    y2: scala.Double,
    relative: js.UndefOr[scala.Boolean] = js.undefined
  ): SmoothCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command, x = x, x2 = x2, y = y, y2 = y2)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[SmoothCurveToCommand]
  }
}

