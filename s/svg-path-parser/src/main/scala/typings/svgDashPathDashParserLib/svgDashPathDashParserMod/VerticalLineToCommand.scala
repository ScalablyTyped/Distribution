package typings
package svgDashPathDashParserLib.svgDashPathDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerticalLineToCommand extends js.Object {
  var code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.v | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.V
  var command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`vertical lineto`
  var relative: js.UndefOr[scala.Boolean] = js.undefined
  var y: scala.Double
}

object VerticalLineToCommand {
  @scala.inline
  def apply(
    code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.v | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.V,
    command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`vertical lineto`,
    y: scala.Double,
    relative: js.UndefOr[scala.Boolean] = js.undefined
  ): VerticalLineToCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("y")(y)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[VerticalLineToCommand]
  }
}

