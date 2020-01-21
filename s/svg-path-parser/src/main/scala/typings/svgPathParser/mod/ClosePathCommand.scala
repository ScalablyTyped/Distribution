package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.Z
import typings.svgPathParser.svgPathParserStrings.closepath
import typings.svgPathParser.svgPathParserStrings.z_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClosePathCommand extends js.Object {
  var code: z_ | Z
  var command: closepath
  var relative: js.UndefOr[Boolean] = js.undefined
}

object ClosePathCommand {
  @scala.inline
  def apply(code: z_ | Z, command: closepath, relative: js.UndefOr[Boolean] = js.undefined): ClosePathCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosePathCommand]
  }
}

