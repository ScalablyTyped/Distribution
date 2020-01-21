package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.H
import typings.svgPathParser.svgPathParserStrings.`horizontal lineto`
import typings.svgPathParser.svgPathParserStrings.h_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HorizontalLineToCommand extends js.Object {
  var code: h_ | H
  var command: `horizontal lineto`
  var relative: js.UndefOr[Boolean] = js.undefined
  var x: Double
}

object HorizontalLineToCommand {
  @scala.inline
  def apply(
    code: h_ | H,
    command: `horizontal lineto`,
    x: Double,
    relative: js.UndefOr[Boolean] = js.undefined
  ): HorizontalLineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalLineToCommand]
  }
}

