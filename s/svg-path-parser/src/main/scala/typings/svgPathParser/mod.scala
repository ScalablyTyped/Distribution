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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svg-path-parser", "makeAbsolute")
  @js.native
  def makeAbsolute(commands: js.Array[Command]): js.Array[Command] = js.native
  
  @JSImport("svg-path-parser", "parseSVG")
  @js.native
  def parseSVG(input: String): js.Array[Command] = js.native
  
  @js.native
  trait ClosePathCommand extends StObject {
    
    var code: z_ | Z = js.native
    
    var command: closepath = js.native
    
    var relative: js.UndefOr[Boolean] = js.native
  }
  object ClosePathCommand {
    
    @scala.inline
    def apply(code: z_ | Z, command: closepath): ClosePathCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClosePathCommand]
    }
    
    @scala.inline
    implicit class ClosePathCommandMutableBuilder[Self <: ClosePathCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: z_ | Z): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand(value: closepath): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    }
  }
  
  @js.native
  trait Command extends StObject {
    
    var code: m_ | M | l_ | L | h_ | H | v_ | V | c_ | C | s_ | S | q_ | Q | t_ | T | a_ | A | z_ | Z = js.native
    
    var command: moveto | lineto | (`horizontal lineto`) | (`vertical lineto`) | curveto | (`smooth curveto`) | (`quadratic curveto`) | (`smooth quadratic curveto`) | (`elliptical arc`) | closepath = js.native
    
    var relative: js.UndefOr[Boolean] = js.native
  }
  object Command {
    
    @scala.inline
    def apply(
      code: m_ | M | l_ | L | h_ | H | v_ | V | c_ | C | s_ | S | q_ | Q | t_ | T | a_ | A | z_ | Z,
      command: moveto | lineto | (`horizontal lineto`) | (`vertical lineto`) | curveto | (`smooth curveto`) | (`quadratic curveto`) | (`smooth quadratic curveto`) | (`elliptical arc`) | closepath
    ): Command = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    @scala.inline
    implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: m_ | M | l_ | L | h_ | H | v_ | V | c_ | C | s_ | S | q_ | Q | t_ | T | a_ | A | z_ | Z): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand(
        value: moveto | lineto | (`horizontal lineto`) | (`vertical lineto`) | curveto | (`smooth curveto`) | (`quadratic curveto`) | (`smooth quadratic curveto`) | (`elliptical arc`) | closepath
      ): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    }
  }
  
  @js.native
  trait CurveToCommand extends StObject {
    
    var code: c_ | C = js.native
    
    var command: curveto = js.native
    
    var relative: js.UndefOr[Boolean] = js.native
    
    var x: Double = js.native
    
    var x1: Double = js.native
    
    var x2: Double = js.native
    
    var y: Double = js.native
    
    var y1: Double = js.native
    
    var y2: Double = js.native
  }
  object CurveToCommand {
    
    @scala.inline
    def apply(
      code: c_ | C,
      command: curveto,
      x: Double,
      x1: Double,
      x2: Double,
      y: Double,
      y1: Double,
      y2: Double
    ): CurveToCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurveToCommand]
    }
    
    @scala.inline
    implicit class CurveToCommandMutableBuilder[Self <: CurveToCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: c_ | C): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand(value: curveto): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EllipticalArcCommand extends StObject {
    
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
    implicit class EllipticalArcCommandMutableBuilder[Self <: EllipticalArcCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: a_ | A): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand(value: `elliptical arc`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeArc(value: Boolean): Self = StObject.set(x, "largeArc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSweep(value: Boolean): Self = StObject.set(x, "sweep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXAxisRotation(value: Double): Self = StObject.set(x, "xAxisRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HorizontalLineToCommand extends StObject {
    
    var code: h_ | H = js.native
    
    var command: `horizontal lineto` = js.native
    
    var relative: js.UndefOr[Boolean] = js.native
    
    var x: Double = js.native
  }
  object HorizontalLineToCommand {
    
    @scala.inline
    def apply(code: h_ | H, command: `horizontal lineto`, x: Double): HorizontalLineToCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalLineToCommand]
    }
    
    @scala.inline
    implicit class HorizontalLineToCommandMutableBuilder[Self <: HorizontalLineToCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: h_ | H): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand(value: `horizontal lineto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LineToCommand extends StObject {
    
    var code: l_ | L = js.native
    
    var command: lineto = js.native
    
    var relative: js.UndefOr[Boolean] = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object LineToCommand {
    
    @scala.inline
    def apply(code: l_ | L, command: lineto, x: Double, y: Double): LineToCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineToCommand]
    }
    
    @scala.inline
    implicit class LineToCommandMutableBuilder[Self <: LineToCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: l_ | L): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand(value: lineto): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MoveToCommand extends StObject {
    
    var code: m_ | M = js.native
    
    var command: moveto = js.native
    
    var relative: js.UndefOr[Boolean] = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object MoveToCommand {
    
    @scala.inline
    def apply(code: m_ | M, command: moveto, x: Double, y: Double): MoveToCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveToCommand]
    }
    
    @scala.inline
    implicit class MoveToCommandMutableBuilder[Self <: MoveToCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: m_ | M): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand(value: moveto): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QuadraticCurveToCommand extends StObject {
    
    var code: q_ | Q = js.native
    
    var command: `quadratic curveto` = js.native
    
    var relative: js.UndefOr[Boolean] = js.native
    
    var x: Double = js.native
    
    var x1: Double = js.native
    
    var y: Double = js.native
    
    var y1: Double = js.native
  }
  object QuadraticCurveToCommand {
    
    @scala.inline
    def apply(code: q_ | Q, command: `quadratic curveto`, x: Double, x1: Double, y: Double, y1: Double): QuadraticCurveToCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuadraticCurveToCommand]
    }
    
    @scala.inline
    implicit class QuadraticCurveToCommandMutableBuilder[Self <: QuadraticCurveToCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: q_ | Q): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand(value: `quadratic curveto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SmoothCurveToCommand extends StObject {
    
    var code: s_ | S = js.native
    
    var command: `smooth curveto` = js.native
    
    var relative: js.UndefOr[Boolean] = js.native
    
    var x: Double = js.native
    
    var x2: Double = js.native
    
    var y: Double = js.native
    
    var y2: Double = js.native
  }
  object SmoothCurveToCommand {
    
    @scala.inline
    def apply(code: s_ | S, command: `smooth curveto`, x: Double, x2: Double, y: Double, y2: Double): SmoothCurveToCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmoothCurveToCommand]
    }
    
    @scala.inline
    implicit class SmoothCurveToCommandMutableBuilder[Self <: SmoothCurveToCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: s_ | S): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand(value: `smooth curveto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SmoothQuadraticCurveToCommand extends StObject {
    
    var code: t_ | T = js.native
    
    var command: `smooth quadratic curveto` = js.native
    
    var relative: js.UndefOr[Boolean] = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object SmoothQuadraticCurveToCommand {
    
    @scala.inline
    def apply(code: t_ | T, command: `smooth quadratic curveto`, x: Double, y: Double): SmoothQuadraticCurveToCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmoothQuadraticCurveToCommand]
    }
    
    @scala.inline
    implicit class SmoothQuadraticCurveToCommandMutableBuilder[Self <: SmoothQuadraticCurveToCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: t_ | T): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand(value: `smooth quadratic curveto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VerticalLineToCommand extends StObject {
    
    var code: v_ | V = js.native
    
    var command: `vertical lineto` = js.native
    
    var relative: js.UndefOr[Boolean] = js.native
    
    var y: Double = js.native
  }
  object VerticalLineToCommand {
    
    @scala.inline
    def apply(code: v_ | V, command: `vertical lineto`, y: Double): VerticalLineToCommand = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerticalLineToCommand]
    }
    
    @scala.inline
    implicit class VerticalLineToCommandMutableBuilder[Self <: VerticalLineToCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: v_ | V): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand(value: `vertical lineto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
