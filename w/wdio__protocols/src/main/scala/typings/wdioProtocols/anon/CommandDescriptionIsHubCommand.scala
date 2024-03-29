package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandDescriptionIsHubCommand extends StObject {
  
  var command: String
  
  var description: String
  
  var isHubCommand: Boolean
  
  var parameters: js.Array[scala.Nothing]
  
  var ref: String
  
  var variables: js.Array[DescriptionName]
}
object CommandDescriptionIsHubCommand {
  
  inline def apply(
    command: String,
    description: String,
    isHubCommand: Boolean,
    parameters: js.Array[scala.Nothing],
    ref: String,
    variables: js.Array[DescriptionName]
  ): CommandDescriptionIsHubCommand = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isHubCommand = isHubCommand.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandDescriptionIsHubCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandDescriptionIsHubCommand] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIsHubCommand(value: Boolean): Self = StObject.set(x, "isHubCommand", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[scala.Nothing]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: scala.Nothing*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: js.Array[DescriptionName]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: DescriptionName*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
