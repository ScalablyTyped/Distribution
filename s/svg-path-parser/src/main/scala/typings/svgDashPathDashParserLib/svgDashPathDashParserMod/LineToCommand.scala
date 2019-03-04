package typings
package svgDashPathDashParserLib.svgDashPathDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineToCommand extends js.Object {
  var code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.l | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.L
  var command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.lineto
  var relative: js.UndefOr[scala.Boolean] = js.undefined
  var x: scala.Double
  var y: scala.Double
}

object LineToCommand {
  @scala.inline
  def apply(
    code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.l | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.L,
    command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.lineto,
    x: scala.Double,
    y: scala.Double,
    relative: js.UndefOr[scala.Boolean] = js.undefined
  ): LineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command, x = x, y = y)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[LineToCommand]
  }
}

