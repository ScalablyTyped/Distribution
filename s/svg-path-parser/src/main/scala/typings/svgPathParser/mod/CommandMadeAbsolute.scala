package typings.svgPathParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.svgPathParser.mod.MoveToCommandMadeAbsolute
  - typings.svgPathParser.mod.LineToCommandMadeAbsolute
  - typings.svgPathParser.mod.HorizontalLineToCommandMadeAbsolute
  - typings.svgPathParser.mod.VerticalLineToCommandMadeAbsolute
  - typings.svgPathParser.mod.ClosePathCommandMadeAbsolute
  - typings.svgPathParser.mod.CurveToCommandMadeAbsolute
  - typings.svgPathParser.mod.SmoothCurveToCommandMadeAbsolute
  - typings.svgPathParser.mod.QuadraticCurveToCommandMadeAbsolute
  - typings.svgPathParser.mod.SmoothQuadraticCurveToCommandMadeAbsolute
  - typings.svgPathParser.mod.EllipticalArcCommandMadeAbsolute
*/
trait CommandMadeAbsolute extends StObject
object CommandMadeAbsolute {
  
  inline def ClosePathCommandMadeAbsolute(x: Double, x0: Double, y: Double, y0: Double): typings.svgPathParser.mod.ClosePathCommandMadeAbsolute = {
    val __obj = js.Dynamic.literal(code = "Z", command = "closepath", relative = false, x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.ClosePathCommandMadeAbsolute]
  }
  
  inline def CurveToCommandMadeAbsolute(x: Double, x0: Double, x1: Double, x2: Double, y: Double, y0: Double, y1: Double, y2: Double): typings.svgPathParser.mod.CurveToCommandMadeAbsolute = {
    val __obj = js.Dynamic.literal(code = "C", command = "curveto", relative = false, x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.CurveToCommandMadeAbsolute]
  }
  
  inline def EllipticalArcCommandMadeAbsolute(
    largeArc: Boolean,
    rx: Double,
    ry: Double,
    sweep: Boolean,
    x: Double,
    x0: Double,
    xAxisRotation: Double,
    y: Double,
    y0: Double
  ): typings.svgPathParser.mod.EllipticalArcCommandMadeAbsolute = {
    val __obj = js.Dynamic.literal(code = "A", command = "elliptical arc", largeArc = largeArc.asInstanceOf[js.Any], relative = false, rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], sweep = sweep.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], xAxisRotation = xAxisRotation.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.EllipticalArcCommandMadeAbsolute]
  }
  
  inline def HorizontalLineToCommandMadeAbsolute(x: Double, x0: Double, y: Double, y0: Double): typings.svgPathParser.mod.HorizontalLineToCommandMadeAbsolute = {
    val __obj = js.Dynamic.literal(code = "H", command = "horizontal lineto", relative = false, x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.HorizontalLineToCommandMadeAbsolute]
  }
  
  inline def LineToCommandMadeAbsolute(x: Double, x0: Double, y: Double, y0: Double): typings.svgPathParser.mod.LineToCommandMadeAbsolute = {
    val __obj = js.Dynamic.literal(code = "L", command = "lineto", relative = false, x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.LineToCommandMadeAbsolute]
  }
  
  inline def MoveToCommandMadeAbsolute(x: Double, x0: Double, y: Double, y0: Double): typings.svgPathParser.mod.MoveToCommandMadeAbsolute = {
    val __obj = js.Dynamic.literal(code = "M", command = "moveto", relative = false, x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.MoveToCommandMadeAbsolute]
  }
  
  inline def QuadraticCurveToCommandMadeAbsolute(x: Double, x0: Double, x1: Double, y: Double, y0: Double, y1: Double): typings.svgPathParser.mod.QuadraticCurveToCommandMadeAbsolute = {
    val __obj = js.Dynamic.literal(code = "Q", command = "quadratic curveto", relative = false, x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.QuadraticCurveToCommandMadeAbsolute]
  }
  
  inline def SmoothCurveToCommandMadeAbsolute(x: Double, x0: Double, x2: Double, y: Double, y0: Double, y2: Double): typings.svgPathParser.mod.SmoothCurveToCommandMadeAbsolute = {
    val __obj = js.Dynamic.literal(code = "S", command = "smooth curveto", relative = false, x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.SmoothCurveToCommandMadeAbsolute]
  }
  
  inline def SmoothQuadraticCurveToCommandMadeAbsolute(x: Double, x0: Double, y: Double, y0: Double): typings.svgPathParser.mod.SmoothQuadraticCurveToCommandMadeAbsolute = {
    val __obj = js.Dynamic.literal(code = "T", command = "smooth quadratic curveto", relative = false, x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.SmoothQuadraticCurveToCommandMadeAbsolute]
  }
  
  inline def VerticalLineToCommandMadeAbsolute(x: Double, x0: Double, y: Double, y0: Double): typings.svgPathParser.mod.VerticalLineToCommandMadeAbsolute = {
    val __obj = js.Dynamic.literal(code = "V", command = "vertical lineto", relative = false, x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.svgPathParser.mod.VerticalLineToCommandMadeAbsolute]
  }
}
