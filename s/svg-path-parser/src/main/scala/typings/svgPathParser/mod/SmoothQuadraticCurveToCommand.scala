package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.T
import typings.svgPathParser.svgPathParserStrings.`smooth quadratic curveto`
import typings.svgPathParser.svgPathParserStrings.t_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmoothQuadraticCurveToCommand extends js.Object {
  var code: t_ | T = js.native
  var command: `smooth quadratic curveto` = js.native
  var relative: js.UndefOr[Boolean] = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SmoothQuadraticCurveToCommand {
  @scala.inline
  def apply(code: t_ | T, command: `smooth quadratic curveto`, x: Double, y: Double): SmoothQuadraticCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmoothQuadraticCurveToCommand]
  }
  @scala.inline
  implicit class SmoothQuadraticCurveToCommandOps[Self <: SmoothQuadraticCurveToCommand] (val x: Self) extends AnyVal {
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
    def setCode(value: t_ | T): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: `smooth quadratic curveto`): Self = this.set("command", value.asInstanceOf[js.Any])
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

