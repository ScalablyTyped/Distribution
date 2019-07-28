package typings.svgDashPathDashParser.svgDashPathDashParserMod

import typings.svgDashPathDashParser.svgDashPathDashParserStrings.Q
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.`quadratic curveto`
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.q
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadraticCurveToCommand extends js.Object {
  var code: q | Q
  var command: `quadratic curveto`
  var relative: js.UndefOr[Boolean] = js.undefined
  var x: Double
  var x1: Double
  var y: Double
  var y1: Double
}

object QuadraticCurveToCommand {
  @scala.inline
  def apply(
    code: q | Q,
    command: `quadratic curveto`,
    x: Double,
    x1: Double,
    y: Double,
    y1: Double,
    relative: js.UndefOr[Boolean] = js.undefined
  ): QuadraticCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command, x = x, x1 = x1, y = y, y1 = y1)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[QuadraticCurveToCommand]
  }
}

