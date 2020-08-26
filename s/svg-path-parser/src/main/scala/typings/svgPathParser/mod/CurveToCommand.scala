package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.C
import typings.svgPathParser.svgPathParserStrings.c_
import typings.svgPathParser.svgPathParserStrings.curveto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurveToCommand extends js.Object {
  var code: c_ | C = js.native
  var command: curveto = js.native
  var relative: js.UndefOr[Boolean] = js.native
  var x: Double = js.native
  var x1: Double = js.native
  var x2: Double = js.native
  var y: Double = js.native
  var y1: Double = js.native
  var y2: Double = js.native
}

object CurveToCommand {
  @scala.inline
  def apply(
    code: c_ | C,
    command: curveto,
    x: Double,
    x1: Double,
    x2: Double,
    y: Double,
    y1: Double,
    y2: Double
  ): CurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurveToCommand]
  }
  @scala.inline
  implicit class CurveToCommandOps[Self <: CurveToCommand] (val x: Self) extends AnyVal {
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
    def setCode(value: c_ | C): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: curveto): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
  }
  
}

