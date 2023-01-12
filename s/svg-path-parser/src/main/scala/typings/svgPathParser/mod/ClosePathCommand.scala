package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.Z
import typings.svgPathParser.svgPathParserStrings.closepath
import typings.svgPathParser.svgPathParserStrings.z_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosePathCommand
  extends StObject
     with BaseCommand
     with Command {
  
  @JSName("code")
  var code_ClosePathCommand: z_ | Z
  
  @JSName("command")
  var command_ClosePathCommand: closepath
}
object ClosePathCommand {
  
  inline def apply(code: z_ | Z): ClosePathCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "closepath")
    __obj.asInstanceOf[ClosePathCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClosePathCommand] (val x: Self) extends AnyVal {
    
    inline def setCode(value: z_ | Z): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: closepath): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
