package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandString extends StObject {
  
  var command: String
  
  var parameters: js.Array[Description | Required]
  
  var ref: String
}
object CommandString {
  
  inline def apply(command: String, parameters: js.Array[Description | Required], ref: String): CommandString = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandString] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[Description | Required]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (Description | Required)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
