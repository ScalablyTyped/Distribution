package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefSupportVariables extends StObject {
  
  var command: String
  
  var description: String
  
  var parameters: js.Array[Description]
  
  var ref: String
  
  var support: IosUIAutomation
  
  var variables: js.Array[DescriptionName]
}
object RefSupportVariables {
  
  inline def apply(
    command: String,
    description: String,
    parameters: js.Array[Description],
    ref: String,
    support: IosUIAutomation,
    variables: js.Array[DescriptionName]
  ): RefSupportVariables = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefSupportVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefSupportVariables] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[Description]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Description*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setSupport(value: IosUIAutomation): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: js.Array[DescriptionName]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: DescriptionName*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
