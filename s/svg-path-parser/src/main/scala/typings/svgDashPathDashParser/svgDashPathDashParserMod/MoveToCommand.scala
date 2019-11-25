package typings.svgDashPathDashParser.svgDashPathDashParserMod

import typings.svgDashPathDashParser.svgDashPathDashParserStrings.M
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.m_
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.moveto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveToCommand extends js.Object {
  var code: m_ | M
  var command: moveto
  var relative: js.UndefOr[Boolean] = js.undefined
  var x: Double
  var y: Double
}

object MoveToCommand {
  @scala.inline
  def apply(code: m_ | M, command: moveto, x: Double, y: Double, relative: js.UndefOr[Boolean] = js.undefined): MoveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveToCommand]
  }
}

