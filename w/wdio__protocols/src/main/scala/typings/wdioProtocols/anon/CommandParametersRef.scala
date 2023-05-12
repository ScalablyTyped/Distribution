package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandParametersRef extends StObject {
  
  var command: String
  
  var parameters: js.Array[Description]
  
  var ref: String
}
object CommandParametersRef {
  
  inline def apply(command: String, parameters: js.Array[Description], ref: String): CommandParametersRef = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandParametersRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandParametersRef] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[Description]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Description*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
