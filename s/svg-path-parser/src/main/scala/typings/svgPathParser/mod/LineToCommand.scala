package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.L
import typings.svgPathParser.svgPathParserStrings.l_
import typings.svgPathParser.svgPathParserStrings.lineto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineToCommand extends js.Object {
  var code: l_ | L = js.native
  var command: lineto = js.native
  var relative: js.UndefOr[Boolean] = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object LineToCommand {
  @scala.inline
  def apply(code: l_ | L, command: lineto, x: Double, y: Double): LineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineToCommand]
  }
  @scala.inline
  implicit class LineToCommandOps[Self <: LineToCommand] (val x: Self) extends AnyVal {
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
    def setCode(value: l_ | L): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: lineto): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
  }
  
}

