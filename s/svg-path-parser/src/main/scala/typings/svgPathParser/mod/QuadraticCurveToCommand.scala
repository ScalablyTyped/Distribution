package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.Q
import typings.svgPathParser.svgPathParserStrings.`quadratic curveto`
import typings.svgPathParser.svgPathParserStrings.q_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadraticCurveToCommand extends js.Object {
  var code: q_ | Q
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
    code: q_ | Q,
    command: `quadratic curveto`,
    x: Double,
    x1: Double,
    y: Double,
    y1: Double,
    relative: js.UndefOr[Boolean] = js.undefined
  ): QuadraticCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadraticCurveToCommand]
  }
}

