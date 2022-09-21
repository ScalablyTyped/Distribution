package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserBooleans.`false`
import typings.svgPathParser.svgPathParserStrings.Q
import typings.svgPathParser.svgPathParserStrings.`quadratic curveto`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuadraticCurveToCommandMadeAbsolute
  extends StObject
     with BaseCommand
     with CommandMadeAbsolute {
  
  @JSName("code")
  var code_QuadraticCurveToCommandMadeAbsolute: Q
  
  @JSName("command")
  var command_QuadraticCurveToCommandMadeAbsolute: `quadratic curveto`
  
  @JSName("relative")
  var relative_QuadraticCurveToCommandMadeAbsolute: `false`
  
  var x: Double
  
  var x0: Double
  
  var x1: Double
  
  var y: Double
  
  var y0: Double
  
  var y1: Double
}
object QuadraticCurveToCommandMadeAbsolute {
  
  inline def apply(x: Double, x0: Double, x1: Double, y: Double, y0: Double, y1: Double): QuadraticCurveToCommandMadeAbsolute = {
    val __obj = js.Dynamic.literal(code = "Q", command = "quadratic curveto", relative = false, x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadraticCurveToCommandMadeAbsolute]
  }
  
  extension [Self <: QuadraticCurveToCommandMadeAbsolute](x: Self) {
    
    inline def setCode(value: Q): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: `quadratic curveto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: `false`): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
  }
}
