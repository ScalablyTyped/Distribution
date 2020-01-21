package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.T
import typings.svgPathParser.svgPathParserStrings.`smooth quadratic curveto`
import typings.svgPathParser.svgPathParserStrings.t_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmoothQuadraticCurveToCommand extends js.Object {
  var code: t_ | T
  var command: `smooth quadratic curveto`
  var relative: js.UndefOr[Boolean] = js.undefined
  var x: Double
  var y: Double
}

object SmoothQuadraticCurveToCommand {
  @scala.inline
  def apply(
    code: t_ | T,
    command: `smooth quadratic curveto`,
    x: Double,
    y: Double,
    relative: js.UndefOr[Boolean] = js.undefined
  ): SmoothQuadraticCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmoothQuadraticCurveToCommand]
  }
}

