package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsHubCommandParameters extends StObject {
  
  var command: String
  
  var description: String
  
  var isHubCommand: Boolean
  
  var parameters: js.Array[Description]
  
  var ref: String
  
  var returns: Name
}
object IsHubCommandParameters {
  
  inline def apply(
    command: String,
    description: String,
    isHubCommand: Boolean,
    parameters: js.Array[Description],
    ref: String,
    returns: Name
  ): IsHubCommandParameters = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isHubCommand = isHubCommand.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHubCommandParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsHubCommandParameters] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIsHubCommand(value: Boolean): Self = StObject.set(x, "isHubCommand", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[Description]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Description*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setReturns(value: Name): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
  }
}
