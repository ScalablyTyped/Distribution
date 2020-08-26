package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.Z
import typings.svgPathParser.svgPathParserStrings.closepath
import typings.svgPathParser.svgPathParserStrings.z_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClosePathCommand extends js.Object {
  var code: z_ | Z = js.native
  var command: closepath = js.native
  var relative: js.UndefOr[Boolean] = js.native
}

object ClosePathCommand {
  @scala.inline
  def apply(code: z_ | Z, command: closepath): ClosePathCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosePathCommand]
  }
  @scala.inline
  implicit class ClosePathCommandOps[Self <: ClosePathCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: z_ | Z): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: closepath): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
  }
  
}

