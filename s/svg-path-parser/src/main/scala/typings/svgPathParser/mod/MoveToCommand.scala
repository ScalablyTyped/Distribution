package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.M
import typings.svgPathParser.svgPathParserStrings.m_
import typings.svgPathParser.svgPathParserStrings.moveto
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
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveToCommand]
  }
}

