package typings
package svgDashPathDashParserLib.svgDashPathDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.m | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.M | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.l | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.L | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.h | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.H | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.v | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.V | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.c | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.C | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.s | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.S | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.q | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.Q | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.t | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.T | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.a | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.A | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.z | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.Z
  var command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.moveto | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.lineto | (svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`horizontal lineto`) | (svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`vertical lineto`) | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.curveto | (svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`smooth curveto`) | (svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`quadratic curveto`) | (svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`smooth quadratic curveto`) | (svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`elliptical arc`) | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.closepath
  var relative: js.UndefOr[scala.Boolean] = js.undefined
}

object Command {
  @scala.inline
  def apply(
    code: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.m | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.M | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.l | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.L | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.h | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.H | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.v | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.V | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.c | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.C | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.s | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.S | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.q | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.Q | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.t | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.T | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.a | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.A | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.z | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.Z,
    command: svgDashPathDashParserLib.svgDashPathDashParserLibStrings.moveto | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.lineto | (svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`horizontal lineto`) | (svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`vertical lineto`) | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.curveto | (svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`smooth curveto`) | (svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`quadratic curveto`) | (svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`smooth quadratic curveto`) | (svgDashPathDashParserLib.svgDashPathDashParserLibStrings.`elliptical arc`) | svgDashPathDashParserLib.svgDashPathDashParserLibStrings.closepath,
    relative: js.UndefOr[scala.Boolean] = js.undefined
  ): Command = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[Command]
  }
}

