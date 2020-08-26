package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.Q
import typings.svgPathParser.svgPathParserStrings.`quadratic curveto`
import typings.svgPathParser.svgPathParserStrings.q_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuadraticCurveToCommand extends js.Object {
  var code: q_ | Q = js.native
  var command: `quadratic curveto` = js.native
  var relative: js.UndefOr[Boolean] = js.native
  var x: Double = js.native
  var x1: Double = js.native
  var y: Double = js.native
  var y1: Double = js.native
}

object QuadraticCurveToCommand {
  @scala.inline
  def apply(code: q_ | Q, command: `quadratic curveto`, x: Double, x1: Double, y: Double, y1: Double): QuadraticCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadraticCurveToCommand]
  }
  @scala.inline
  implicit class QuadraticCurveToCommandOps[Self <: QuadraticCurveToCommand] (val x: Self) extends AnyVal {
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
    def setCode(value: q_ | Q): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: `quadratic curveto`): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
  }
  
}

