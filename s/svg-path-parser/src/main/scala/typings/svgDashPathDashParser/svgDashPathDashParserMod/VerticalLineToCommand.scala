package typings.svgDashPathDashParser.svgDashPathDashParserMod

import typings.svgDashPathDashParser.svgDashPathDashParserStrings.V
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.`vertical lineto`
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.v
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerticalLineToCommand extends js.Object {
  var code: v | V
  var command: `vertical lineto`
  var relative: js.UndefOr[Boolean] = js.undefined
  var y: Double
}

object VerticalLineToCommand {
  @scala.inline
  def apply(code: v | V, command: `vertical lineto`, y: Double, relative: js.UndefOr[Boolean] = js.undefined): VerticalLineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command, y = y)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[VerticalLineToCommand]
  }
}

