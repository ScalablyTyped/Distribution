package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandStringDescriptionStringParametersArray extends StObject {
  
  var command: String
  
  var description: String
  
  var parameters: js.Array[NameRequired]
  
  var ref: String
  
  var support: IosUIAutomation
}
object CommandStringDescriptionStringParametersArray {
  
  inline def apply(
    command: String,
    description: String,
    parameters: js.Array[NameRequired],
    ref: String,
    support: IosUIAutomation
  ): CommandStringDescriptionStringParametersArray = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandStringDescriptionStringParametersArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandStringDescriptionStringParametersArray] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[NameRequired]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: NameRequired*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setSupport(value: IosUIAutomation): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
  }
}
