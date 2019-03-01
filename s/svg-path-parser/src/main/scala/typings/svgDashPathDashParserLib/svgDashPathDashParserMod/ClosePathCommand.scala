package typings
package svgDashPathDashParserLib.svgDashPathDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClosePathCommand extends js.Object {
  var code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.z | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.Z
  var command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.closepath
  var relative: js.UndefOr[scala.Boolean] = js.undefined
}

object ClosePathCommand {
  @scala.inline
  def apply(
    code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.z | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.Z,
    command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.closepath,
    relative: js.UndefOr[scala.Boolean] = js.undefined
  ): ClosePathCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.updateDynamic("command")(command)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[ClosePathCommand]
  }
}

