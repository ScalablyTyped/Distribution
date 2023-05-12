package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandParametersRefReturns extends StObject {
  
  var command: String
  
  var parameters: js.Array[scala.Nothing]
  
  var ref: String
  
  var returns: Type
}
object CommandParametersRefReturns {
  
  inline def apply(command: String, parameters: js.Array[scala.Nothing], ref: String, returns: Type): CommandParametersRefReturns = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandParametersRefReturns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandParametersRefReturns] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[scala.Nothing]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: scala.Nothing*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setReturns(value: Type): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
  }
}
