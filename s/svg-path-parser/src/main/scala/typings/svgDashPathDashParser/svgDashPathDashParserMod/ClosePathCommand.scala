package typings.svgDashPathDashParser.svgDashPathDashParserMod

import typings.svgDashPathDashParser.svgDashPathDashParserStrings.Z
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.closepath
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.z
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClosePathCommand extends js.Object {
  var code: z | Z
  var command: closepath
  var relative: js.UndefOr[Boolean] = js.undefined
}

object ClosePathCommand {
  @scala.inline
  def apply(code: z | Z, command: closepath, relative: js.UndefOr[Boolean] = js.undefined): ClosePathCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[ClosePathCommand]
  }
}

