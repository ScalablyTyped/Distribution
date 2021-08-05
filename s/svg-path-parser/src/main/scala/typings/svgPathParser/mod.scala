package typings.svgPathParser

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svg-path-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeAbsolute(commands: js.Array[Command]): js.Array[Command] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAbsolute")(commands.asInstanceOf[js.Any]).asInstanceOf[js.Array[Command]]
  
  inline def parseSVG(input: String): js.Array[Command] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSVG")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Command]]
  
  trait ClosePathCommand extends StObject {
    
    var code: z_ | Z
    
    var command: closepath
    
    var relative: js.UndefOr[Boolean] = js.undefined
  }
  object ClosePathCommand {
    
    inline def apply(code: z_ | Z): ClosePathCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "closepath")
      __obj.asInstanceOf[ClosePathCommand]
    }
    
    extension [Self <: ClosePathCommand](x: Self) {
      
      inline def setCode(value: z_ | Z): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: closepath): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    }
  }
  
  trait Command extends StObject {
    
    var code: m_ | M | l_ | L | h_ | H | v_ | V | c_ | C | s_ | S | q_ | Q | t_ | T | a_ | A | z_ | Z
    
    var command: moveto | lineto | (`horizontal lineto`) | (`vertical lineto`) | curveto | (`smooth curveto`) | (`quadratic curveto`) | (`smooth quadratic curveto`) | (`elliptical arc`) | closepath
    
    var relative: js.UndefOr[Boolean] = js.undefined
  }
  object Command {
    
    inline def apply(
      code: m_ | M | l_ | L | h_ | H | v_ | V | c_ | C | s_ | S | q_ | Q | t_ | T | a_ | A | z_ | Z,
      command: moveto | lineto | (`horizontal lineto`) | (`vertical lineto`) | curveto | (`smooth curveto`) | (`quadratic curveto`) | (`smooth quadratic curveto`) | (`elliptical arc`) | closepath
    ): Command = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    extension [Self <: Command](x: Self) {
      
      inline def setCode(value: m_ | M | l_ | L | h_ | H | v_ | V | c_ | C | s_ | S | q_ | Q | t_ | T | a_ | A | z_ | Z): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCommand(
        value: moveto | lineto | (`horizontal lineto`) | (`vertical lineto`) | curveto | (`smooth curveto`) | (`quadratic curveto`) | (`smooth quadratic curveto`) | (`elliptical arc`) | closepath
      ): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    }
  }
  
  trait CurveToCommand extends StObject {
    
    var code: c_ | C
    
    var command: curveto
    
    var relative: js.UndefOr[Boolean] = js.undefined
    
    var x: Double
    
    var x1: Double
    
    var x2: Double
    
    var y: Double
    
    var y1: Double
    
    var y2: Double
  }
  object CurveToCommand {
    
    inline def apply(code: c_ | C, x: Double, x1: Double, x2: Double, y: Double, y1: Double, y2: Double): CurveToCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "curveto", x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurveToCommand]
    }
    
    extension [Self <: CurveToCommand](x: Self) {
      
      inline def setCode(value: c_ | C): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: curveto): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait EllipticalArcCommand extends StObject {
    
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
    
    inline def apply(
      code: a_ | A,
      largeArc: Boolean,
      rx: Double,
      ry: Double,
      sweep: Boolean,
      x: Double,
      xAxisRotation: Double,
      y: Double
    ): EllipticalArcCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "elliptical arc", largeArc = largeArc.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], sweep = sweep.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xAxisRotation = xAxisRotation.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[EllipticalArcCommand]
    }
    
    extension [Self <: EllipticalArcCommand](x: Self) {
      
      inline def setCode(value: a_ | A): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: `elliptical arc`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setLargeArc(value: Boolean): Self = StObject.set(x, "largeArc", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setSweep(value: Boolean): Self = StObject.set(x, "sweep", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXAxisRotation(value: Double): Self = StObject.set(x, "xAxisRotation", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait HorizontalLineToCommand extends StObject {
    
    var code: h_ | H
    
    var command: `horizontal lineto`
    
    var relative: js.UndefOr[Boolean] = js.undefined
    
    var x: Double
  }
  object HorizontalLineToCommand {
    
    inline def apply(code: h_ | H, x: Double): HorizontalLineToCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "horizontal lineto", x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalLineToCommand]
    }
    
    extension [Self <: HorizontalLineToCommand](x: Self) {
      
      inline def setCode(value: h_ | H): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: `horizontal lineto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    }
  }
  
  trait LineToCommand extends StObject {
    
    var code: l_ | L
    
    var command: lineto
    
    var relative: js.UndefOr[Boolean] = js.undefined
    
    var x: Double
    
    var y: Double
  }
  object LineToCommand {
    
    inline def apply(code: l_ | L, x: Double, y: Double): LineToCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "lineto", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineToCommand]
    }
    
    extension [Self <: LineToCommand](x: Self) {
      
      inline def setCode(value: l_ | L): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: lineto): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait MoveToCommand extends StObject {
    
    var code: m_ | M
    
    var command: moveto
    
    var relative: js.UndefOr[Boolean] = js.undefined
    
    var x: Double
    
    var y: Double
  }
  object MoveToCommand {
    
    inline def apply(code: m_ | M, x: Double, y: Double): MoveToCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "moveto", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveToCommand]
    }
    
    extension [Self <: MoveToCommand](x: Self) {
      
      inline def setCode(value: m_ | M): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: moveto): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait QuadraticCurveToCommand extends StObject {
    
    var code: q_ | Q
    
    var command: `quadratic curveto`
    
    var relative: js.UndefOr[Boolean] = js.undefined
    
    var x: Double
    
    var x1: Double
    
    var y: Double
    
    var y1: Double
  }
  object QuadraticCurveToCommand {
    
    inline def apply(code: q_ | Q, x: Double, x1: Double, y: Double, y1: Double): QuadraticCurveToCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "quadratic curveto", x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuadraticCurveToCommand]
    }
    
    extension [Self <: QuadraticCurveToCommand](x: Self) {
      
      inline def setCode(value: q_ | Q): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: `quadratic curveto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    }
  }
  
  trait SmoothCurveToCommand extends StObject {
    
    var code: s_ | S
    
    var command: `smooth curveto`
    
    var relative: js.UndefOr[Boolean] = js.undefined
    
    var x: Double
    
    var x2: Double
    
    var y: Double
    
    var y2: Double
  }
  object SmoothCurveToCommand {
    
    inline def apply(code: s_ | S, x: Double, x2: Double, y: Double, y2: Double): SmoothCurveToCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "smooth curveto", x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmoothCurveToCommand]
    }
    
    extension [Self <: SmoothCurveToCommand](x: Self) {
      
      inline def setCode(value: s_ | S): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: `smooth curveto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait SmoothQuadraticCurveToCommand extends StObject {
    
    var code: t_ | T
    
    var command: `smooth quadratic curveto`
    
    var relative: js.UndefOr[Boolean] = js.undefined
    
    var x: Double
    
    var y: Double
  }
  object SmoothQuadraticCurveToCommand {
    
    inline def apply(code: t_ | T, x: Double, y: Double): SmoothQuadraticCurveToCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "smooth quadratic curveto", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmoothQuadraticCurveToCommand]
    }
    
    extension [Self <: SmoothQuadraticCurveToCommand](x: Self) {
      
      inline def setCode(value: t_ | T): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: `smooth quadratic curveto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait VerticalLineToCommand extends StObject {
    
    var code: v_ | V
    
    var command: `vertical lineto`
    
    var relative: js.UndefOr[Boolean] = js.undefined
    
    var y: Double
  }
  object VerticalLineToCommand {
    
    inline def apply(code: v_ | V, y: Double): VerticalLineToCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "vertical lineto", y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerticalLineToCommand]
    }
    
    extension [Self <: VerticalLineToCommand](x: Self) {
      
      inline def setCode(value: v_ | V): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: `vertical lineto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
