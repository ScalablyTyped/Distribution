package typings.svgDashPathDashParser.svgDashPathDashParserMod

import typings.svgDashPathDashParser.svgDashPathDashParserStrings.L
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.l_
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.lineto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineToCommand extends js.Object {
  var code: l_ | L
  var command: lineto
  var relative: js.UndefOr[Boolean] = js.undefined
  var x: Double
  var y: Double
}

object LineToCommand {
  @scala.inline
  def apply(code: l_ | L, command: lineto, x: Double, y: Double, relative: js.UndefOr[Boolean] = js.undefined): LineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineToCommand]
  }
}

