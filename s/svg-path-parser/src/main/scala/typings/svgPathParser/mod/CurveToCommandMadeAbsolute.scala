package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserBooleans.`false`
import typings.svgPathParser.svgPathParserStrings.C
import typings.svgPathParser.svgPathParserStrings.curveto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurveToCommandMadeAbsolute
  extends StObject
     with BaseCommand
     with CommandMadeAbsolute {
  
  @JSName("code")
  var code_CurveToCommandMadeAbsolute: C
  
  @JSName("command")
  var command_CurveToCommandMadeAbsolute: curveto
  
  @JSName("relative")
  var relative_CurveToCommandMadeAbsolute: `false`
  
  var x: Double
  
  var x0: Double
  
  var x1: Double
  
  var x2: Double
  
  var y: Double
  
  var y0: Double
  
  var y1: Double
  
  var y2: Double
}
object CurveToCommandMadeAbsolute {
  
  inline def apply(x: Double, x0: Double, x1: Double, x2: Double, y: Double, y0: Double, y1: Double, y2: Double): CurveToCommandMadeAbsolute = {
    val __obj = js.Dynamic.literal(code = "C", command = "curveto", relative = false, x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurveToCommandMadeAbsolute]
  }
  
  extension [Self <: CurveToCommandMadeAbsolute](x: Self) {
    
    inline def setCode(value: C): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: curveto): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: `false`): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
