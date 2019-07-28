package typings.svgDashPathDashParser.svgDashPathDashParserMod

import typings.svgDashPathDashParser.svgDashPathDashParserStrings.H
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.`horizontal lineto`
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.h
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HorizontalLineToCommand extends js.Object {
  var code: h | H
  var command: `horizontal lineto`
  var relative: js.UndefOr[Boolean] = js.undefined
  var x: Double
}

object HorizontalLineToCommand {
  @scala.inline
  def apply(code: h | H, command: `horizontal lineto`, x: Double, relative: js.UndefOr[Boolean] = js.undefined): HorizontalLineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command, x = x)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[HorizontalLineToCommand]
  }
}

