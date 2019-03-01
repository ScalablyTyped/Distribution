package typings
package svgDashPathDashParserLib.svgDashPathDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmoothQuadraticCurveToCommand extends js.Object {
  var code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.t | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.T
  var command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`smooth quadratic curveto`
  var relative: js.UndefOr[scala.Boolean] = js.undefined
  var x: scala.Double
  var y: scala.Double
}

object SmoothQuadraticCurveToCommand {
  @scala.inline
  def apply(
    code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.t | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.T,
    command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`smooth quadratic curveto`,
    x: scala.Double,
    y: scala.Double,
    relative: js.UndefOr[scala.Boolean] = js.undefined
  ): SmoothQuadraticCurveToCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[SmoothQuadraticCurveToCommand]
  }
}

