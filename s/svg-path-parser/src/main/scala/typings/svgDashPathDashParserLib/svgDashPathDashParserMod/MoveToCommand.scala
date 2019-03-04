package typings
package svgDashPathDashParserLib.svgDashPathDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveToCommand extends js.Object {
  var code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.m | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.M
  var command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.moveto
  var relative: js.UndefOr[scala.Boolean] = js.undefined
  var x: scala.Double
  var y: scala.Double
}

object MoveToCommand {
  @scala.inline
  def apply(
    code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.m | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.M,
    command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.moveto,
    x: scala.Double,
    y: scala.Double,
    relative: js.UndefOr[scala.Boolean] = js.undefined
  ): MoveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command, x = x, y = y)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[MoveToCommand]
  }
}

