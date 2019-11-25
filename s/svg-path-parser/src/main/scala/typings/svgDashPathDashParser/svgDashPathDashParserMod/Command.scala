package typings.svgDashPathDashParser.svgDashPathDashParserMod

import typings.svgDashPathDashParser.svgDashPathDashParserStrings.A
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.C
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.H
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.L
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.M
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.Q
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.S
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.T
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.V
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.Z
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.`elliptical arc`
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.`horizontal lineto`
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.`quadratic curveto`
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.`smooth curveto`
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.`smooth quadratic curveto`
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.`vertical lineto`
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.a_
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.c_
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.closepath
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.curveto
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.h_
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.l_
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.lineto
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.m_
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.moveto
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.q_
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.s_
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.t_
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.v_
import typings.svgDashPathDashParser.svgDashPathDashParserStrings.z_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var code: m_ | M | l_ | L | h_ | H | v_ | V | c_ | C | s_ | S | q_ | Q | t_ | T | a_ | A | z_ | Z
  var command: moveto | lineto | (`horizontal lineto`) | (`vertical lineto`) | curveto | (`smooth curveto`) | (`quadratic curveto`) | (`smooth quadratic curveto`) | (`elliptical arc`) | closepath
  var relative: js.UndefOr[Boolean] = js.undefined
}

object Command {
  @scala.inline
  def apply(
    code: m_ | M | l_ | L | h_ | H | v_ | V | c_ | C | s_ | S | q_ | Q | t_ | T | a_ | A | z_ | Z,
    command: moveto | lineto | (`horizontal lineto`) | (`vertical lineto`) | curveto | (`smooth curveto`) | (`quadratic curveto`) | (`smooth quadratic curveto`) | (`elliptical arc`) | closepath,
    relative: js.UndefOr[Boolean] = js.undefined
  ): Command = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

