package typings
package svgDashPathDashParserLib.svgDashPathDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HorizontalLineToCommand extends js.Object {
  var code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.h | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.H
  var command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`horizontal lineto`
  var relative: js.UndefOr[scala.Boolean] = js.undefined
  var x: scala.Double
}

object HorizontalLineToCommand {
  @scala.inline
  def apply(
    code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.h | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.H,
    command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`horizontal lineto`,
    x: scala.Double,
    relative: js.UndefOr[scala.Boolean] = js.undefined
  ): HorizontalLineToCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("x")(x)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[HorizontalLineToCommand]
  }
}

