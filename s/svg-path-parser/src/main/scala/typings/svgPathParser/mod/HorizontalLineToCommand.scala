package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.H
import typings.svgPathParser.svgPathParserStrings.`horizontal lineto`
import typings.svgPathParser.svgPathParserStrings.h_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalLineToCommand
  extends StObject
     with BaseCommand
     with Command {
  
  @JSName("code")
  var code_HorizontalLineToCommand: h_ | H
  
  @JSName("command")
  var command_HorizontalLineToCommand: `horizontal lineto`
  
  var x: Double
}
object HorizontalLineToCommand {
  
  inline def apply(code: h_ | H, x: Double): HorizontalLineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "horizontal lineto", x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalLineToCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HorizontalLineToCommand] (val x: Self) extends AnyVal {
    
    inline def setCode(value: h_ | H): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: `horizontal lineto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
