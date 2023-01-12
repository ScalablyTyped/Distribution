package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.Q
import typings.svgPathParser.svgPathParserStrings.`quadratic curveto`
import typings.svgPathParser.svgPathParserStrings.q_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuadraticCurveToCommand
  extends StObject
     with BaseCommand
     with Command {
  
  @JSName("code")
  var code_QuadraticCurveToCommand: q_ | Q
  
  @JSName("command")
  var command_QuadraticCurveToCommand: `quadratic curveto`
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuadraticCurveToCommand] (val x: Self) extends AnyVal {
    
    inline def setCode(value: q_ | Q): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: `quadratic curveto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
  }
}
