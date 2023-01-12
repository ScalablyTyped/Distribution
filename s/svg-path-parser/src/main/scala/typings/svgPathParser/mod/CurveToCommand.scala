package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.C
import typings.svgPathParser.svgPathParserStrings.c_
import typings.svgPathParser.svgPathParserStrings.curveto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurveToCommand
  extends StObject
     with BaseCommand
     with Command {
  
  @JSName("code")
  var code_CurveToCommand: c_ | C
  
  @JSName("command")
  var command_CurveToCommand: curveto
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurveToCommand] (val x: Self) extends AnyVal {
    
    inline def setCode(value: c_ | C): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: curveto): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
