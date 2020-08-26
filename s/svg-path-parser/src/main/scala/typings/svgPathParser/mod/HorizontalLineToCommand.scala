package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.H
import typings.svgPathParser.svgPathParserStrings.`horizontal lineto`
import typings.svgPathParser.svgPathParserStrings.h_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HorizontalLineToCommand extends js.Object {
  var code: h_ | H = js.native
  var command: `horizontal lineto` = js.native
  var relative: js.UndefOr[Boolean] = js.native
  var x: Double = js.native
}

object HorizontalLineToCommand {
  @scala.inline
  def apply(code: h_ | H, command: `horizontal lineto`, x: Double): HorizontalLineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalLineToCommand]
  }
  @scala.inline
  implicit class HorizontalLineToCommandOps[Self <: HorizontalLineToCommand] (val x: Self) extends AnyVal {
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
    def setCode(value: h_ | H): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: `horizontal lineto`): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
  }
  
}

