package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.A
import typings.svgPathParser.svgPathParserStrings.C
import typings.svgPathParser.svgPathParserStrings.H
import typings.svgPathParser.svgPathParserStrings.L
import typings.svgPathParser.svgPathParserStrings.M
import typings.svgPathParser.svgPathParserStrings.Q
import typings.svgPathParser.svgPathParserStrings.S
import typings.svgPathParser.svgPathParserStrings.T
import typings.svgPathParser.svgPathParserStrings.V
import typings.svgPathParser.svgPathParserStrings.Z
import typings.svgPathParser.svgPathParserStrings.`elliptical arc`
import typings.svgPathParser.svgPathParserStrings.`horizontal lineto`
import typings.svgPathParser.svgPathParserStrings.`quadratic curveto`
import typings.svgPathParser.svgPathParserStrings.`smooth curveto`
import typings.svgPathParser.svgPathParserStrings.`smooth quadratic curveto`
import typings.svgPathParser.svgPathParserStrings.`vertical lineto`
import typings.svgPathParser.svgPathParserStrings.a_
import typings.svgPathParser.svgPathParserStrings.c_
import typings.svgPathParser.svgPathParserStrings.closepath
import typings.svgPathParser.svgPathParserStrings.curveto
import typings.svgPathParser.svgPathParserStrings.h_
import typings.svgPathParser.svgPathParserStrings.l_
import typings.svgPathParser.svgPathParserStrings.lineto
import typings.svgPathParser.svgPathParserStrings.m_
import typings.svgPathParser.svgPathParserStrings.moveto
import typings.svgPathParser.svgPathParserStrings.q_
import typings.svgPathParser.svgPathParserStrings.s_
import typings.svgPathParser.svgPathParserStrings.t_
import typings.svgPathParser.svgPathParserStrings.v_
import typings.svgPathParser.svgPathParserStrings.z_
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
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

