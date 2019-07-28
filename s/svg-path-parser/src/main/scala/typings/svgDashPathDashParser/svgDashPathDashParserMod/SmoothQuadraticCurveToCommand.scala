package typings.svgDashPathDashParser.svgDashPathDashParserMod

import typings.svgDashPathDashParser.svgDashPathDashParserStrings.T
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.`smooth quadratic curveto`
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.t
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmoothQuadraticCurveToCommand extends js.Object {
  var code: t | T
  var command: `smooth quadratic curveto`
  var relative: js.UndefOr[Boolean] = js.undefined
  var x: Double
  var y: Double
}

object SmoothQuadraticCurveToCommand {
  @scala.inline
  def apply(
    code: t | T,
    command: `smooth quadratic curveto`,
    x: Double,
    y: Double,
    relative: js.UndefOr[Boolean] = js.undefined
  ): SmoothQuadraticCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command, x = x, y = y)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[SmoothQuadraticCurveToCommand]
  }
}

