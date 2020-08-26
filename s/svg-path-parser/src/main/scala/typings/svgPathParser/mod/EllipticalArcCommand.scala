package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.A
import typings.svgPathParser.svgPathParserStrings.`elliptical arc`
import typings.svgPathParser.svgPathParserStrings.a_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EllipticalArcCommand extends js.Object {
  var code: a_ | A = js.native
  var command: `elliptical arc` = js.native
  var largeArc: Boolean = js.native
  var relative: js.UndefOr[Boolean] = js.native
  var rx: Double = js.native
  var ry: Double = js.native
  var sweep: Boolean = js.native
  var x: Double = js.native
  var xAxisRotation: Double = js.native
  var y: Double = js.native
}

object EllipticalArcCommand {
  @scala.inline
  def apply(
    code: a_ | A,
    command: `elliptical arc`,
    largeArc: Boolean,
    rx: Double,
    ry: Double,
    sweep: Boolean,
    x: Double,
    xAxisRotation: Double,
    y: Double
  ): EllipticalArcCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], largeArc = largeArc.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], sweep = sweep.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xAxisRotation = xAxisRotation.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipticalArcCommand]
  }
  @scala.inline
  implicit class EllipticalArcCommandOps[Self <: EllipticalArcCommand] (val x: Self) extends AnyVal {
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
    def setCode(value: a_ | A): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: `elliptical arc`): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setLargeArc(value: Boolean): Self = this.set("largeArc", value.asInstanceOf[js.Any])
    @scala.inline
    def setRx(value: Double): Self = this.set("rx", value.asInstanceOf[js.Any])
    @scala.inline
    def setRy(value: Double): Self = this.set("ry", value.asInstanceOf[js.Any])
    @scala.inline
    def setSweep(value: Boolean): Self = this.set("sweep", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setXAxisRotation(value: Double): Self = this.set("xAxisRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
  }
  
}

