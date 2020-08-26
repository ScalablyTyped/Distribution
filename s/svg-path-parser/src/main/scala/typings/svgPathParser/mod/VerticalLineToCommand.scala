package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.V
import typings.svgPathParser.svgPathParserStrings.`vertical lineto`
import typings.svgPathParser.svgPathParserStrings.v_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerticalLineToCommand extends js.Object {
  var code: v_ | V = js.native
  var command: `vertical lineto` = js.native
  var relative: js.UndefOr[Boolean] = js.native
  var y: Double = js.native
}

object VerticalLineToCommand {
  @scala.inline
  def apply(code: v_ | V, command: `vertical lineto`, y: Double): VerticalLineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalLineToCommand]
  }
  @scala.inline
  implicit class VerticalLineToCommandOps[Self <: VerticalLineToCommand] (val x: Self) extends AnyVal {
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
    def setCode(value: v_ | V): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: `vertical lineto`): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
  }
  
}

