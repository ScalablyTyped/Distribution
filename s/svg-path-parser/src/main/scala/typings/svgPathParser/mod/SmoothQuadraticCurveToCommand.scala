package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.T
import typings.svgPathParser.svgPathParserStrings.`smooth quadratic curveto`
import typings.svgPathParser.svgPathParserStrings.t_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmoothQuadraticCurveToCommand
  extends StObject
     with BaseCommand
     with Command {
  
  @JSName("code")
  var code_SmoothQuadraticCurveToCommand: t_ | T
  
  @JSName("command")
  var command_SmoothQuadraticCurveToCommand: `smooth quadratic curveto`
  
  var x: Double
  
  var y: Double
}
object SmoothQuadraticCurveToCommand {
  
  inline def apply(code: t_ | T, x: Double, y: Double): SmoothQuadraticCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "smooth quadratic curveto", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmoothQuadraticCurveToCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmoothQuadraticCurveToCommand] (val x: Self) extends AnyVal {
    
    inline def setCode(value: t_ | T): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: `smooth quadratic curveto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
