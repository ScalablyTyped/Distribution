package typings.svgDashPathDashParser.svgDashPathDashParserMod

import typings.svgDashPathDashParser.svgDashPathDashParserStrings.A
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.`elliptical arc`
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.a_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipticalArcCommand extends js.Object {
  var code: a_ | A
  var command: `elliptical arc`
  var largeArc: Boolean
  var relative: js.UndefOr[Boolean] = js.undefined
  var rx: Double
  var ry: Double
  var sweep: Boolean
  var x: Double
  var xAxisRotation: Double
  var y: Double
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
    y: Double,
    relative: js.UndefOr[Boolean] = js.undefined
  ): EllipticalArcCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], largeArc = largeArc.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], sweep = sweep.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xAxisRotation = xAxisRotation.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipticalArcCommand]
  }
}

