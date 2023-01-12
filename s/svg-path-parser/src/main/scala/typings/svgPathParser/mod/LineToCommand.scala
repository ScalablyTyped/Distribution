package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.L
import typings.svgPathParser.svgPathParserStrings.l_
import typings.svgPathParser.svgPathParserStrings.lineto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineToCommand
  extends StObject
     with BaseCommand
     with Command {
  
  @JSName("code")
  var code_LineToCommand: l_ | L
  
  @JSName("command")
  var command_LineToCommand: lineto
  
  var x: Double
  
  var y: Double
}
object LineToCommand {
  
  inline def apply(code: l_ | L, x: Double, y: Double): LineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "lineto", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineToCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineToCommand] (val x: Self) extends AnyVal {
    
    inline def setCode(value: l_ | L): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: lineto): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
