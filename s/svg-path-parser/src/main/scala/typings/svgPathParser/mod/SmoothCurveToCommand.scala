package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.S
import typings.svgPathParser.svgPathParserStrings.`smooth curveto`
import typings.svgPathParser.svgPathParserStrings.s_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmoothCurveToCommand
  extends StObject
     with BaseCommand
     with Command {
  
  @JSName("code")
  var code_SmoothCurveToCommand: s_ | S
  
  @JSName("command")
  var command_SmoothCurveToCommand: `smooth curveto`
  
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
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
