package typings
package svgDashPathDashParserLib.svgDashPathDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadraticCurveToCommand extends js.Object {
  var code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.q | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.Q
  var command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`quadratic curveto`
  var relative: js.UndefOr[scala.Boolean] = js.undefined
  var x: scala.Double
  var x1: scala.Double
  var y: scala.Double
  var y1: scala.Double
}

object QuadraticCurveToCommand {
  @scala.inline
  def apply(
    code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.q | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.Q,
    command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`quadratic curveto`,
    x: scala.Double,
    x1: scala.Double,
    y: scala.Double,
    y1: scala.Double,
    relative: js.UndefOr[scala.Boolean] = js.undefined
  ): QuadraticCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command, x = x, x1 = x1, y = y, y1 = y1)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[QuadraticCurveToCommand]
  }
}

