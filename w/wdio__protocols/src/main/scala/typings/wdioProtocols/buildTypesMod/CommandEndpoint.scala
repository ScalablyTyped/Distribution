package typings.wdioProtocols.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandEndpoint extends StObject {
  
  /**
    * command name
    */
  var command: String
  
  /**
    * command description
    */
  var description: js.UndefOr[String] = js.undefined
  
  var examples: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  /**
    * set to true if command is only supported in Selenium Hub Node
    */
  var isHubCommand: js.UndefOr[Boolean] = js.undefined
  
  /**
    * supported command parameters
    */
  var parameters: js.Array[CommandParameters]
  
  /**
    * link to specification reference
    */
  var ref: String
  
  /**
    * information on return data
    */
  var returns: js.UndefOr[CommandReturnObject] = js.undefined
  
  /**
    * supported environments
    */
  var support: js.UndefOr[SupportedEnvironments] = js.undefined
  
  /**
    * variables within the command path (e.g. /:sessionId/element)
    */
  var variables: js.UndefOr[js.Array[CommandPathVariables]] = js.undefined
}
object CommandEndpoint {
  
  inline def apply(command: String, parameters: js.Array[CommandParameters], ref: String): CommandEndpoint = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandEndpoint] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExamples(value: js.Array[js.Array[String]]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setExamplesVarargs(value: js.Array[String]*): Self = StObject.set(x, "examples", js.Array(value*))
    
    inline def setIsHubCommand(value: Boolean): Self = StObject.set(x, "isHubCommand", value.asInstanceOf[js.Any])
    
    inline def setIsHubCommandUndefined: Self = StObject.set(x, "isHubCommand", js.undefined)
    
    inline def setParameters(value: js.Array[CommandParameters]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: CommandParameters*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setReturns(value: CommandReturnObject): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
    
    inline def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
    
    inline def setSupport(value: SupportedEnvironments): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
    
    inline def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
    
    inline def setVariables(value: js.Array[CommandPathVariables]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    
    inline def setVariablesVarargs(value: CommandPathVariables*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
