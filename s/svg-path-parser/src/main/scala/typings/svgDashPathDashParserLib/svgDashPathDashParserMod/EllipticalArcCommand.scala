package typings
package svgDashPathDashParserLib.svgDashPathDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipticalArcCommand extends js.Object {
  var code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.a | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.A
  var command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`elliptical arc`
  var largeArc: scala.Boolean
  var relative: js.UndefOr[scala.Boolean] = js.undefined
  var rx: scala.Double
  var ry: scala.Double
  var sweep: scala.Boolean
  var x: scala.Double
  var xAxisRotation: scala.Double
  var y: scala.Double
}

object EllipticalArcCommand {
  @scala.inline
  def apply(
    code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.a | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.A,
    command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`elliptical arc`,
    largeArc: scala.Boolean,
    rx: scala.Double,
    ry: scala.Double,
    sweep: scala.Boolean,
    x: scala.Double,
    xAxisRotation: scala.Double,
    y: scala.Double,
    relative: js.UndefOr[scala.Boolean] = js.undefined
  ): EllipticalArcCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command, largeArc = largeArc, rx = rx, ry = ry, sweep = sweep, x = x, xAxisRotation = xAxisRotation, y = y)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[EllipticalArcCommand]
  }
}

