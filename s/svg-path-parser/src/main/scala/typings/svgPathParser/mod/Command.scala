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
import typings.svgPathParser.svgPathParserStrings.a_
import typings.svgPathParser.svgPathParserStrings.c_
import typings.svgPathParser.svgPathParserStrings.h_
import typings.svgPathParser.svgPathParserStrings.l_
import typings.svgPathParser.svgPathParserStrings.m_
import typings.svgPathParser.svgPathParserStrings.q_
import typings.svgPathParser.svgPathParserStrings.s_
import typings.svgPathParser.svgPathParserStrings.t_
import typings.svgPathParser.svgPathParserStrings.v_
import typings.svgPathParser.svgPathParserStrings.z_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.svgPathParser.mod.MoveToCommand
  - typings.svgPathParser.mod.LineToCommand
  - typings.svgPathParser.mod.HorizontalLineToCommand
  - typings.svgPathParser.mod.VerticalLineToCommand
  - typings.svgPathParser.mod.ClosePathCommand
  - typings.svgPathParser.mod.CurveToCommand
  - typings.svgPathParser.mod.SmoothCurveToCommand
  - typings.svgPathParser.mod.QuadraticCurveToCommand
  - typings.svgPathParser.mod.SmoothQuadraticCurveToCommand
  - typings.svgPathParser.mod.EllipticalArcCommand
*/
trait Command extends StObject
object Command {
  
  inline def ClosePathCommand(code: z_ | Z): typings.svgPathParser.mod.ClosePathCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "closepath")
    __obj.asInstanceOf[typings.svgPathParser.mod.ClosePathCommand]
  }
  
  inline def CurveToCommand(code: c_ | C, x: Double, x1: Double, x2: Double, y: Double, y1: Double, y2: Double): typings.svgPathParser.mod.CurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "curveto", x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.CurveToCommand]
  }
  
  inline def EllipticalArcCommand(
    code: a_ | A,
    largeArc: Boolean,
    rx: Double,
    ry: Double,
    sweep: Boolean,
    x: Double,
    xAxisRotation: Double,
    y: Double
  ): typings.svgPathParser.mod.EllipticalArcCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "elliptical arc", largeArc = largeArc.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], sweep = sweep.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xAxisRotation = xAxisRotation.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.EllipticalArcCommand]
  }
  
  inline def HorizontalLineToCommand(code: h_ | H, x: Double): typings.svgPathParser.mod.HorizontalLineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "horizontal lineto", x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.HorizontalLineToCommand]
  }
  
  inline def LineToCommand(code: l_ | L, x: Double, y: Double): typings.svgPathParser.mod.LineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "lineto", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.LineToCommand]
  }
  
  inline def MoveToCommand(code: m_ | M, x: Double, y: Double): typings.svgPathParser.mod.MoveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "moveto", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.MoveToCommand]
  }
  
  inline def QuadraticCurveToCommand(code: q_ | Q, x: Double, x1: Double, y: Double, y1: Double): typings.svgPathParser.mod.QuadraticCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "quadratic curveto", x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.QuadraticCurveToCommand]
  }
  
  inline def SmoothCurveToCommand(code: s_ | S, x: Double, x2: Double, y: Double, y2: Double): typings.svgPathParser.mod.SmoothCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "smooth curveto", x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.SmoothCurveToCommand]
  }
  
  inline def SmoothQuadraticCurveToCommand(code: t_ | T, x: Double, y: Double): typings.svgPathParser.mod.SmoothQuadraticCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "smooth quadratic curveto", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.SmoothQuadraticCurveToCommand]
  }
  
  inline def VerticalLineToCommand(code: v_ | V, y: Double): typings.svgPathParser.mod.VerticalLineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "vertical lineto", y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.VerticalLineToCommand]
  }
}
