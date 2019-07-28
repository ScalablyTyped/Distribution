package typings.svgDashPathDashParser.svgDashPathDashParserMod

import typings.svgDashPathDashParser.svgDashPathDashParserStrings.A
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.`elliptical arc`
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.a
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipticalArcCommand extends js.Object {
  var code: a | A
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
    code: a | A,
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
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command, largeArc = largeArc, rx = rx, ry = ry, sweep = sweep, x = x, xAxisRotation = xAxisRotation, y = y)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[EllipticalArcCommand]
  }
}

