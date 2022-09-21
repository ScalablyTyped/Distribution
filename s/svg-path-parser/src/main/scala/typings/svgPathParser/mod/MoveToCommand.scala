package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.M
import typings.svgPathParser.svgPathParserStrings.m_
import typings.svgPathParser.svgPathParserStrings.moveto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveToCommand
  extends StObject
     with BaseCommand
     with Command {
  
  @JSName("code")
  var code_MoveToCommand: m_ | M
  
  @JSName("command")
  var command_MoveToCommand: moveto
  
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
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
